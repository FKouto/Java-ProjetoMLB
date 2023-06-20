package model.dao;

import model.bean.Paciente;
import database.ConexaoBD;
import java.sql.*;
import model.bean.Endereco;
import model.bean.Telefone;

public class PacienteDAO {

    // Verifica se o usuário existe no banco de dados
    public boolean existe(Paciente paciente) throws Exception {
        String sql = "SELECT * FROM paciente WHERE email = ? AND senha = ?";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, paciente.getEmail());
            ps.setString(2, paciente.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    // Obter Paciente
    public boolean obterPacienteDash(Paciente paciente) throws Exception {
        String sql = "SELECT * FROM paciente WHERE email = ?";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, paciente.getEmail());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    /*Realizando o CRUD(CREATE, READ, UPDATE AND DELETE)*/
    // CREATE
    // CREATE TELEFONE
    public void createTelefonePaciente(Telefone telefone) throws SQLException {
        Connection conn = null;
        PreparedStatement create = null;

        try {
            // Obtem conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando o SQL para inserir Paciente
            String sql = "INSERT INTO telefone_paciente (celular) VALUES (?)";
            create = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            create.setString(1, telefone.getNumero());

            // Executa a inserção
            create.executeUpdate();

            // Obtém a chave gerada para telefone
            ResultSet generatedKeys = create.getGeneratedKeys();
            generatedKeys.next();
            int idTel = generatedKeys.getInt(1);
            telefone.setCodTel(idTel);

            System.out.println("Telefone inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir telefone do paciente: " + e.getMessage());
        } finally {
            if (create != null) {
                create.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    // CREATE ENDERECO
    public void createEnderecoPaciente(Endereco endereco) throws SQLException {
        Connection conn = null;
        PreparedStatement create = null;

        try {
            // Obtem conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando o SQL para inserir Paciente
            String sql = "INSERT INTO endereco_paciente (rua, bairro, cidade, estado, cep) VALUES (?,?,?,?,?)";
            create = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            create.setString(1, endereco.getRua());
            create.setString(2, endereco.getBairro());
            create.setString(3, endereco.getCidade());
            create.setString(4, endereco.getEstado());
            create.setInt(5, endereco.getCep());

            // Executa a inserção
            create.executeUpdate();

            // Obtém a chave gerada para Endereco
            ResultSet generatedKeys = create.getGeneratedKeys();
            generatedKeys.next();
            int idEndereco = generatedKeys.getInt(1);
            endereco.setCodEndereco(idEndereco);

            System.out.println("Endereço inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir endereço do paciente: " + e.getMessage());
        } finally {
            if (create != null) {
                create.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    // CREATE PACIENTE
    public void createPaciente(Paciente paciente) throws SQLException {
        Connection conn = null;
        PreparedStatement create = null;
        try {
            // Obter conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando o SQL para inserir o Paciente
            String sql = "INSERT INTO paciente (nome, cpf, email, senha, cod_tel, cod_endereco) VALUES (?,?,?,?,?,?)";
            String idTel = "SELECT cod_tel FROM telefone_paciente ORDER BY cod_tel DESC LIMIT 1";
            String idEnd = "SELECT cod_endereco FROM endereco_paciente ORDER BY cod_endereco DESC LIMIT 1";

            // PreparedStatement com retorno das últimas chaves geradas
            create = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            // Obter o ID do telefone mais recente
            int codTel = -1; // valor padrão caso a consulta não retorne nenhum resultado
            Statement stmtTel = conn.createStatement();
            ResultSet rsTel = stmtTel.executeQuery(idTel);
            if (rsTel.next()) {
                codTel = rsTel.getInt("cod_tel");
            }

            // Obter o ID do endereço mais recente
            int codEndereco = -1; // valor padrão caso a consulta não retorne nenhum resultado
            Statement stmtEnd = conn.createStatement();
            ResultSet rsEnd = stmtEnd.executeQuery(idEnd);
            if (rsEnd.next()) {
                codEndereco = rsEnd.getInt("cod_endereco");
            }

            // Parametros de valor para create
            create.setString(1, paciente.getNome());
            create.setInt(2, paciente.getCpf());
            create.setString(3, paciente.getEmail());
            create.setString(4, paciente.getSenha());
            create.setInt(5, codTel);
            create.setInt(6, codEndereco);

            // Executa a inserção
            create.executeUpdate();

            // Obtém a chave gerada e atribui a ID
            ResultSet generatedKeys = create.getGeneratedKeys();
            if (generatedKeys.next()) {
                int idPessoa = generatedKeys.getInt(1);
                paciente.setIdPessoa(idPessoa);
            }

            System.out.println("Paciente inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir paciente: " + e.getMessage());
        } finally {
            // Fecha os recursos
            if (create != null) {
                create.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    // UPDATE
    // UPDATE PACIENTE
    public void updatePaciente(Paciente paciente) throws SQLException {
        Connection conn = null;
        PreparedStatement update = null;

        try {
            // Obter conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando SQL para o Update
            String sql = "UPDATE paciente "
                    + "SET nome = IF(? <> '', ?, nome),"
                    + "    cpf = IF(? <> 0, ?, cpf), "
                    + "    senha = IF(? <> '', ?, senha)"
                    + "WHERE email = ?";

            // Preparando o Statement
            update = conn.prepareStatement(sql);

            // Definir os valores dos parâmetros
            update.setString(1, paciente.getNome());
            update.setString(2, paciente.getNome());
            update.setLong(3, paciente.getCpf());
            update.setLong(4, paciente.getCpf());
            update.setString(5, paciente.getSenha());
            update.setString(6, paciente.getSenha());
            update.setString(7, paciente.getEmail());

            // Executa o Update
            update.executeUpdate();

            System.out.println("Paciente atualizado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar paciente: " + e.getMessage());
        } finally {
            // Fechar os recursos
            if (update != null) {
                update.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    // UPDATE TELEFONE PACIENTE
    public void updateTelefonePaciente(String email, Telefone telefone) throws SQLException {
        Connection conn = null;
        PreparedStatement update = null;

        try {
            // Obter conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando SQL para o Update
            String sql = "UPDATE telefone_paciente "
                    + "SET celular = ? "
                    + "WHERE cod_tel = (SELECT cod_tel FROM paciente WHERE email = ?)";

            // Preparando o Statement
            update = conn.prepareStatement(sql);

            // Definindo os valores a serem recebidos
            update.setString(1, telefone.getNumero());
            update.setString(2, email);

            // Executa o Update
            update.executeUpdate();

            System.out.println("Telefone do paciente atualizado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar telefone do paciente: " + e.getMessage());
        } finally {
            // Fechar os recursos
            if (update != null) {
                update.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    // UPDATE ENDERECO PACIENTE
    public void updateEnderecoPaciente(String email, Endereco endereco) throws SQLException {
        Connection conn = null;
        PreparedStatement update = null;

        try {
            // Obter conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando SQL para o Update
            String sql = "UPDATE endereco_paciente "
                    + "SET rua = ?, "
                    + "    bairro = ?, "
                    + "    cidade = ?, "
                    + "    estado = ?, "
                    + "    cep = ? "
                    + "WHERE cod_endereco = (SELECT cod_endereco FROM paciente WHERE email = ?)";

            // Preparando o Statement
            update = conn.prepareStatement(sql);

            // Definindo os valores a serem recebidos
            update.setString(1, endereco.getRua());
            update.setString(2, endereco.getBairro());
            update.setString(3, endereco.getCidade());
            update.setString(4, endereco.getEstado());
            update.setInt(5, endereco.getCep());
            update.setString(6, email);

            // Executa o Update
            update.executeUpdate();

            System.out.println("Endereço do paciente atualizado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar endereço do paciente: " + e.getMessage());
        } finally {
            // Fechar os recursos
            if (update != null) {
                update.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    // DELETE PACIENTE
    public boolean deletePaciente(String email, Paciente paciente) throws SQLException {
        Connection conn = null;
        PreparedStatement delete = null;

        try {
            // Obter conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando SQL para o Delete
            String sql = "DELETE endereco_paciente, telefone_paciente, paciente "
                    + "FROM endereco_paciente "
                    + "JOIN paciente ON endereco_paciente.cod_endereco = paciente.cod_endereco "
                    + "JOIN telefone_paciente ON paciente.cod_tel = telefone_paciente.cod_tel "
                    + "WHERE paciente.email = ?";

            // Preparando o Statement
            delete = conn.prepareStatement(sql);

            // Definindo os valores a serem recebidos
            delete.setString(1, email);

            // Executa o Delete
            int rowsAffected = delete.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Paciente excluído com sucesso");
            } else {
                System.out.println("Nenhum paciente encontrado com o email fornecido");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao excluir paciente: " + e.getMessage());
        } finally {
            // Fechar os recursos
            if (delete != null) {
                delete.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }
    // DELETE PACIENTE pelo funcionario
    public boolean funcDeletePaciente(int idPessoa, Paciente paciente) throws SQLException {
        Connection conn = null;
        PreparedStatement delete = null;

        try {
            // Obter conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando SQL para o Delete
            String sql = "DELETE paciente, telefone_paciente, endereco_paciente "
                    + "FROM paciente "
                    + "INNER JOIN telefone_paciente ON paciente.cod_tel = telefone_paciente.cod_tel "
                    + "INNER JOIN endereco_paciente ON paciente.cod_endereco = endereco_paciente.cod_endereco "
                    + "WHERE paciente.id_paciente = ?";

            // Preparando o Statement
            delete = conn.prepareStatement(sql);

            // Definindo os valores a serem recebidos
            delete.setInt(1, idPessoa);

            // Executa o DELETE
            int rowsAffected = delete.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Paciente excluído com sucesso.");
                return true;
            } else {
                System.out.println("Não foi possível excluir o paciente.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao excluir paciente: " + e.getMessage());
        } finally {
            // Fechar os recursos
            if (delete != null) {
                delete.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }
}

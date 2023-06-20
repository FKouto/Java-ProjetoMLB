package model.dao;

import model.bean.Psiquiatra;
import database.ConexaoBD;
import java.sql.*;
import model.bean.Endereco;
import model.bean.Telefone;

public class PsiquiatraDAO {

    // Verifica se o usuário existe no banco de dados
    public boolean existe(Psiquiatra psiquiatra) throws Exception {
        String sql = "SELECT * FROM psiquiatra WHERE email = ? AND senha = ?";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, psiquiatra.getEmail());
            ps.setString(2, psiquiatra.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    // Obter Psicologo
    public boolean obterPsiquiatraDash(Psiquiatra psiquiatra) throws Exception {
        String sql = "SELECT * FROM psicologo WHERE email = ?";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, psiquiatra.getEmail());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    /*Realizando o CRUD(CREATE, READ, UPDATE AND DELETE)*/
    // CREATE
    // CREATE TELEFONE
    public void createTelefonePsiquiatra(Telefone telefone) throws SQLException {
        Connection conn = null;
        PreparedStatement create = null;

        try {
            // Obtem conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando o SQL para inserir Paciente
            String sql = "INSERT INTO telefone_psiquiatra (comercial) VALUES (?)";
            create = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            create.setString(1, telefone.getNumero());

            // Executa a inserção
            create.executeUpdate();

            // Obtém a chave gerada
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
    public void createEnderecoPsiquiatra(Endereco endereco) throws SQLException {
        Connection conn = null;
        PreparedStatement create = null;

        try {
            // Obtem conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando o SQL para inserir Paciente
            String sql = "INSERT INTO endereco_psiquiatra (rua, bairro, cidade, estado, cep) VALUES (?,?,?,?,?)";
            create = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            create.setString(1, endereco.getRua());
            create.setString(2, endereco.getBairro());
            create.setString(3, endereco.getCidade());
            create.setString(4, endereco.getEstado());
            create.setInt(5, endereco.getCep());

            // Executa a inserção
            create.executeUpdate();

            // Obtém a chave gerada
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

    // CREATE PSIQUIATRA
    public void createPsiquiatra(Psiquiatra psiquiatra) throws SQLException {
        Connection conn = null;
        PreparedStatement create = null;
        try {
            // Obter conexão com banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando o SQL para inserir Psiquiatra
            String sql = "INSERT INTO psiquiatra (nome, numero_conselho, profissionalizacao, tipo_consulta, email, senha, cod_tel, cod_endereco) VALUES(?,?,?,?,?,?,?,?)";
            String idTel = "SELECT cod_tel FROM telefone_psiquiatra ORDER BY cod_tel DESC LIMIT 1";
            String idEnd = "SELECT cod_endereco FROM endereco_psiquiatra ORDER BY cod_endereco DESC LIMIT 1";

            // Criando PreparedStatement com retorno das chaves geradas
            create = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            // Obter o ID do telefone mais recente adicionado
            int codTel = -1;// valor padrão caso a consulta não retorne nenhum resultado
            Statement stmtTel = conn.createStatement();
            ResultSet rsTel = stmtTel.executeQuery(idTel);
            if (rsTel.next()) {
                codTel = rsTel.getInt("cod_tel");
            }

            // Obter o ID do endereco mais recente adicionado
            int codEndereco = -1;// valor padrão caso a consulta não retorne nenhum resultado
            Statement stmtEnd = conn.createStatement();
            ResultSet rsEnd = stmtEnd.executeQuery(idEnd);
            if (rsEnd.next()) {
                codEndereco = rsEnd.getInt("cod_endereco");
            }

            // Parametros de valor para create
            create.setString(1, psiquiatra.getNome());
            create.setInt(2, psiquiatra.getNumConselho());
            create.setString(3, psiquiatra.getProfissionalizacao());
            create.setString(4, psiquiatra.getTipoConsulta());
            create.setString(5, psiquiatra.getEmail());
            create.setString(6, psiquiatra.getSenha());
            create.setInt(7, codTel);
            create.setInt(8, codEndereco);

            //Executa a inserção
            create.executeUpdate();

            // Obtém a chave gerada
            ResultSet generatedKeys = create.getGeneratedKeys();
            if (generatedKeys.next()) {
                int idPessoa = generatedKeys.getInt(1);
                psiquiatra.setIdPessoa(idPessoa);
            }

            System.out.println("Psiquiatra inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir psícologo: " + e.getMessage());
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
    // UPDATE psiquiatra
    public void updatePsiquiatra(Psiquiatra psiquiatra) throws SQLException {
        Connection conn = null;
        PreparedStatement update = null;

        try {
            // Obter conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando SQL para o Update
            String sql = "UPDATE psiquiatra "
                    + "SET nome = IF(? <> '', ?, nome),"
                    + "    numero_conselho = IF(? <> 0, ?, numero_conselho), "
                    + "    profissionalizacao = IF(? <> '', ?, profissionalizacao), "
                    + "    tipo_consulta = IF(? <> '', ?, tipo_consulta), "
                    + "    senha = IF(? <> '', ?, senha)"
                    + "WHERE email = ?";

            // Preparando o Statement
            update = conn.prepareStatement(sql);

            // Definir os valores dos parâmetros
            update.setString(1, psiquiatra.getNome());
            update.setString(2, psiquiatra.getNome());
            update.setInt(3, psiquiatra.getNumConselho());
            update.setInt(4, psiquiatra.getNumConselho());
            update.setString(5, psiquiatra.getProfissionalizacao());
            update.setString(6, psiquiatra.getProfissionalizacao());
            update.setString(7, psiquiatra.getTipoConsulta());
            update.setString(8, psiquiatra.getTipoConsulta());
            update.setString(9, psiquiatra.getSenha());
            update.setString(10, psiquiatra.getSenha());
            update.setString(11, psiquiatra.getEmail());

            // Executa o Update
            update.executeUpdate();

            System.out.println("Psiquiatra atualizado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar psiquiatra: " + e.getMessage());
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

    // UPDATE TELEFONE psiquiatra
    public void updateTelefonePsiquiatra(String email, Telefone telefone) throws SQLException {
        Connection conn = null;
        PreparedStatement update = null;

        try {
            // Obter conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando SQL para o Update
            String sql = "UPDATE telefone_psiquiatra "
                    + "SET comercial = ? "
                    + "WHERE cod_tel = (SELECT cod_tel FROM psiquiatra WHERE email = ?)";

            // Preparando o Statement
            update = conn.prepareStatement(sql);

            // Definindo os valores a serem recebidos
            update.setString(1, telefone.getNumero());
            update.setString(2, email);

            // Executa o Update
            update.executeUpdate();

            System.out.println("Telefone do psiquiatra atualizado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar telefone do psiquiatra: " + e.getMessage());
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
    public void updateEnderecoPsiquiatra(String email, Endereco endereco) throws SQLException {
        Connection conn = null;
        PreparedStatement update = null;

        try {
            // Obter conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando SQL para o Update
            String sql = "UPDATE endereco_psiquiatra "
                    + "SET rua = ?, "
                    + "    bairro = ?, "
                    + "    cidade = ?, "
                    + "    estado = ?, "
                    + "    cep = ? "
                    + "WHERE cod_endereco = (SELECT cod_endereco FROM psiquiatra WHERE email = ?)";

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

            System.out.println("Endereço do psiquiatra atualizado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar endereço do psiquiatra: " + e.getMessage());
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

    // DELETE PSIQUIATRA
    public boolean deletePsiquiatra(String email, Psiquiatra psiquiatra) throws SQLException {
        Connection conn = null;
        PreparedStatement delete = null;

        try {
            // Obter conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando SQL para o Delete
            String sql = "DELETE endereco_psiquiatra, telefone_psiquiatra, psiquiatra "
                    + "FROM endereco_psiquiatra "
                    + "JOIN psiquiatra ON endereco_psiquiatra.cod_endereco = psiquiatra.cod_endereco "
                    + "JOIN telefone_psiquiatra ON psiquiatra.cod_tel = telefone_psiquiatra.cod_tel "
                    + "WHERE psiquiatra.email = ?";

            // Preparando o Statement
            delete = conn.prepareStatement(sql);

            // Definindo os valores a serem recebidos
            delete.setString(1, email);

            // Executa o Delete
            int rowsAffected = delete.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Psiquiatra excluído com sucesso");
            } else {
                System.out.println("Nenhum psiquiatra encontrado com o email fornecido");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao excluir psiquiatra: " + e.getMessage());
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
    // DELETE PSICOLOGO pelo funcionario
    public boolean funcDeletePaciente(int idPessoa, Psiquiatra psiquiatra) throws SQLException {
        Connection conn = null;
        PreparedStatement delete = null;

        try {
            // Obter conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando SQL para o Delete
            String sql = "DELETE psiquiatra, telefone_psiquiatra, endereco_psiquiatra "
                    + "FROM psiquiatra "
                    + "INNER JOIN telefone_psiquiatra ON psiquiatra.cod_tel = telefone_psiquiatra.cod_tel "
                    + "INNER JOIN endereco_psiquiatra ON psiquiatra.cod_endereco = endereco_psiquiatra.cod_endereco "
                    + "WHERE psiquiatra.id_psiquiatra = ?";

            // Preparando o Statement
            delete = conn.prepareStatement(sql);

            // Definindo os valores a serem recebidos
            delete.setInt(1, idPessoa);

            // Executa o DELETE
            int rowsAffected = delete.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Psiquiatra excluído com sucesso.");
                return true;
            } else {
                System.out.println("Não foi possível excluir o psiquiatra.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao excluir psicólogo: " + e.getMessage());
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

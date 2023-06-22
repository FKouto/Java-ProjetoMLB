package model.dao;

import model.bean.Psicologo;
import database.ConexaoBD;
import java.sql.*;
import model.bean.Endereco;
import model.bean.Telefone;

public class PsicologoDAO {

    // Verifica se o usuário existe no banco de dados
    public boolean existe(Psicologo psicologo) throws Exception {
        String sql = "SELECT * FROM paciente WHERE email = ? AND senha = ?";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, psicologo.getEmail());
            ps.setString(2, psicologo.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    // Obter Psicologo
    public boolean obterPsicologoDash(Psicologo psicologo) throws Exception {
        String sql = "SELECT * FROM psicologo WHERE email = ?";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, psicologo.getEmail());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    /*Realizando o CRUD(CREATE, READ, UPDATE AND DELETE)*/
    // CREATE
    // CREATE TELEFONE
    public void createTelefonePsicologo(Telefone telefone) throws SQLException {
        Connection conn = null;
        PreparedStatement create = null;

        try {
            // Obtem conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando o SQL para inserir Paciente
            String sql = "INSERT INTO telefone_psicologo (comercial) VALUES (?)";
            create = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            create.setString(1, telefone.getNumero());

            // Executa a inserção
            create.executeUpdate();

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
    public void createEnderecoPsicologo(Endereco endereco) throws SQLException {
        Connection conn = null;
        PreparedStatement create = null;

        try {
            // Obtem conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando o SQL para inserir Paciente
            String sql = "INSERT INTO endereco_psicologo (rua, bairro, cidade, estado, cep) VALUES (?,?,?,?,?)";
            create = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            create.setString(1, endereco.getRua());
            create.setString(2, endereco.getBairro());
            create.setString(3, endereco.getCidade());
            create.setString(4, endereco.getEstado());
            create.setInt(5, endereco.getCep());

            // Executa a inserção
            create.executeUpdate();

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

    // CREATE PSICOLOGO
    public void createPsicologo(Psicologo psicologo) throws SQLException {
        Connection conn = null;
        PreparedStatement create = null;
        try {
            // Obter conexão com banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando o SQL para inserir Psicologo
            String sql = "INSERT INTO psicologo (nome, numero_conselho, profissionalizacao, tipo_consulta, email, senha, cod_tel, cod_endereco) VALUES(?,?,?,?,?,?,?,?)";
            String idTel = "SELECT cod_tel FROM telefone_psicologo ORDER BY cod_tel DESC LIMIT 1";
            String idEnd = "SELECT cod_endereco FROM endereco_psicologo ORDER BY cod_endereco DESC LIMIT 1";

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
            create.setString(1, psicologo.getNome());
            create.setInt(2, psicologo.getNumConselho());
            create.setString(3, psicologo.getProfissionalizacao());
            create.setString(4, psicologo.getTipoConsulta());
            create.setString(5, psicologo.getEmail());
            create.setString(6, psicologo.getSenha());
            create.setInt(7, codTel);
            create.setInt(8, codEndereco);

            //Executa a inserção
            create.executeUpdate();
            
            System.out.println("Psicólogo inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir psicólogo: " + e.getMessage());
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
    // UPDATE PSICOLOGO
    public void updatePsicologo(Psicologo psicologo) throws SQLException {
        Connection conn = null;
        PreparedStatement update = null;

        try {
            // Obter conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando SQL para o Update
            String sql = "UPDATE psicologo "
                    + "SET nome = IF(? <> '', ?, nome), "
                    + "    numero_conselho = IF(? <> 0, ?, numero_conselho), "
                    + "    profissionalizacao = IF(? <> '', ?, profissionalizacao), "
                    + "    tipo_consulta = IF(? <> '', ?, tipo_consulta), "
                    + "    senha = IF(? <> '', ?, senha)"
                    + "WHERE email = ?";

            // Preparando o Statement
            update = conn.prepareStatement(sql);

            // Definir os valores dos parâmetros
            update.setString(1, psicologo.getNome());
            update.setString(2, psicologo.getNome());
            update.setInt(3, psicologo.getNumConselho());
            update.setInt(4, psicologo.getNumConselho());
            update.setString(5, psicologo.getProfissionalizacao());
            update.setString(6, psicologo.getProfissionalizacao());
            update.setString(7, psicologo.getTipoConsulta());
            update.setString(8, psicologo.getTipoConsulta());
            update.setString(9, psicologo.getSenha());
            update.setString(10, psicologo.getSenha());
            update.setString(11, psicologo.getEmail());

            // Executa o Update
            update.executeUpdate();

            System.out.println("Psicólogo atualizado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar psicólogo: " + e.getMessage());
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

    // UPDATE TELEFONE PSICOLOGO
    public void updateTelefonePsicologo(String email, Telefone telefone) throws SQLException {
        Connection conn = null;
        PreparedStatement update = null;

        try {
            // Obter conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando SQL para o Update
            String sql = "UPDATE telefone_psicologo "
                    + "SET comercial = ? "
                    + "WHERE cod_tel = (SELECT cod_tel FROM psicologo WHERE email = ?)";

            // Preparando o Statement
            update = conn.prepareStatement(sql);

            // Definindo os valores a serem recebidos
            update.setString(1, telefone.getNumero());
            update.setString(2, email);

            // Executa o Update
            update.executeUpdate();

            System.out.println("Telefone do psicologo atualizado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar telefone do psicologo: " + e.getMessage());
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
    public void updateEnderecoPsicologo(String email, Endereco endereco) throws SQLException {
        Connection conn = null;
        PreparedStatement update = null;

        try {
            // Obter conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando SQL para o Update
            String sql = "UPDATE endereco_psicologo "
                    + "SET rua = IF(? <> '', ?, rua),"
                    + "    bairro = IF(? <> '', ?, bairro),"
                    + "    cidade = IF(? <> '', ?, cidade),"
                    + "    estado = IF(? <> '', ?, estado),"
                    + "    cep = IF(? <> 0, ?, cep)"
                    + "WHERE cod_endereco = (SELECT cod_endereco FROM psicologo WHERE email = ?)";

            // Preparando o Statement
            update = conn.prepareStatement(sql);

            // Definindo os valores a serem recebidos
            update.setString(1, endereco.getRua());
            update.setString(2, endereco.getRua());
            update.setString(3, endereco.getBairro());
            update.setString(4, endereco.getBairro());
            update.setString(5, endereco.getCidade());
            update.setString(6, endereco.getCidade());
            update.setString(7, endereco.getEstado());
            update.setString(8, endereco.getEstado());
            update.setInt(9, endereco.getCep());
            update.setInt(10, endereco.getCep());
            update.setString(11, email);

            // Executa o Update
            update.executeUpdate();

            System.out.println("Endereço do psicologo atualizado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar endereço do psicologo: " + e.getMessage());
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
    public boolean deletePsicologo(String email, Psicologo psicologo) throws SQLException {
        Connection conn = null;
        PreparedStatement delete = null;

        try {
            // Obter conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando SQL para o Delete
            String sql = "DELETE endereco_psicologo, telefone_psicologo, psicologo "
                    + "FROM endereco_psicologo "
                    + "JOIN psicologo ON endereco_psicologo.cod_endereco = psicologo.cod_endereco "
                    + "JOIN telefone_psicologo ON psicologo.cod_tel = telefone_psicologo.cod_tel "
                    + "WHERE psicologo.email = ?";

            // Preparando o Statement
            delete = conn.prepareStatement(sql);

            // Definindo os valores a serem recebidos
            delete.setString(1, email);

            // Executa o Delete
            int rowsAffected = delete.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Psicologo excluído com sucesso");
            } else {
                System.out.println("Nenhum psicologo encontrado com o email fornecido");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao excluir psicologo: " + e.getMessage());
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
    public boolean funcDeletePaciente(int idPessoa, Psicologo psicologo) throws SQLException {
        Connection conn = null;
        PreparedStatement delete = null;

        try {
            // Obter conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            // Preparando SQL para o Delete
            String sql = "DELETE psicologo, telefone_psicologo, endereco_psicologo "
                    + "FROM psicologo "
                    + "INNER JOIN telefone_psicologo ON psicologo.cod_tel = telefone_psicologo.cod_tel "
                    + "INNER JOIN endereco_psicologo ON psicologo.cod_endereco = endereco_psicologo.cod_endereco "
                    + "WHERE psicologo.id_psicologo = ?";

            // Preparando o Statement
            delete = conn.prepareStatement(sql);

            // Definindo os valores a serem recebidos
            delete.setInt(1, idPessoa);

            // Executa o DELETE
            int rowsAffected = delete.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Psicólogo excluído com sucesso.");
                return true;
            } else {
                System.out.println("Não foi possível excluir o psicólogo.");
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

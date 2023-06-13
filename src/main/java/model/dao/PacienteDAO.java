package model.dao;

import model.bean.Paciente;
import database.ConexaoBD;
import java.sql.*;
import model.bean.Endereco;
import model.bean.Telefone;

public class PacienteDAO {
    //Verifica se o usuário existe no banco de dados

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

    //Obter nome do usuário com base no e-mail para mostrar Bem-Vindo (nome)...
    public String obterNomePaciente(String email) throws Exception {
        // Variável para armazenar o nome do paciente
        String nomePaciente = null;
        // Consulta SQL para selecionar o nome do paciente com base no email
        String sql = "SELECT nome FROM paciente WHERE email = ?";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            // Obtém o valor da coluna "nome" do resultado da consulta SQL
            ps.setString(1, email);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    // Retorna o nome do paciente obtido da consulta SQL (pode ser nulo se nenhum paciente for encontrado)
                    nomePaciente = rs.getString("nome");
                }
            }
        }
        return nomePaciente;
    }

    //Create
    public void createEndereco(Endereco endereco) throws SQLException {
        Connection conn = null;
        PreparedStatement create = null;

        try {
            //Obtem conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();
            //Preparando o SQL para o inserir Paciente
            String sql = "INSERT INTO endereco_paciente (rua, bairro, cidade, estado, cep) VALUES (?,?,?,?,?)";
            create = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            create.setString(1, endereco.getRua());
            create.setString(2, endereco.getBairro());
            create.setString(3, endereco.getCidade());
            create.setString(4, endereco.getEstado());
            create.setInt(5, endereco.getCep());
            //Executa a inserção
            create.executeUpdate();
            // Obtém a chave gerada
            ResultSet generatedKeys = create.getGeneratedKeys();
            generatedKeys.next();
            int idEndereco = generatedKeys.getInt(1);
            endereco.setCodEndereco(idEndereco);
            System.out.println("Endereço inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir paciente: " + e.getMessage());
        } finally {
            if (create != null) {
                create.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public void createTelefone(Telefone telefone) throws SQLException {
        Connection conn = null;
        PreparedStatement create = null;

        try {
            //Obtem conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();
            //Preparando o SQL para o inserir Paciente
            String sql = "INSERT INTO telefone_paciente (celular) VALUES (?)";
            create = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            create.setString(1, telefone.getNumero());
            //Executa a inserção
            create.executeUpdate();
            // Obtém a chave gerada
            ResultSet generatedKeys = create.getGeneratedKeys();
            generatedKeys.next();
            int idTel = generatedKeys.getInt(1);
            telefone.setCodTel(idTel);

            System.out.println("Telefone inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir paciente: " + e.getMessage());
        }
    }

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

            // Criação do PreparedStatement com retorno das chaves geradas
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

            // Obtém a chave gerada
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

}

package model.dao;

import database.ConexaoBD;
import java.sql.*;
import model.bean.Paciente;

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
    //CRUD
    public String createPaciente(Paciente paciente) throws Exception {
        String sql = "INSERT INTO paciente(nome, cpf, email, senha, cod_tel, cod_endereco) VALUES (?,?,?,?,?,?)";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, paciente.getNome());
            ps.setInt(2, paciente.getCpf());
            ps.setString(3, paciente.getEmail());
            ps.setString(4, paciente.getSenha());
            ps.setInt(5, paciente.getIdTelefone());
            ps.setInt(6, paciente.getIdEndereco());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro."+e.getMessage());
        }
        return null;
    }
}

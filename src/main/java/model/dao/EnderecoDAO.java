package model.dao;

import database.ConexaoBD;
import java.sql.*;
import model.bean.Endereco;

public class EnderecoDAO {

    public String createEndereco(Endereco endereco) throws Exception {
        String sql = "INSERT INTO endereco_paciente (rua, bairro, cidade, estado, cep) VALUES (?,?,?,?,?)";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, endereco.getRua());
            ps.setString(2, endereco.getBairro());
            ps.setString(3, endereco.getCidade());
            ps.setString(4, endereco.getEstado());
            ps.setInt(5, endereco.getCep());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro." + e.getMessage());
        }
        return null;
    }
}

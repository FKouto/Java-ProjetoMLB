package model.dao;

import database.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.Telefone;

public class TelefoneDAO {

    public String createTelefone(Telefone telefone) throws Exception {
        String sql = "INSERT INTO telefone_paciente (celular) VALUES (?)";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, telefone.getTelefone());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro." + e.getMessage());
        }
        return null;
    }
}

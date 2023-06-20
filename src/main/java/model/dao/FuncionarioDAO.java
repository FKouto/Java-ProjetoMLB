package model.dao;

import database.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.bean.Funcionario;

public class FuncionarioDAO {
    // Verifica se o usuário existe no banco de dados
    public boolean existe(Funcionario funcionario) throws Exception {
        String sql = "SELECT * FROM funcionario WHERE email = ? AND senha = ?";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, funcionario.getEmail());
            ps.setString(2, funcionario.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
}

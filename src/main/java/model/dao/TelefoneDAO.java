package model.dao;

import database.ConexaoBD;
import java.sql.*;
import model.bean.Telefone;

public class TelefoneDAO {

    public String createTelefone(Telefone telefone) throws SQLException {
        Connection conn = null;
        PreparedStatement create = null;

        try {
            //Obtem conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();
            //Preparando o SQL para o inserir Paciente
            String sql = "INSERT INTO telefone_paciente (celular) VALUES (?)";
            create = conn.prepareStatement(sql);
            create.setString(1, telefone.getNumero());
            //Executa a inserção
            create.executeUpdate();
            System.out.println("Telefone inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir paciente: " + e.getMessage());
        }
        return null;
    }
}

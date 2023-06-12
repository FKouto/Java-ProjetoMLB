package model.dao;

import database.ConexaoBD;
import java.sql.*;
import model.bean.Telefone;

public class TelefoneDAO {

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
}

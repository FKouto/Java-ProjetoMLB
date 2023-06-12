package model.dao;

import database.ConexaoBD;
import java.sql.*;
import model.bean.Endereco;

public class EnderecoDAO {

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
}

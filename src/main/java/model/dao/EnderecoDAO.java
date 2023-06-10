package model.dao;

import database.ConexaoBD;
import java.sql.*;
import model.bean.Endereco;

public class EnderecoDAO {

    public String createEndereco(Endereco endereco) throws SQLException {
        Connection conn = null;
        PreparedStatement create = null;

        try {
            //Obtem conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();
            //Preparando o SQL para o inserir Paciente
            String sql = "INSERT INTO endereco_paciente (rua, bairro, cidade, estado, cep) VALUES (?,?,?,?,?)";
            create = conn.prepareStatement(sql);
            create.setString(1, endereco.getRua());
            create.setString(2, endereco.getBairro());
            create.setString(3, endereco.getCidade());
            create.setString(4, endereco.getEstado());
            create.setInt(5, endereco.getCep());
            //Executa a inserção
            create.executeUpdate();
            System.out.println("Endereço inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir paciente: " + e.getMessage());
        }
        return null;
    }
}

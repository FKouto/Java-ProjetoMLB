package model.dao;

import database.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bean.Pessoa;

public class LoginDAO {

    public boolean existe(Pessoa pessoa) throws SQLException {
        Connection conn = null;
        PreparedStatement cons = null;

        try {
            // Obtem conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();

            //Preparando o SQL para o inserir Paciente
            String pacienteLogin = "SELECT * FROM paciente WHERE email = ? AND senha = ?";
            cons = conn.prepareStatement(pacienteLogin);
            cons.setString(1, pessoa.getEmail());
            cons.setString(2, pessoa.getSenha());
            ResultSet rsPaciente = cons.executeQuery();

            if (rsPaciente.next()) {
                return true;
            }

            // Verifica se a pessoa é um psicólogo
            String psicologoLogin = "SELECT * FROM psicologo WHERE email = ? AND senha = ?";
            cons = conn.prepareStatement(psicologoLogin);
            cons.setString(1, pessoa.getEmail());
            cons.setString(2, pessoa.getSenha());
            ResultSet rsPsicologo = cons.executeQuery();

            if (rsPsicologo.next()) {
                return true;
            }

            // Verifica se a pessoa é um psiquiatra
            String psiquiatraLogin = "SELECT * FROM psiquiatra WHERE email = ? AND senha = ?";
            cons = conn.prepareStatement(psiquiatraLogin);
            cons.setString(1, pessoa.getEmail());
            cons.setString(2, pessoa.getSenha());
            ResultSet rsPsiquiatra = cons.executeQuery();

            if (rsPsiquiatra.next()) {
                return true;
            }

        } catch (SQLException e) {
            //Preparando o SQL para o inserir Paciente
            System.out.println("Erro ao consultar." + e.getMessage());
        } finally {
            // Fecha os recursos abertos
            if (cons != null) {
                cons.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        //Preparando o SQL para o inserir Paciente
        return false;
    }
}

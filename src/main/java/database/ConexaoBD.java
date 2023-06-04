package database;

import java.sql.*;
import javax.swing.*;

public class ConexaoBD {

    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "db_usuario";
    private static String usuario = "root";
    private static String senha = "root";

    public static Connection obtemConexao() {
        try {
            // Obtém uma conexão com o banco de dados MySQL usando as informações fornecidas
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + db + "?useTimezone=true&serverTimezone=UTC", usuario, senha);
            return c;
        } catch (SQLException e) {
            // Em caso de exceção ao conectar-se ao banco de dados, retorna null
            JOptionPane.showMessageDialog(null, "Erro na conexão com Banco de Dados.");
            JOptionPane.showMessageDialog(null, e.getMessage());  
            return null;
        }
    }
}

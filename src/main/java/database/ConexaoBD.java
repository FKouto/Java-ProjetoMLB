package database;

import java.sql.*;

public class ConexaoBD {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "db_mlb";
    private static String usuario = "root";
    private static String senha = "root";

    public static java.sql.Connection obtemConexao() {
        try {
            java.sql.Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + db + "?useTimezone=true&serverTimezone=UTC", usuario, senha);
            return c;
        } catch (SQLException e) {
             System.out.println("Erro na conexão com banco de dados. Tente novamente.");
            return null;
        }
    }
    /*
    private static String url = "root:rZJKrmNWjdsiFl15TsEk@containers-us-west-98.railway.app:6393/railway";
    private static String usuario = "root";
    private static String senha = "rZJKrmNWjdsiFl15TsEk";

    public static java.sql.Connection obtemConexao() {
        try {
            java.sql.Connection c = DriverManager.getConnection("jdbc:mysql://" + url + "?useTimezone=true&serverTimezone=UTC", usuario, senha);
            return c;
        } catch (SQLException e) {
             System.out.println("Erro na conexão com banco de dados. Tente novamente.");
            return null;
        }
    }*/
}

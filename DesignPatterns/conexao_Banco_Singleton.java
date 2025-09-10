package EzPet.DesignPatterns;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao_Banco_Singleton {
    private static conexao_Banco_Singleton instancia;
    private Connection conexao_bd;
    private static final  String URL = "jdbc:mysql://localhost:3306";
    private static final String USUARIO = "root";
    private static final String SENHA = "PUC@1234";

    private conexao_Banco_Singleton() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver MySQL
            this.conexao_bd = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conectou certinho diva, pode relaxar ⭐💄💅🏻");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC não encontrado!", e);
        }
    }

    public static conexao_Banco_Singleton getInstancia() throws SQLException{
        if (instancia == null || instancia.getConexao().isClosed()) {
            instancia = new conexao_Banco_Singleton();
        }
        return instancia;
    }

    public Connection getConexao(){
        return conexao_bd;
    }

}

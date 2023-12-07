package proyecto2tbd2;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion_SQLServer {

    Connection conexion;

    // Datos SQL Server
    private String url = "jdbc:sqlserver://dbproyecto2.cqb9pqutso6u.us-east-1.rds.amazonaws.com:1433;databaseName=dbproyecto2";
    private String username = "danielserlio";
    private String password = "danielserlio";

    public void Conexion_SQLServer() {
        try {
            // Register the JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Establish the connection
            conexion = DriverManager.getConnection(url, username, password);

            if (conexion != null) {
                System.out.println("Connected to SQL Server database!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conexion != null && !conexion.isClosed()) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void desconectar() {
        try {
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

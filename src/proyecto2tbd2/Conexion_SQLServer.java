package proyecto2tbd2;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion_SQLServer {

    public void connect() {
        Connection connection = null;
        try {
            // Register the JDBC driver
           
            // Provide your SQL Server credentials
            String username = "danielserlio";
            String password = "danielserlio";
            // Create a connection URL
            String url = "jdbc:sqlserver://dbproyecto2.cqb9pqutso6u.us-east-1.rds.amazonaws.com:1433;databaseName=dbproyecto2;user="+username +";password=" +password+";encrypt=true;trustServerCertificate=true;loginTimeout=30;";

//            String url = "jdbc:sqlserver://dbproyecto2.cqb9pqutso6u.us-east-1.rds.amazonaws.com:1433;databaseName=dbproyecto2";



            // Establish the connection
            connection = DriverManager.getConnection(url);

            if (connection != null) {
                System.out.println("Connected to SQL Server database!");
                // Perform database operations here
                // Example: execute queries, update data, etc.
            }
        } catch ( SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

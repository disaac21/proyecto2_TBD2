package proyecto2tbd2;

import java.awt.Color;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JLabel;

public class Conexion_SQLServer {

    public void connect(JLabel LabelConexion, String Server, String Puerto, String NombreBDD, String Username, String Password) {
        Connection connection = null;
        try {
            // Create a connection URL
            String url = "jdbc:sqlserver://" + Server + ":" + Puerto + ";databaseName=" + NombreBDD + ";user="+Username +";password=" +Password+";encrypt=true;trustServerCertificate=true;loginTimeout=30;";

            System.out.println(url);
            // Establish the connection
            connection = DriverManager.getConnection(url);

            if (connection != null) {
                System.out.println("Connected to SQL Server database!");
                LabelConexion.setText("Conexión Exitosa");
                LabelConexion.setForeground(Color.green);
                // Perform database operations here
                // Example: execute queries, update data, etc.
            }
        } catch ( SQLException e) {
            e.printStackTrace();
            LabelConexion.setText("Conexión Fallida");
            LabelConexion.setForeground(Color.red);
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

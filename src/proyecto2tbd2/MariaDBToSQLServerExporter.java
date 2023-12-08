/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2tbd2;

import java.sql.*;
import java.util.List;
import javax.swing.JList;

public class MariaDBToSQLServerExporter {

    private String mariaDBUrl = "jdbc:mariadb://mariadb-database.cgwlqlsfjpds.us-east-1.rds.amazonaws.com:3306/Proyecto_Teoria2";
    private String mariaDBUser = "admin";
    private String mariaDBPassword = "DanielySerlio";

    private String sqlServerUser = "danielserlio";
    private String sqlServerPassword = "danielserlio";
    private String sqlServerUrl = "jdbc:sqlserver://dbproyecto2.cqb9pqutso6u.us-east-1.rds.amazonaws.com:1433;databaseName=dbproyecto2;user=" + sqlServerUser + ";password=" + sqlServerPassword + ";encrypt=true;trustServerCertificate=true;loginTimeout=30;";

    public MariaDBToSQLServerExporter() {
    }

    public MariaDBToSQLServerExporter(String mariaDBUrl, String mariaDBUser, String mariaDBPassword,
            String sqlServerUrl, String sqlServerUser, String sqlServerPassword) {
        this.mariaDBUrl = mariaDBUrl;
        this.mariaDBUser = mariaDBUser;
        this.mariaDBPassword = mariaDBPassword;

        this.sqlServerUrl = sqlServerUrl;
        this.sqlServerUser = sqlServerUser;
        this.sqlServerPassword = sqlServerPassword;
    }

    public void exportMariaDBToSQLServer(JList MariaDB_list) {
        Connection MariaDBConnection = null;
        Connection SQLServerConnection = null;

        try {
            // Connect to MariaDB
            MariaDBConnection = DriverManager.getConnection(mariaDBUrl, mariaDBUser, mariaDBPassword);

            // Connect to SQL Server
            SQLServerConnection = DriverManager.getConnection(sqlServerUrl);

            // Export data from MariaDB to SQL Server
            exportData(MariaDB_list, MariaDBConnection, SQLServerConnection);

            System.out.println("Data exported successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close connections
            try {
                if (MariaDBConnection != null) {
                    MariaDBConnection.close();
                }
                if (SQLServerConnection != null) {
                    SQLServerConnection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void exportData(JList MariaDB_list, Connection mariaDBConnection, Connection sqlServerConnection) throws SQLException {
        // Retrieve data from MariaDB
        Statement mariaDBStatement = mariaDBConnection.createStatement();
        Statement sqlServerStatement = sqlServerConnection.createStatement();
        List<String> selectedItems = MariaDB_list.getSelectedValuesList();
        String tableName;

        for (String item : selectedItems) {
            tableName = item;

            ResultSet resultSet = mariaDBStatement.executeQuery("SELECT * FROM " + tableName);

            // Insert data into SQL Server
            ResultSetMetaData metaData = resultSet.getMetaData();

            // Elminando la tabla
            String query = "IF OBJECT_ID('" + tableName + "', 'U') IS NOT NULL BEGIN EXEC('DROP TABLE " + tableName + ";') END;";

            // Create SQL Server table dynamically based on MariaDB table structure
            StringBuilder createTableQuery = new StringBuilder("CREATE TABLE " + tableName + " (");
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                createTableQuery.append(metaData.getColumnName(i));
                createTableQuery.append(" ");
                if (metaData.getColumnTypeName(i) == "VARCHAR") {
                    createTableQuery.append(metaData.getColumnTypeName(i))
                            .append("(" + metaData.getPrecision(i) + ") ");
                }else{
                    createTableQuery.append(metaData.getColumnTypeName(i));
                }
                createTableQuery.append(", ");
            }
            createTableQuery.delete(createTableQuery.length() - 2, createTableQuery.length());  // Remove trailing comma and space
            createTableQuery.append(")");

            System.out.println(createTableQuery);
            sqlServerStatement.execute(query);
            System.out.println("se elimino la tabla " + tableName);
            sqlServerStatement.executeUpdate(createTableQuery.toString());

            // Insert data into SQL Server table
            while (resultSet.next()) {
                StringBuilder insertQuery = new StringBuilder("INSERT INTO " + tableName + " VALUES (");
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    insertQuery.append("'").append(resultSet.getString(i)).append("', ");
                }
                insertQuery.delete(insertQuery.length() - 2, insertQuery.length());  // Remove trailing comma and space
                insertQuery.append(")");

                System.out.println(insertQuery);

                sqlServerStatement.executeUpdate(insertQuery.toString());
            }
        }
        mariaDBStatement.close();
        sqlServerStatement.close();
    }
}

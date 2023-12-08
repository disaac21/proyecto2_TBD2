/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2tbd2;

import java.sql.*;

public class MariaDBToSQLServerExporter {
    private String mariaDBUrl = "mariadb-database.cgwlqlsfjpds.us-east-1.rds.amazonaws.com";
    private String mariaDBUser = "admin";
    private String mariaDBPassword = "DanielySerlio";

    private String sqlServerUrl = "dbproyecto2.cqb9pqutso6u.us-east-1.rds.amazonaws.com";
    private String sqlServerUser = "danielserlio";
    private String sqlServerPassword = "danielserlio";

    public MariaDBToSQLServerExporter(String mariaDBUrl, String mariaDBUser, String mariaDBPassword,
                                      String sqlServerUrl, String sqlServerUser, String sqlServerPassword) {
        this.mariaDBUrl = mariaDBUrl;
        this.mariaDBUser = mariaDBUser;
        this.mariaDBPassword = mariaDBPassword;

        this.sqlServerUrl = sqlServerUrl;
        this.sqlServerUser = sqlServerUser;
        this.sqlServerPassword = sqlServerPassword;
    }

    public void exportMariaDBToSQLServer(String tableName) {
        Connection mariaDBConnection = null;
        Connection sqlServerConnection = null;

        try {
            // Connect to MariaDB
            mariaDBConnection = DriverManager.getConnection(mariaDBUrl, mariaDBUser, mariaDBPassword);

            // Connect to SQL Server
            sqlServerConnection = DriverManager.getConnection(sqlServerUrl, sqlServerUser, sqlServerPassword);

            // Export data from MariaDB to SQL Server
            exportData(mariaDBConnection, sqlServerConnection, tableName);

            System.out.println("Data exported successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close connections
            try {
                if (mariaDBConnection != null) mariaDBConnection.close();
                if (sqlServerConnection != null) sqlServerConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void exportData(Connection mariaDBConnection, Connection sqlServerConnection, String tableName) throws SQLException {
        // Retrieve data from MariaDB
        Statement mariaDBStatement = mariaDBConnection.createStatement();
        ResultSet resultSet = mariaDBStatement.executeQuery("SELECT * FROM " + tableName);

        // Insert data into SQL Server
        Statement sqlServerStatement = sqlServerConnection.createStatement();
        ResultSetMetaData metaData = resultSet.getMetaData();

        // Create SQL Server table dynamically based on MariaDB table structure
        StringBuilder createTableQuery = new StringBuilder("CREATE TABLE " + tableName + " (");
        for (int i = 1; i <= metaData.getColumnCount(); i++) {
            createTableQuery.append(metaData.getColumnName(i))
                            .append(" ")
                            .append(metaData.getColumnTypeName(i))
                            .append(", ");
        }
        createTableQuery.delete(createTableQuery.length() - 2, createTableQuery.length());  // Remove trailing comma and space
        createTableQuery.append(")");

        sqlServerStatement.executeUpdate(createTableQuery.toString());

        // Insert data into SQL Server table
        while (resultSet.next()) {
            StringBuilder insertQuery = new StringBuilder("INSERT INTO " + tableName + " VALUES (");
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                insertQuery.append("'").append(resultSet.getString(i)).append("', ");
            }
            insertQuery.delete(insertQuery.length() - 2, insertQuery.length());  // Remove trailing comma and space
            insertQuery.append(")");

            sqlServerStatement.executeUpdate(insertQuery.toString());
        }

        // Close statements
        mariaDBStatement.close();
        sqlServerStatement.close();
    }
}

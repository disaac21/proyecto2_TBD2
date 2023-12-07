
package proyecto2tbd2;
import java.sql.*;

public class Conexion_MariaDB {
    Connection conexion;
    //Datos MariaDb
    private String host = "mariadb-database.cgwlqlsfjpds.us-east-1.rds.amazonaws.com";
    private String port = "3306";
    private String dbName = "Proyecto_Teoria2";
    private String userName = "admin";
    private String userPass = "DanielySerlio";
    
    public void Conexion_MariaDB(){
        try{
            //Conexion para MariaDB
             
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://" + this.host +":" + this.port + "/" + this.dbName;
            
            conexion = DriverManager.getConnection(url, this.userName, this.userPass);
            System.out.println("Host:" + host);
            System.out.println("Conexion Exitosa");
            
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    public void desconectar(){
        try{
            conexion.close();
        }catch (SQLException e){
        }
    }
}

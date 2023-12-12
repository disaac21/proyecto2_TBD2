
package proyecto2tbd2;
import java.sql.*;

public class Conexion_MariaDB {
    Connection conexion;
    //Datos MariaDb
    private String host = "127.0.0.1";
    private String port = "3306";
    private String dbName = "proyecto_teoria2";
    private String userName = "root";
    private String userPass = "root";
    
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

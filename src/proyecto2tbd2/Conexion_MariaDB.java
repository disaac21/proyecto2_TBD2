
package proyecto2tbd2;
import java.awt.Color;
import java.sql.*;
import javax.swing.JLabel;

public class Conexion_MariaDB {
    Connection conexion;
    
    public void Conexion_MariaDB(JLabel LabelConexion, String Server, String Puerto, String NombreBDD, String Username, String Password){
        try{
            //Conexion para MariaDB
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://" + Server +":" + Puerto + "/" + NombreBDD;
            
            System.out.println(url);
            
            conexion = DriverManager.getConnection(url, Username, Password);
            System.out.println("Host:" + Puerto);
            System.out.println("Conexion Exitosa");
            LabelConexion.setText("Conexion Exitosa");
            LabelConexion.setForeground(Color.green);
            
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
            LabelConexion.setText("Conexion Fallida");
            LabelConexion.setForeground(Color.red);
        }
    }
    public void desconectar(){
        try{
            conexion.close();
        }catch (SQLException e){
        }
    }
}

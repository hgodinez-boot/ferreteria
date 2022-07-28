package ferreteria;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Usuario
 */
public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/ferreteria";
    String user="root";
    String pass="";
    
    public Connection Conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
    
    public static void main(String[] args){ 
        Conexion con = new Conexion();
        System.out.println(con.Conectar());
    }
    
}

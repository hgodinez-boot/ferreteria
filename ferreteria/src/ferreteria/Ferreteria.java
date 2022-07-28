package ferreteria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Usuario
 */
public class Ferreteria {
    
   PreparedStatement ps;
   ResultSet rs;
   Connection con;
   Conexion conectar = new Conexion();
   
   public void crear(int codigo, String nombre, int cantidad, String fabricacion){
       String sql ="insert into productos(codigo, nombre, cantidad, lugar_fabricacion) values (?,?,?,?)";
       try{
           con = conectar.Conectar();
           ps = con.prepareStatement(sql);
           ps.setInt(1, codigo);
           ps.setString(2, nombre);
           ps.setInt(3, cantidad);
           ps.setString(4, fabricacion);
           ps.executeUpdate(); 
       }catch(Exception e){    
       }
   }   
}

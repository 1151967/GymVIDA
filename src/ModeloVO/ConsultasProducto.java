/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloVO;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DevSerialKiller
 */
public class ConsultasProducto extends Conexion{
    
    //Todos los metodos que le haremos a producto
    
   //METODO REGISTRAR
    public boolean registrar(Producto p){
    
        PreparedStatement ps = null;
        
        Connection con = getConexion();
        String sql = "INSERT INTO producto (codigo,nombre,precio) VALUES (?,?,?)";
        
       try{
       
           ps = (PreparedStatement) con.prepareStatement(sql);
           ps.setString(1,p.getCodigo());
           ps.setString(2, p.getNombre());
           ps.setInt(3,p.getPrecio());
           ps.execute();
           return true;
       }
       catch(SQLException e){
       
           System.err.println(e);
           return false;
       }
        
       
    
    }//FIN REGISTRO
     public boolean modificar(Producto p){
    
        PreparedStatement ps = null;
        
        Connection con = getConexion();
        String sql = "UPDATE producto set codigo=?, nombre=?, precio=? WHERE id =?";
        
       try{
       
           ps = (PreparedStatement) con.prepareStatement(sql);
           ps.setString(1,p.getCodigo());
           ps.setString(2, p.getNombre());
           ps.setInt(3,p.getPrecio());
           ps.setInt(4,p.getId());
           ps.execute();
           return true;
       }
       catch(SQLException e){
       
           System.err.println(e);
           return false;
       }
}//FIN MODIFICAR
        public boolean eliminar(Producto p){
    
        PreparedStatement ps = null;
        
        Connection con = getConexion();
        String sql = "DELETE FROM producto WHERE  id =?";
        
       try{
       
           ps = (PreparedStatement) con.prepareStatement(sql);
           ps.setInt(1,p.getId());
           ps.execute();
           return true;
       }
       catch(SQLException e){
       
           System.err.println(e);
           return false;
       }
}// FIN ELIMINAR
        public boolean buscar(Producto p){
    
        PreparedStatement ps = null;
        
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "SELECT * FROM producto WHERE id=?";
        
       try{
       
           ps = (PreparedStatement) con.prepareStatement(sql);
           ps.setInt(1,p.getId());
           rs = ps.executeQuery();
           
          if(rs.next()){
          p.setId(Integer.parseInt(rs.getString("id")));
          p.setCodigo(rs.getString("codigo"));
          p.setNombre(rs.getString("nombre"));
          p.setPrecio(Integer.parseInt(rs.getString("precio")));
          
          
          
          }
          return true;
       }
       catch(SQLException e){
       
           System.err.println(e);
           return false;
       }
}//FIN BUSCAR
}

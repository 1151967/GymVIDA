/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiciosDAO;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author DevSerialKiller
 */
public class Conexion {
    public static final String URL =    "jdbc:mysql://localhost/gimnasiobdparcialpoo2";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    
    public static Connection getConnection(){
    
        Connection connection = null;
        try{
        
                 Class.forName("com.mysql.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
                System.out.println("Conecion realizada con exito");
          }
    catch(ClassNotFoundException | SQLException e){
    
    
        JOptionPane.showMessageDialog(null, e);
        JOptionPane.showMessageDialog(null, "Conexion fallida");
    }
    return connection;
    
    }
}

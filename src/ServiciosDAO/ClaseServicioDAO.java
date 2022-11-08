/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiciosDAO;

import ModeloVO.ClaseVO;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DevSerialKiller
 */
public class ClaseServicioDAO {
    public ArrayList<String> llenarInst(String m,String n, JButton bo) throws SQLException{
    
    String mi = "", ni="";
    Arraylist<String> listains = new ArrayList<>();
    String sql = "SELECT * FROM instructor";
    try(Connection conexion3 = Conexion.getConnection();
            Statement declaracion  = (Statement) conexion3.createStatement();
            Resulset rs = declaracion.executeQuery(sql)){
    
    listains.add("Seleccione instructor");
    
    while(rs.next()){
        mi = rs.getString("especialidad");
        ni = rs.getString("hora");
        if(mi.equals(m) && n.equals(ni)){
        
        listains.add(rs.getString("codigo"));
        bo.setEnable(true);
            
        }
    
    }
    
    }    catch(SQLException e){
            
            System.err.println(e.getMessage());
            }
    return listains;
    }
    
    
    public void insertar(Connection conexion2,ClaseVO clase){
        
        try{
        
            PreparedStatement cons;
            cons =  (PreparedStatement) conexion2.prepareStatement("INSERT INTO clase (codigo,clase,horario,cod_instructor)"+
                     "VALUES (?,?,?,?)");
            cons.setInt(1,clase.getCodigo());
            cons.setString(2,clase.getClase());
            cons.setString(3,clase.getHorario());
            cons.setInt(1,clase.getInstructor());
            cons.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Se guardo la clase ");
            
        }
        
        catch(SQLException e){
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
    }
    
    public boolean buscar(Integer codigo){
    boolean esta = false;
    Integer cod2 =  0;
    String sql =   "SELECT codigo FROM clase WHERE codigo='" + codigo + "'";
    try(Connection conexion3 = Conexion.getConnection()){}
    
    }
        
    
    
    }
    


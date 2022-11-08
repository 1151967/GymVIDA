/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controlador.ControladorPrincipal;
import Controlador.ControladorProducto;
import ModeloVO.Conexion;
import ModeloVO.ConsultasProducto;
import ModeloVO.Producto;
import Vista.VPrincipal;
import Vista.VProducto;

/**
 *
 * @author DevSerialKiller
 */
public class Main {
    
    public static void main(String[] args) {
        
      Producto pro = new Producto();
      ConsultasProducto proC = new ConsultasProducto();
      VProducto frmPro = new VProducto();
      
        ControladorProducto ctrlPro = new ControladorProducto(pro,frmPro,proC);
        VPrincipal frmPri = new VPrincipal();
      ControladorPrincipal ctrlPri = new ControladorPrincipal(frmPri, frmPro);
      ctrlPri.iniciar();
      frmPri.setVisible(true);
    }
}

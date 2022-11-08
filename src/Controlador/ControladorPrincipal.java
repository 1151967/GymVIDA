/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.VPrincipal;
import Vista.VProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DevSerialKiller
 */
public class ControladorPrincipal implements ActionListener{
    
    private VPrincipal frmPri;
    private VProducto frmPro;

    public ControladorPrincipal(VPrincipal frmPri, VProducto frmPro) {
        this.frmPri = frmPri;
        this.frmPro = frmPro;
        this.frmPri.menu_producto.addActionListener(this); ;
        this.frmPri.menu_salir.addActionListener(this);
    }
    
    public void iniciar(){
    
    
        frmPro.setTitle("Producto");
        frmPri.setTitle("Principal");
        frmPri.setLocationRelativeTo(null);
        frmPro.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == frmPri.menu_producto){
      
          frmPro.setVisible(true);
          frmPri.dispose();
      }
      
      if(e.getSource() == frmPri.menu_salir){
      
          System.exit(0);
      }
    }
    
    
}

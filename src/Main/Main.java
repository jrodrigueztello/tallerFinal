/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Controladores.FrmRegistrarProductoController;
import Vistas.Frm_Registrar_Producto;

/**
 *
 * @author Jonathan Rodriguez, Juan Vallejos
 */
public class Main {

   public static Frm_Registrar_Producto frm_rp;
    public static FrmRegistrarProductoController c_frm_rp;
    public static void main(String[] args) {
        frm_rp = new Frm_Registrar_Producto();
        frm_rp.setVisible(true);        
        c_frm_rp = new FrmRegistrarProductoController(frm_rp);
        frm_rp.setLocationRelativeTo(null);
        
    }
    
}

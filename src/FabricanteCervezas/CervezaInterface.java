/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FabricanteCervezas;

import Controladores.FrmRegistrarProductoController;
import Vistas.Frm_Registrar_Producto;

/**
 *
 * @author Jonathan Rodriguez, Juan Vallejos
 */
public class CervezaInterface extends Frm_Registrar_Producto {

    public CervezaSensor sensor;

    public static Frm_Registrar_Producto frm_rp;
    public static FrmRegistrarProductoController c_frm_rp;

    CervezaInterface() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frm_rp = new Frm_Registrar_Producto();
        frm_rp.setSize(400, 300);
        frm_rp.setLocationRelativeTo(null);
        frm_rp.add(new CervezaInterface());
    }

}

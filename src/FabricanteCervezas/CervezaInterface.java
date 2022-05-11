/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FabricanteCervezas;

import Controladores.FrmRegistrarProductoController;
import Vistas.Frm_Registrar_Producto;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

/**
 *
 * @author jonathanrodriguez
 */
public class CervezaInterface extends JPanel {

    public CervezaSensor sensor;
    public static Frm_Registrar_Producto frm_rp;
    public static FrmRegistrarProductoController c_frm_rp;

    CervezaInterface() {
        System.out.println("entro constructor");
        sensor = new CervezaSensor(null, frm_rp);
        sensor.setDisparador(new CervezaDisparador(sensor));
        this.addMouseListener((MouseListener) sensor);
        this.addMouseMotionListener((MouseMotionListener) sensor);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("entro main");
        frm_rp = new Frm_Registrar_Producto();
        frm_rp.setVisible(true);
        c_frm_rp = new FrmRegistrarProductoController(frm_rp);
        frm_rp.setLocationRelativeTo(null);
        frm_rp.add(new CervezaInterface());

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricanteCervezas;

import Controladores.FrmRegistrarProductoController;
import Vistas.Frm_Registrar_Producto;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author jonathanrodriguez
 */
public class CervezaUI extends JComponent {

    CervezaSensor sensor;
    public static Frm_Registrar_Producto frm_rp;
    public static FrmRegistrarProductoController c_frm_rp;

    public CervezaUI() {
        sensor = new CervezaSensor(null, frm_rp);
        sensor.setDisparador(new CervezaDisparador(sensor));
        this.addMouseListener((MouseListener) sensor);
        this.addMouseMotionListener((MouseMotionListener) sensor);
    }

    public static void main(String[] a3d) {
        frm_rp = new Frm_Registrar_Producto();
        frm_rp.setVisible(true);
        c_frm_rp = new FrmRegistrarProductoController(frm_rp);
        frm_rp.setLocationRelativeTo(null);

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Producto;
import Repositories.ProductoRepository;
import Vistas.Frm_Registrar_Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jonathanrodriguez
 */
public class FrmRegistrarProductoController implements ActionListener {
    Frm_Registrar_Producto frm_rp;
    ProductoRepository productoRepository = new ProductoRepository();

    public FrmRegistrarProductoController(Frm_Registrar_Producto frm_rp) {
        this.frm_rp = frm_rp;
        this.frm_rp.btn_escanear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==frm_rp.btn_escanear){
            Producto newProd = new Producto(
                    frm_rp.txt_nombre.getText(),
                    frm_rp.txt_codgo.getText(),
                    frm_rp.txt_marca.getText(),
                    frm_rp.txt_peso.getText()
            );
            productoRepository.save(newProd);
            List<Producto> listaProductos = productoRepository.listProductos() ;
            mostrarTable(frm_rp.table_productos, listaProductos);
            limpiarEntradas();
            System.out.println("Entro");
        }
        if(e.getSource()==frm_rp.btn_limpiar){
            System.err.println("error ");
            limpiarEntradas();
        }
    }

    private void limpiarEntradas() {
        frm_rp.txt_codgo.setText("");
        frm_rp.txt_marca.setText("");
        frm_rp.txt_nombre.setText("");
        frm_rp.txt_peso.setText("");
    }

    private void mostrarTable(JTable table_productos, List<Producto> listaProductos) {
        DefaultTableModel modelo  = new DefaultTableModel();
        modelo.addColumn(("codigo"));
        modelo.addColumn(("nombre"));
        modelo.addColumn(("marca"));
        modelo.addColumn(("peso"));
        for (int i = 0; i < listaProductos.size(); i++) {
            Object[] lista = {
                listaProductos.get(i).getCodigo(),
                listaProductos.get(i).getNombre(),
                listaProductos.get(i).getMarca(),
                listaProductos.get(i).getPeso()
                    
            };
            modelo.addRow(lista);
        }
        table_productos.setModel(modelo);
    }

   
    
}

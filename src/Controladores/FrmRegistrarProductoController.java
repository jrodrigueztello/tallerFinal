/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Externo.Sensor;
import FabricanteCervezas.Cerveza;
import FabricanteCervezas.CervezaActuador;
import FabricanteCervezas.CervezaDisparador;
import FabricanteCervezas.CervezaMedicion;
import FabricanteCervezas.CervezaSensor;
import Modelos.ObjectObservable;
import Modelos.Producto;
import Repositories.ProductoRepository;
import Vistas.Frm_Registrar_Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jonathan Rodriguez, Juan Vallejos
 */
public class FrmRegistrarProductoController implements ActionListener, Observer {
    Frm_Registrar_Producto frm_rp;
    CervezaDisparador disparador ;
    CervezaSensor sensor;
    CervezaMedicion medicion;
    CervezaActuador actuador;
    ProductoRepository productoRepository = new ProductoRepository();
    Cerveza producto;
    

    public FrmRegistrarProductoController(Frm_Registrar_Producto frm_rp) {
        this.disparador = new CervezaDisparador();
        this.sensor = new CervezaSensor();
        this.medicion = new CervezaMedicion();
        this.actuador = new CervezaActuador();
        this.frm_rp = frm_rp;
        this.frm_rp.btn_escanear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==frm_rp.btn_escanear){
            this.producto = new Cerveza(
                    frm_rp.txt_nombre.getText(),
                    frm_rp.txt_codgo.getText(),
                    frm_rp.txt_codgo.getText()
            );
            this.producto.addObservable(disparador);
            this.producto.addObservable(sensor);
            this.producto.addObservable(medicion);
            this.producto.addObservable(actuador);
            this.producto.addObservable(this);
            ObjectObservable objectObservable = new ObjectObservable("disparador");
            this.producto.notifyObservers(objectObservable);
            productoRepository.save(this.producto);
            List<Producto> listaProductos = productoRepository.listProductos() ;
            mostrarTable(frm_rp.table_productos, listaProductos);
            limpiarEntradas();
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
        for (int i = 0; i < listaProductos.size(); i++) {
            Object[] lista = {
                listaProductos.get(i).getCodigo(),
                listaProductos.get(i).getNombre(),
                listaProductos.get(i).getNombre()
            };
            modelo.addRow(lista);
        }
        table_productos.setModel(modelo);
    }

    @Override
    public void update(Observable o, Object arg) {
        ObjectObservable objectObservable = (ObjectObservable)arg;
        if(objectObservable.getObservadorDesignado()=="medicionSensor"){
            
        }
        if(objectObservable.getObservadorDesignado()=="porcentajeMedicionIdeal"){
            
        }
    }

   
    
}

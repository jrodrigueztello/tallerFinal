/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

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
    CervezaDisparador disparador;
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
        if (e.getSource() == frm_rp.btn_escanear) {
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
            ObjectObservable objectObservable = new ObjectObservable("disparador", null, null, null, this.producto);
            this.producto.notifyObservers(objectObservable);

        }
       
    }

    private void limpiarEntradas() {
        frm_rp.txt_codgo.setText("");
        frm_rp.txt_nombre.setText("");
    }

    private void mostrarTable(JTable table_productos, List<Producto> listaProductos) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn(("nombre"));
        modelo.addColumn(("codigo"));
        modelo.addColumn(("calidad segun sensor"));
        modelo.addColumn(("calidad segun medida ideal"));
        modelo.addColumn(("accionActuador"));
        for (int i = 0; i < listaProductos.size(); i++) {
            Object[] lista = {
                listaProductos.get(i).getNombre(),
                listaProductos.get(i).getCodigo(),
                listaProductos.get(i).getCalidadProducto(),
                listaProductos.get(i).getPorcentajeMedicion(),
                listaProductos.get(i).getEstadoFinal(),};
            modelo.addRow(lista);
        }
        table_productos.setModel(modelo);
    }

    @Override
    public void update(Observable o, Object arg) {
        ObjectObservable objectObservable = (ObjectObservable) arg;
        if ("medicionSensor".equals(objectObservable.getObservadorDesignado())) {
            this.producto.setCalidadProducto(objectObservable.getCalidadSensor());
        }
        if ("medicionIdeal".equals(objectObservable.getObservadorDesignado())) {
            this.producto.setPorcentajeMedicion(objectObservable.getCalidadMedicion());
            this.actuador.tomarDecision(this.producto);
        }
        if ("desicionActuador".equals(objectObservable.getObservadorDesignado())) {
            this.producto.setEstadoFinal(objectObservable.getEstadoFinal());
            imprimirResultados(this.producto);
        }

    }

    private void imprimirResultados(Producto prod) {
        productoRepository.save(prod);
        List<Producto> listaProductos = productoRepository.listProductos();
        mostrarTable(frm_rp.table_productos, listaProductos);
        limpiarEntradas();
        this.producto = null;
        this.frm_rp.habilitarBtnEscanner();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import FabricanteCervezas.Cerveza;

/**
 *
 * @author Jonathan Rodriguez, Juan Vallejos
 */
public class ObjectObservable {
    Producto producto;
    String observadorDesignado;
    Double calidadSensor;
    Double calidadMedicion;
    String estadoFinal;

    public ObjectObservable(String observadorDesignado, Double calidadSensor, Double calidadMedicion, String estadoFinal, Cerveza producto) {
        this.observadorDesignado = observadorDesignado;
        this.calidadSensor = calidadSensor;
        this.calidadMedicion = calidadMedicion;
        this.estadoFinal = estadoFinal;
        this.producto = producto;
    }

    public String getObservadorDesignado() {
        return observadorDesignado;
    }

    public Double getCalidadMedicion() {
        return calidadMedicion;
    }

    public String getEstadoFinal() {
        return estadoFinal;
    }

    public void setObservadorDesignado(String observadorDesignado) {
        this.observadorDesignado = observadorDesignado;
    }

    public void setCalidadMedicion(Double calidadMedicion) {
        this.calidadMedicion = calidadMedicion;
    }

    public void setEstadoFinal(String estadoFinal) {
        this.estadoFinal = estadoFinal;
    }

    public Double getCalidadSensor() {
        return calidadSensor;
    }

    public void setCalidadSensor(Double calidadSensor) {
        this.calidadSensor = calidadSensor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    

}

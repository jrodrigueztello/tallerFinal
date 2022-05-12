/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Jonathan Rodriguez, Juan Vallejos
 */
public class ObjectObservable {
    String observadorDesignado;
    Double calidadSensor;
    Double calidadMedicion;
    String estadoFinal;

    public ObjectObservable(String observadorDesignado) {
        this.observadorDesignado = observadorDesignado;
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

    
    
}

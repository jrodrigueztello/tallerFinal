/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Jonathan Rodriguez, Juan Vallejos
 */
public abstract class Producto extends Observable {
    private String nombre;
    private String codigo;
    private Double calidadProducto;
    private Double porcentajeMedicion;
    private String estadoFinal;
    
    public ArrayList<Observer> observers =new ArrayList<Observer>();
    
    public Producto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public Double getCalidadProducto() {
        return calidadProducto;
    }

    public String getEstadoFinal() {
        return estadoFinal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCalidadProducto(Double calidadProducto) {
        this.calidadProducto = calidadProducto;
    }

    public void setEstadoFinal(String estadoFinal) {
        this.estadoFinal = estadoFinal;
    }

    public Double getPorcentajeMedicion() {
        return porcentajeMedicion;
    }

    public void setPorcentajeMedicion(Double porcentajeMedicion) {
        this.porcentajeMedicion = porcentajeMedicion;
    }
    
    
    
   public abstract void addObservable(Observer observer);
   
   public abstract void notifyObservers();

    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricanteCervezas;

import Modelos.Producto;
import java.util.Observer;

/**
 *
 * @author Jonathan Rodriguez, Juan Vallejos
 */
public class Cerveza extends Producto {

    private String marca;

    public Cerveza(String nombre, String codigo, String marca) {
        super(nombre, codigo);
        this.marca = marca;

    }

    @Override
    public void addObservable(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void notifyObservers(Object a) {
        if (!observers.isEmpty()) {
            for (int i = 0; i < observers.size(); i++) {
                observers.get(i).update(this, a);
            }
        }
    }

    @Override
    public void notifyObservers() {
        if (!observers.isEmpty()) {
            for (int i = 0; i < observers.size(); i++) {
                observers.get(i).update(this, i);
            }
        }
    }

}

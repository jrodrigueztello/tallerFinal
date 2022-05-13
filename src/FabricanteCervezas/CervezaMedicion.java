/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricanteCervezas;

import Core.MedicionItem;
import Modelos.ObjectObservable;
import Modelos.Producto;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author jonathanrodriguez
 */
public class CervezaMedicion extends MedicionItem {

    public CervezaMedicion() {
        addObservable(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        
    }

    @Override
    public void addObservable(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        if (!observers.isEmpty()) {
            for (int i = 0; i < observers.size(); i++) {
                observers.get(i).update(this, i);
            }
        }
    }

    Double ejecutarMedicion(Double medicionSensor, Double medicionIdeal, Producto producto) {
        Double medicion = 0.0;
        if (medicionSensor > 90) {
            medicion = 100.0;
        }else{
            medicion = (medicionSensor * 100) / medicionIdeal;
        }
        ObjectObservable objectObservable = new ObjectObservable("medicionIdeal", null, medicion, null, (Cerveza) producto);
        producto.notifyObservers(objectObservable);
        return medicion;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricanteCervezas;

import Core.Disparador;
import Modelos.ObjectObservable;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Jonathan Rodriguez, Juan Vallejos
 */
public class CervezaDisparador extends Disparador {

    CervezaSensor sensor;
    CervezaMedicion medicion;

    public CervezaDisparador() {
        this.sensor = new CervezaSensor();
        this.medicion = new CervezaMedicion();
        addObservable(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        ObjectObservable objectObservable = (ObjectObservable)arg;
        if("disparador".equals(objectObservable.getObservadorDesignado())){
            Double medicionSensor = this.sensor.realizarMedicion(objectObservable.getProducto());
            Double medicionIdeal = this.medicion.ejecutarMedicion(medicionSensor, 90.0,objectObservable.getProducto());
        }
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
}

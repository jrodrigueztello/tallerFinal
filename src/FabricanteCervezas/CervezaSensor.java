/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricanteCervezas;

import Externo.Sensor;

import Modelos.ObjectObservable;
import Modelos.Producto;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Jonathan Rodriguez, Juan Vallejos
 */
public class CervezaSensor extends Sensor {

    public CervezaSensor() {
        addObservable(this);
    }

    @Override
    public Double realizarMedicion(Producto p) {
        Double medicionSensor = (Math.random() * (100 - 60 + 1) + 60);
        ObjectObservable objectObservable = new ObjectObservable("medicionSensor", medicionSensor, null, null, (Cerveza) p);
        p.notifyObservers(objectObservable);
        return medicionSensor;
    }

    void setDisparador(CervezaDisparador cervezaDisparador) {

    }

    @Override
    public void update(Observable o, Object args) {

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

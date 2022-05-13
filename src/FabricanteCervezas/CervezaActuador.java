/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricanteCervezas;

import Externo.Actuador;
import Modelos.ObjectObservable;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Jonathan Rodriguez, Juan Vallejos
 */
public class CervezaActuador extends Actuador {

   

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observador desde cerveza actuador");
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

    public void tomarDecision(Cerveza producto) {
        String desicion = "";
        if(producto.getPorcentajeMedicion()>90){
            desicion = "APROBADO";
        }
        desicion = "RECHAZADO";
        ObjectObservable objectObservable = new ObjectObservable("desicionActuador", null, null, desicion, (Cerveza) producto);
        producto.notifyObservers(objectObservable);
        
        
    }

}

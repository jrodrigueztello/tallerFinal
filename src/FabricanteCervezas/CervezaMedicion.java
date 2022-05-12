/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricanteCervezas;

import Core.Item;
import Core.MedicionItem;
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
    public boolean compararMediciones(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean tomarAccion(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Item leerSensor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("observable desde medicion");
    }

    @Override
    public void addObservable(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        if(!observers.isEmpty()){
           for (int i = 0; i < observers.size(); i++) {
               observers.get(i).update(this, i);
           }
        }
    }

    Double ejecutarMedicion(Double medicionSensor,Double medicionIdeal) {
        if(medicionSensor>90){
            
        }
        return (medicionSensor *100)/medicionIdeal;
    }
    
}

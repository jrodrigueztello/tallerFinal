/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricanteCervezas;

import Core.Disparador;
import Externo.Sensor;
import Externo.SensorActivo;
import Modelos.ObjectObservable;
import Vistas.Frm_Registrar_Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JComponent;

/**
 *
 * @author Jonathan Rodriguez, Juan Vallejos
 */
public class CervezaSensor extends Sensor {
    
    
    public CervezaSensor() {
        addObservable(this);
    }
   

    @Override
    public Object realizarMedicion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setDisparador(CervezaDisparador cervezaDisparador) {
    
    }

    @Override
    public void update(Observable o, Object args) {
        //ObjectObservable objectObservable = (ObjectObservable) args;
        System.out.println("disparador desde sensor");
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

    Double ejecutarMedicionSensor() {
        return (Math.random()*(100-60+1)+60); 
    }
}
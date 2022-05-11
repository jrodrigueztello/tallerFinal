/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import Externo.Actuador;
import Externo.Sensor;
import FabricanteCervezas.CervezaActuador;
import FabricanteCervezas.CervezaSensor;
import java.util.ArrayList;



/**
 *
 * @author jonathanrodriguez
 */
public abstract class MedicionItem {
    private ArrayList<Float> realMedicion;
    private ArrayList<Float> idealMedicion;
    private ArrayList<Sensor> sensores;
    private ArrayList<Actuador> actuadores;

    public MedicionItem() {
        this.realMedicion = new ArrayList<>();
        this.idealMedicion = new ArrayList<>();
        this.sensores = new ArrayList<>();
        this.actuadores = new ArrayList<>();
        
    }
    
    
    
    public abstract boolean compararMediciones(Item item);
    public abstract boolean tomarAccion(Item item);
    public abstract Item leerSensor();
    
    public void correr(){
        Item item = leerSensor();
        if(compararMediciones(item)){
            tomarAccion(item);
        }
    }

    public ArrayList<Float> getRealMedicion() {
        return realMedicion;
    }

    public ArrayList<Float> getIdealMedicion() {
        return idealMedicion;
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public ArrayList<Actuador> getActuadores() {
        return actuadores;
    }

    public void setRealMedicion(ArrayList<Float> realMedicion) {
        this.realMedicion = realMedicion;
    }

    public void setIdealMedicion(ArrayList<Float> idealMedicion) {
        this.idealMedicion = idealMedicion;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }

    public void setActuadores(ArrayList<Actuador> actuadores) {
        this.actuadores = actuadores;
    }
    
    public void adicionarSensor(CervezaSensor cervezaSensor){
        System.out.println(cervezaSensor.toString());
        this.sensores.add(cervezaSensor);
    }
            
    public void adicionarActuador(CervezaActuador cervezaActuador){
        this.actuadores.add(cervezaActuador);
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Externo;

import Core.Disparador;

/**
 *
 * @author Jonathan Rodriguez, Juan Vallejos
 */
public abstract class SensorActivo extends Sensor {
    private Disparador disparador;
    public SensorActivo(Disparador disparador){
        this.disparador = disparador;
    }
    
    public void notificarDisparador(){
        this.disparador.actualizar(this);
    }

    public Disparador getDisparador() {
        return disparador;
    }

    public void setDisparador(Disparador disparador) {
        this.disparador = disparador;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricanteCervezas;

import Core.Item;
import Externo.Actuador;

/**
 *
 * @author jonathanrodriguez
 */
public class CervezaActuador extends Actuador {

    @Override
    public boolean action(Item item) {
        Cerveza cerveza = (Cerveza) item;
        cerveza.setEstadoFinal("APROBADO");
        return true;
    }
    
}

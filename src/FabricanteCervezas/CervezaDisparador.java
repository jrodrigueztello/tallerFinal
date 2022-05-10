/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricanteCervezas;

import Core.Disparador;
import Core.MedicionItem;

/**
 *
 * @author jonathanrodriguez
 */
public class CervezaDisparador extends Disparador {

    public CervezaDisparador(CervezaSensor cervezaSensor) {
        fabrica = new CervezaFabrica();
        MedicionItem medicionItem = fabrica.crearItem();
        medicionItem.adicionarSensor(cervezaSensor);
        medicionItem.adicionarActuador(new CervezaActuador());
    }
}

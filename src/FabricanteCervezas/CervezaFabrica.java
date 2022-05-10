/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricanteCervezas;

import Core.ItemFabrica;
import Core.MedicionItem;

/**
 *
 * @author jonathanrodriguez
 */
public class CervezaFabrica extends ItemFabrica {
    private final CervezaMedicion item;

    public CervezaFabrica() {
        super();
        item = new CervezaMedicion();
    }

    @Override
    public MedicionItem crearItem() {
        return item;
    }
    
}

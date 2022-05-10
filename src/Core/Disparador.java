/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

/**
 *
 * @author jonathanrodriguez
 */
public class Disparador {
    protected ItemFabrica fabrica;
    
    public void actualizar(Object objeto){
        MedicionItem medicionItem = fabrica.crearItem();
        medicionItem.correr();
    }
}

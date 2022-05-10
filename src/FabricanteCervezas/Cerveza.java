/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricanteCervezas;

import Core.Item;

/**
 *
 * @author jonathanrodriguez
 */
public class Cerveza extends Item {
    private boolean sellado;
    private String estadoEmpaque ;
    private String estadoBase;
    private String estadoFinal;

    public Cerveza(boolean sellado, String estadoEmpaque, String estadoBase) {
        super();
        this.sellado = sellado;
        this.estadoEmpaque = estadoEmpaque;
        this.estadoBase = estadoBase;
    }

    public void setSellado(boolean sellado) {
        this.sellado = sellado;
    }

    public void setEstadoEmpaque(String estadoEmpaque) {
        this.estadoEmpaque = estadoEmpaque;
    }

    public void setEstadoBase(String estadoBase) {
        this.estadoBase = estadoBase;
    }

    public boolean isSellado() {
        return sellado;
    }

    public String getEstadoEmpaque() {
        return estadoEmpaque;
    }

    public String getEstadoBase() {
        return estadoBase;
    }

    public String getEstadoFinal() {
        return estadoFinal;
    }

    public void setEstadoFinal(String estadoFinal) {
        this.estadoFinal = estadoFinal;
    }
    
    
}

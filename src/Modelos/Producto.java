/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author jonathanrodriguez
 */
public class Producto {
    private String nombre;
    private String codigo;
    private String marca;
    private String peso;

    public Producto(String nombre, String codigo, String marca, String peso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.marca = marca;
        this.peso = peso;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    
}

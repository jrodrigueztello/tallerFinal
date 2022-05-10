/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Modelos.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonathanrodriguez
 */
public class ProductoRepository {
    List<Producto> list_productos = new ArrayList<>() ;
    
   public Producto save(Producto producto){
       try{
           list_productos.add(producto);
           System.out.println(list_productos.toString());
           return producto;
       }catch(Exception e){
           return null;
       }
   }
   
   public List<Producto> listProductos (){
       return list_productos;
   }
   
   
   public Boolean eliminarProducto(Producto producto){
       Boolean response = false;
       if(list_productos.contains(producto)){
           //eliminar elemento
           response = true;
       }
       return response;
   }
   
      public Producto eliminarProducto(Producto newProducto, String codigo){
       Producto prod_response = null;
       if(list_productos.contains(newProducto)){
           return prod_response;
       }
       return null;
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item16;

/**
 *
 * @author Daniel
 */
public class disco extends publicacion{
    private String duracion, precio;

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    public void Mostrar(){
        System.out.println("Título: "+getTitulo());
        System.out.println("Duración: "+duracion);        
        System.out.println("Precio: "+precio);
    }
   
}

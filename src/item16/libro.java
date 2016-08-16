/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item16;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class libro extends publicacion{
    private String pags, año, precio;
    private Scanner lector = new Scanner(System.in);

    public void setPags(String pags) {
        this.pags = pags;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    
    public void Mostrar(){
        System.out.println("Título: "+getTitulo());
        System.out.println("Páginas: "+pags);
        System.out.println("Año de publicación: "+año);
        System.out.println("Precio: "+precio);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item18;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class nombre {
    private String nombre, primer_apellido, segundo_apellido;
    private Scanner lector = new Scanner(System.in);

    public nombre() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }
    
    public void Leer_nombre(){
        System.out.print("Ingrese el nombre: ");
        nombre = lector.next();
        System.out.print("Ingrese el primer apellido: ");
        primer_apellido = lector.next();
        System.out.print("Ingrese el segundo apellido: ");
        segundo_apellido = lector.next();
    }
    public void Mostrar(){
        System.out.println("El nombre completo es: "+nombre+" "+primer_apellido+" "+segundo_apellido);
    }
}

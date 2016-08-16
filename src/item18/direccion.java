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
public class direccion extends nombre {
    private String calle, ciudad, provincia, codigo;
    private Scanner lector = new Scanner(System.in);
    
    public void Nueva_direccion(){
        System.out.print("Ingrese la dirección (Calle, Ciudad, Provincia, Código): ");
        String nuevadir = lector.nextLine();
        String[] partes1 = nuevadir.split(" ");
        calle = partes1[0];
        ciudad = partes1[1];
        provincia = partes1[2];
        codigo = partes1[3];    
    }
    
    public void Nuevo_nombre(){
        System.out.print("Ingrese el nuevo nombre (Nombre, P. Apellido, S. Apellido): ");
        String nuevonom = lector.nextLine();
        String[] partes = nuevonom.split(" ");
        setNombre(partes[0]);
        setPrimer_apellido(partes[1]);
        setSegundo_apellido(partes[2]);
    }
    
    public void Mostrar2(){
        System.out.println("El nombre completo es: "+getNombre()+" "+getPrimer_apellido()+" "
                +getSegundo_apellido());
        System.out.println("La dirección es: "+calle+" "+ciudad+" "+provincia+" "+codigo);
    }

}

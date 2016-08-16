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
public class main1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        libro libro1 = new libro();
        disco disco1 = new disco();
        do{
            System.out.println("=======Menú=======");
            System.out.println("1. Ingresar libro");
            System.out.println("2. Ingresar disco");
            System.out.println("3. Mostrar libro");
            System.out.println("4. Mostrar disco");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = lector.nextInt();
        
            switch(opcion){
                case 0:
                    System.out.println("Hasta luego");
                    break;
                    
                case 1:
                    System.out.print("Ingrese el título: ");
                    libro1.setTitulo(lector.next());
                    System.out.print("Ingrese el número de págs: ");
                    libro1.setPags(lector.next());
                    System.out.print("Ingrese el año de publicación: ");
                    libro1.setAño(lector.next());
                    System.out.print("Ingrese el precio: ");
                    libro1.setPrecio(lector.next());
                    break;
                
                case 2: 
                    System.out.print("Ingrese el título: ");
                    disco1.setTitulo(lector.next());
                    System.out.print("Ingrese la duracion: ");
                    disco1.setDuracion(lector.next());
                    System.out.print("Ingrese el precio: ");
                    disco1.setPrecio(lector.next());
                    break;
                    
                case 3:
                    libro1.Mostrar();
                    break;
                    
                case 4: 
                    disco1.Mostrar();
                    break;
                    
                default:
                    System.out.println("No es una opción!");
            }
        }while(opcion !=0);
    }  
}

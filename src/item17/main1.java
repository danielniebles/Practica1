/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item17;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class main1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        int i = 0,j = 0;
        ventas ventas1 = new ventas();
        double[] ventas = new double[2];
        libro libro1[] = new libro[2];
        disco disco1[] = new disco[2];
        do{
            System.out.println("=======Menú=======");
            System.out.println("1. Ingresar libro");
            System.out.println("2. Ingresar disco");
            System.out.println("3. Mostrar ventas de libros");
            System.out.println("4. Mostrar ventas de discos");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = lector.nextInt();
        
            switch(opcion){
                case 0:
                    System.out.println("Hasta luego");
                    break;
                    
                case 1:
                    libro1[i] = new libro();
                    System.out.print("Ingrese el título: ");
                    libro1[i].setTitulo(lector.next());
                    System.out.print("Ingrese el número de págs: ");
                    libro1[i].setPags(lector.next());
                    System.out.print("Ingrese el año de publicación: ");
                    libro1[i].setAño(lector.next());
                    System.out.print("Ingrese el precio: ");
                    libro1[i].setPrecio(lector.nextDouble());
                    i++;
                    break;
                
                case 2:
                    disco1[j] = new disco();
                    System.out.print("Ingrese el título: ");
                    disco1[j].setTitulo(lector.next());
                    System.out.print("Ingrese la duracion: ");
                    disco1[j].setDuracion(lector.next());
                    System.out.print("Ingrese el precio: ");
                    disco1[j].setPrecio(lector.nextDouble());
                    j++;
                    break;
                    
                case 3:
                    for(int k=0;k<libro1.length;k++){
                        ventas[k] = libro1[k].getPrecio();
                    }
                    ventas1.Leer(ventas,libro1.length);
                    ventas1.Mostrar();
                    break;
                    
                case 4:
                    for(int k=0;k<disco1.length;k++){
                        ventas[k] = disco1[k].getPrecio();
                    }
                    ventas1.Leer(ventas,disco1.length);
                    ventas1.Mostrar();
                    break;
                        
                default:
                    System.out.println("No es una opción!");
                    break;
            }
        }while(opcion !=0);
    }     
}

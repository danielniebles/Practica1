/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoArithmetic;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class main {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String cadena;
        char[] cifras1 = new char[3];
        char[] cifras2 = new char[3];
        arithmetic arithmetic1 = new arithmetic();
        System.out.print("Ingrese la cadena de prueba: ");
        cadena = lector.nextLine();
        String[] partes = cadena.split(" ");
        int[] b = new int[(partes.length-2)/2];
        int j = 0;
       
        for(int i=0;i<partes.length-2;i+=2){
            cifras1 = partes[i].toCharArray();
            if(i<partes.length-2){
            cifras2 = partes[i+1].toCharArray();
            }
            b[j] = arithmetic1.carry(cifras1, cifras2);
            j++;
        }
        arithmetic1.mostrar(b);
        
    }

}
//lista[i] = Integer.parseInt(partes[i]);

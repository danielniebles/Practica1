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
        System.out.print("Ingrese la cadena de prueba: ");
        cadena = lector.nextLine();
        String[] partes = cadena.split(" ");
        int[] lista = new int[partes.length];
        for(int i=0;i<partes.length;i++){
            lista[i] = Integer.parseInt(partes[i]);
        }  
    }
}

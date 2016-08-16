/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoEuler;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class main {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        System.out.print("Ingrese el número: ");
        int n;
        double suma = 0, aux = 0,aux2;
        n = lector.nextInt();
        for (int i=0;i<=n-1;i++){
            fraccion fraccion1 = new fraccion();
            aux = fraccion1.factorial(i);
            aux2 = 1/aux;
            suma = suma + aux2;  
        }
        System.out.println("El número euler es: "+suma);
    }
}

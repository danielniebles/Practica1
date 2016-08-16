/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item1;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Item10 {
    public static void main(String[] args) {
        int suma = 0, num = 1, n, aux;
        Scanner lector = new Scanner (System.in);
        System.out.print("Hasta cuantos terminos quiere: ");
        n = lector.nextInt();
        for (int i=0;i<=n-1;i++){
            System.out.println(suma);
            aux = suma;
            suma = suma+num;
            num = aux;
        }
    }
    
    
}

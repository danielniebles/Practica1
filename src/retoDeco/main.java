/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoDeco;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class main {
    public static void main(String[] args) {
        String sec;
        Scanner lector = new Scanner(System.in);
        deco deco1 = new deco();
        System.out.print("Ingrese la secuencia: ");
        sec = lector.next();
        char[] Sarray = sec.toCharArray();
        for (int i=0;i<Sarray.length;i+=2){    
            deco1.setA(Sarray[i]-48);
            if(i<Sarray.length){
                deco1.setB(Sarray[i+1]);
            }
            deco1.imprimir();
        }
    }
}

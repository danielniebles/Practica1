/*
Leer un número y calcularle el factorial a todos los enteros comprendidos entre 1 y el número
leído. 
 */
package item1;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Item11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int n;
        int fact = 1;
        System.out.print("Ingrese el número: ");
        n = lector.nextInt();        
        for (int i=0;i<=n;i++){
            for (int j=2; j<=i; j++){
                fact = fact*j;
            }
            System.out.println(i+"!: "+fact);
            fact=1;
        }  
    }
}

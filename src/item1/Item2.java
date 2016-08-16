/*
 Escriba un algoritmo que permita calcular la hipotenusa de un triángulo rectángulo utilizando
el teorema de Pitágoras.

 */
package item1;
import java.util.Scanner;

/**
 *
 * @author multi09
 */
public class Item2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        double cat1, cat2, hipot;
        
        System.out.print("Ingrese el cateto 1: ");
        cat1=lector.nextDouble();
        System.out.print("Ingrese el cateto 2: ");
        cat2=lector.nextDouble();
        
        hipot= Math.sqrt(Math.pow(cat1,2)+Math.pow(cat2,2));
        System.out.println("La hipotenusa es: "+hipot);
        
        
            
    }
          
}

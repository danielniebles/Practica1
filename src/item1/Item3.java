/*
Dado el valor del lado de un triángulo equilátero, haga un algoritmo que calcule su perímetro,
su altura y su área. 
 */
package item1;
import java.util.Scanner;

/**
 *
 * @author multi09
 */
public class Item3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        double lado, perim, altura, area;
        
        System.out.print("Ingrese el valor del lado: ");
        lado = lector.nextDouble();
        
        perim = lado*3;
        altura= ((Math.sqrt(3))*lado)/2;
        area = (lado*altura)/2;
        
        System.out.println("La altura es: "+altura+". El perimetro es: "+perim+
                ". El area es: "+area+".");
        
    }
}

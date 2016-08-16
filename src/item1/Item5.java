/*
La nota final del curso de Desarrollo de aplicaciones móviles está dividido en 5 partes: Quices
y seguimiento 20%, Prácticas de laboratorio 30%, Exposiciones 10%, Proyecto I 15% y
Proyecto Final el 25%, desarrolle un programa en java que permita calcular la nota final de
un estudiante del curso. Después de calcular la nota final el programa imprimirá lo siguiente
dependiendo de la nota:
a. Si la nota está entre 0 y 1 imprime “Estas en el lugar equivocado”
b. Si la nota está entre 1.1 y 2 imprime “Remal”
c. Si la nota está entre 2.1 y 3 imprime “Es posible recuperarse”
d. Si la nota está entre 3.1 y 4 imprime “Normalito”
e. Si la nota está entre 4.1 y 4.5 imprime “Muy Bien”
f. Si la nota está entre 4.6 y 5 imprime “Excelente estudiante”
 */
package item1;
import java.util.Scanner;

/**
 *
 * @author multi09
 */
public class Item5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        double seg, lab, expo, p1, pf, finalg;
  
        System.out.print("Ingrese la nota de seguimiento (20%): ");
        seg = lector.nextDouble();
        System.out.print("Ingrese la nota del Laboratorio (30%): ");
        lab = lector.nextDouble();
        System.out.print("Ingrese la nota de la Exposición (10%): ");
        expo = lector.nextDouble();
        System.out.print("Ingrese la nota del Proyecto I (15%): ");
        p1 = lector.nextDouble();
        System.out.print("Ingrese la nota del Proyecto Final (25%): ");
        pf = lector.nextDouble();
        
        finalg = seg*(0.2) + lab*(0.3) + expo*(0.1) + p1*(0.15) + pf*(0.25);
        System.out.println("La nota final es: "+finalg+".");
        
        if(finalg>=0 && finalg<=1){
            System.out.println("Estas en el lugar equivocado");
        }else if (finalg>1 && finalg<=2){
            System.out.println("Remal");
        }else if (finalg>2 && finalg<=3){
            System.out.println("Es posible recuperarse");
        }else if (finalg>3 && finalg<=4){
            System.out.println("Normalito");
        }else if (finalg>4 && finalg<=4.5){
            System.out.println("Muy bien");
        }else if (finalg>4.5){
            System.out.println("Excelente estudiante");
        }  
    }
    
}

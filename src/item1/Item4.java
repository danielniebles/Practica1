/*
Desarrollar un programa que calcule la nota definitiva de un estudiante en una asignatura, se
sabe que durante el semestre académico se manejan tres notas con sus respectivos
porcentajes así: seguimiento (50%), parcial I (25%) y parcial 2 (25%).
 */
package item1;
import java.util.Scanner;

/**
 *
 * @author multi09
 */
public class Item4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        double nota1, nota2, nota3, finalg;
        
        System.out.print("Ingrese la nota de seguimiento (50%): ");
        nota1 = lector.nextDouble();
        System.out.print("Ingrese la nota de Parcial I (25%): ");
        nota2 = lector.nextDouble();
        System.out.print("Ingrese la nota de Parcial II (25%): ");
        nota3 = lector.nextDouble();
        
        finalg = nota1*(0.5) + nota2*(0.25) + nota3*(0.25);
        System.out.println("La nota final es: "+finalg+".");
        
        
    }
    
}

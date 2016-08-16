/*
En un curso se practican 4 evaluaciones con los siguientes porcentajes: 25%, 20%, 25% y
30%. Para cada estudiante se informa el código y las 4 notas. Hacer un programa que calcule
la nota definitiva de cada estudiante, el promedio de notas definitivas del curso y el
porcentaje de perdedores. Sugerencia: Asuma que el curso está compuesto por N
estudiantes, usted es libre de asignar el valor de N, 50 o 10 por ejemplo
 */
package item1;  
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Item12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int N, opcion=0;
        double suma = 0;
        double porcentaje;
        int perdieron = 0;
        System.out.print("Ingrese el número de estudiantes: ");
        N = lector.nextInt();
        int[] codigo = new int[N];
        double[] nota1 = new double[N];
        double[] nota2 = new double[N];
        double[] nota3 = new double[N];
        double[] nota4 = new double[N];
        double[] notaf = new double[N];
        for (int i=0;i<=N-1;i++){
            System.out.print("Ingrese el código: ");
            codigo[i] = lector.nextInt();
            System.out.print("Ingrese la nota 1: ");
            nota1[i] = lector.nextDouble();
            System.out.print("Ingrese la nota 2: ");
            nota2[i] = lector.nextDouble();
            System.out.print("Ingrese la nota 3: ");
            nota3[i] = lector.nextDouble();
            System.out.print("Ingrese la nota 4: ");
            nota4[i] = lector.nextDouble();
            notaf[i] = (nota1[i]+nota2[i]+nota3[i]+nota4[i])/4;
            if (notaf[i] < 3){
                perdieron++;
            }
        }
        while (opcion != 4){
        System.out.println("==============Menú=============");
        System.out.println("1. Ver notas finales");
        System.out.println("2. Ver promedio del curso");
        System.out.println("3. Ver porcentaje de pérdida");
        System.out.println("4. Salir");
        System.out.print("Ingrese opción: ");
        opcion = lector.nextInt();
        
            switch (opcion){
                case 1:
                    for (int i=0;i<=N-1;i++){
                        System.out.println("Código: "+codigo[i]+" Nota final: "+notaf[i]);
                    }
                    break;
                case 2:
                    for (int i=0;i<=N-1;i++){
                        suma = suma + notaf[i];   
                    }
                    suma = suma/N;
                    System.out.println("Promedio del curso: "+suma);
                    break;
                case 3:
                    porcentaje = ((double)perdieron/(double)N)*100;
                    System.out.println("El porcentaje de pérdida del curso es: "+porcentaje+"%");
                    break;
                case 4:
                    break;
            }
        }
    }   
}

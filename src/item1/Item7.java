/*
Una oficina de seguros ha reunido datos concernientes a todos los accidentes de tránsito
ocurridos en el área metropolitana en el último año. Por cada conductor involucrado en un
accidente se toman los siguientes datos: año de nacimiento, sexo (1: Femenino, 2: Masculino),
registro del carro (1: Medellín, 2: Otras ciudades). Hacer un programa en java que muestre:
a) El porcentaje de conductores menores de 25 años.
b) El porcentaje de conductores del sexo femenino.
c) El Porcentaje de conductores cuyos carros están registrados fuera de Medellín.
*/
package item1;
import java.util.Scanner;

/**
 *
 * @author multi09
 */

public class Item7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int sexo, reg, año, edad;
        int menores = 0;
        int fem = 0;
        int masc = 0;
        int mede = 0;
        int otro = 0;
        int total = 0;
        int opcion = 0;
        double porcA, porcB, porcC;
        
        while (opcion != 3){
            System.out.println("========Menú=========");
            System.out.println("1. Ingresar usuario");
            System.out.println("2. Mostrar porcentajes");
            System.out.println("3. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = lector.nextInt();
        
            switch (opcion){

                case 1:   
                System.out.print("Ingrese el año de nacimiento: ");
                año = lector.nextInt();
                edad = 2016 - año;
                if (edad <= 25){
                    menores++;
                }
                System.out.print("Ingrese el sexo: 1. Femenino - 2. Masculino ");
                sexo = lector.nextInt();
                if (sexo == 1){
                    fem++;
                }else{
                    masc++;
                }
                System.out.print("Ingrese la ciudad de registro: 1. Medellín - 2. Otra ");
                reg = lector.nextInt();
                if (reg == 1){
                    mede++;
                }else{
                    otro++;
                }
                total++;
                break;

                case 2:
                    porcA = ((double)menores/(double)total)*100;
                    porcB = ((double)fem/(double)total)*100;
                    porcC = ((double)otro/(double)total)*100;
                    System.out.println("Porcentaje de conductores menores de 25 años: "+porcA+"%");
                    System.out.println("Porcentaje de conductores de sexo femenino: "+porcB+"%");
                    System.out.println("Porcentaje de autos no registrados en Medellín: "+porcC+"%");
                    break;

                case 3:
                    break;
            }
        }           
    }
}

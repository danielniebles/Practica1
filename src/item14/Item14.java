/*
Implemente un programa utilizando clases que permite calcular el área de las 
siguientes figuras trigonométricas: círculo, triangulo, cuadro y rectángulo. 
El programa debe visualizar un menú para que el usuario seleccione la figura 
deseada, al entrar en dicho menú se solicitan los datos necesarios al usuario 
para ejecutar el cálculo, después de esto debe volver al menú inicial.
 */
package item14;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Item14 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int opcion = 0;
        while (opcion != 5){
            System.out.println("=====Menú=====");
            System.out.println("1. Círculo");
            System.out.println("2. Triángulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Rectángulo");
            System.out.println("5. Salir");
            System.out.print("Ingrese la figura que desea: ");
            opcion = lector.nextInt();
            switch(opcion){
                case 1:
                    circulo circulo1 = new circulo();
                    circulo1.Inicializar();
                    circulo1.CalcArea();
                    break;
                case 2:
                    triangulo triangulo1 = new triangulo();
                    triangulo1.Inicializar();
                    triangulo1.CalcArea();
                    break;
                case 3:
                    cuadrado cuadrado1 = new cuadrado();
                    cuadrado1.Inicializar();
                    cuadrado1.CalcArea();
                    break;
                case 4:
                    rectangulo rectangulo1 = new rectangulo();
                    rectangulo1.Inicializar();
                    rectangulo1.CalcArea();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("No es una opción!");
                    break;      
            }
        }
    }
}

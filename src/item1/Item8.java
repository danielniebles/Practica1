/*
Escribir un programa utilizando la estructura Switch, que reciba dos números de dos cifras,
tome el primer número digitado y dependiendo del valor del último digito haga:
0: Diga cuál es mayor 
1: Diga cuál es menor 
2: Calcule la suma 
3: Calcule la resta 
4: Calcule la multiplicación 
5: Calcule la división
6: Diga si el primero es divisible por el segundo
7: Diga si el segundo es divisible por el primero
8: calcule la raíz cuadrada del primer número
9: Imprima en pantalla “Que punto tan fácil parce...”
 */
package item1;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Item8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int num1, num2, opcion, suma, resta, mult, mod;
        double div, raiz;
        System.out.print("Ingrese el primer número: ");
        num1 = lector.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = lector.nextInt();
        opcion = num1%10;
        switch (opcion){
            case 0:
                if (num1 > num2){                  
                    System.out.println("El primero es mayor");
                }else{
                    System.out.println("El segundo es mayor");
                }
                break;
            case 1:
                if (num1 < num2){                  
                    System.out.println("El primero es menor");
                }else{
                    System.out.println("El segundo es menor");
                }
                break;
            case 2:
                suma = num1 + num2;
                System.out.println("La suma es: "+suma);
                break;
            case 3:
                resta = num1 - num2;
                System.out.println("La resta es: "+resta);
                break;
            case 4:
                mult = num1*num2;
                System.out.println("La multiplicación es: "+mult);
                break;
            case 5:
                div = (double)num1/(double)num2;
                System.out.println("La division es: "+div);
                break;
            case 6:
                mod = num1%num2;
                if (mod == 0){
                    System.out.println("El primero es divisible por el segundo");
                }else{
                    System.out.println("El primero NO es divisible por el segundo");
                }
                break;
            case 7: 
                mod = num2%num1;
                if (mod == 0){
                    System.out.println("El segundo es divisible por el primero");
                }else{
                    System.out.println("El segundo NO es divisible por el primero");
                }
                break;
            case 8:
                raiz = Math.sqrt(num1);
                System.out.println("La raíz del primero es: "+raiz);
                break;
            case 9:
                System.out.println("Que punto tan fácil parce...");     
        }
        
    }
    
}

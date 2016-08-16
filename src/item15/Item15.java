/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item15;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Item15 {
    public static void main(String[] args) {
        int opcion;
        client cliente1 = new client();
        Scanner lector = new Scanner(System.in);
        do{
            System.out.println("=======Menú=======");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Actualizar datos");
            System.out.println("4. Consignación");
            System.out.println("5. Retirar");
            System.out.println("6. Mostrar saldo");
            System.out.println("0. Salir");
            System.out.print("Digite la opción deseada: ");
            opcion = lector.nextInt();

            switch(opcion){
                case 0: System.out.println("Hasta luego");
                    break;
                case 1: cliente1.Loading_Data();
                    break;
                case 2: cliente1.Data_Show();
                    break;
                case 3: cliente1.Actualizar_Datos();
                    break;
                case 4: cliente1.Consignacion();
                    break;
                case 5: cliente1.Retiro();
                    break;
                case 6: cliente1.Consultar_Saldo();
                    break;
                default:
                    System.out.println("Opción Inválida");
            }
        }while(opcion !=0);
    }
}

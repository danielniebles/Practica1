/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item18;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class main {
    public static void main(String[] args) {
        direccion direccion1 = new direccion();
        Scanner lector = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("========Menú========");
            System.out.println("1. Ingresar Nombre");
            System.out.println("2. Ingresar Dirección");
            System.out.println("3. Actualizar Nombre");
            System.out.println("4. Actualizar Dirección");
            System.out.println("5. Mostrar");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = lector.nextInt();
            switch (opcion){
                case 1:
                    direccion1.Leer_nombre();
                    break;
                case 2:
                    direccion1.Nueva_direccion();
                    break;
                case 3:
                    direccion1.Nuevo_nombre();
                    break;
                case 4:
                    direccion1.Nueva_direccion();
                    break;
                case 5:
                    direccion1.Mostrar2();
                    break;
            }
        }while(opcion != 0); 
    }
}

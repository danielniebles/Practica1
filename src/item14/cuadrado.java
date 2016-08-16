/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item14;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class cuadrado {
    private double lado;
    private double area;
    private Scanner teclado;
    
    public void Inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el lado: ");
        lado = teclado.nextInt();
    }
    public void CalcArea(){
        area = Math.pow(lado,2);
        System.out.println("El área es: "+area);
    }
    
}

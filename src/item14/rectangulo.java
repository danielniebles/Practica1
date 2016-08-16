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
public class rectangulo {
    private double lado1;
    private double lado2;
    private double area;
    private Scanner teclado;
    
    public void Inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el base: ");
        lado1 = teclado.nextInt();
        System.out.print("Ingrese la altura: ");
        lado2 = teclado.nextInt();
    }
    public void CalcArea(){
        area = lado1*lado2;
        System.out.println("El área es: "+area);
    }
}

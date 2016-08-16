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
public class triangulo {
    private Scanner teclado;
    private double base;
    private double altura;
    private double area;
    
    public void Inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        base = teclado.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = teclado.nextDouble();
    }
    public void CalcArea(){
        area = (base*altura)/2;
        System.out.println("El área es: "+area);
    }
}

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
public class circulo {
    private Scanner teclado;
    private double rad;
    private double area;
    
    public void Inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        rad = teclado.nextDouble();
    }
    public void CalcArea(){
        area = 3.14159*(Math.pow(rad,2));
        System.out.println("El área es: "+area);
    }
}

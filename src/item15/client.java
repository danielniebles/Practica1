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
public class client extends personal_date{
    private double saldo = 0;
    private Scanner lector = new Scanner(System.in);
    
    public void Actualizar_Datos(){
        System.out.println("Digite la dirección: ");
        setDir(lector.next());
        System.out.println("Digite el teléfono: ");
        setTel(lector.next());
    }
    public void Consignacion(){
        System.out.print("Digite el valor a consignar: ");
        saldo = lector.nextDouble();
    }
    public void Retiro(){
        double retiro;
        System.out.print("Digite el valor a retirar: ");
        retiro = lector.nextDouble();
        if (retiro>saldo){
            System.out.println("Saldo insuficiente");
        }else{
            saldo = saldo-retiro;
        }
    }
    public void Consultar_Saldo(){
        System.out.println("Su saldo es: "+saldo);
    }
}


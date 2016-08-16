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
public class personal_date {
    private String nombre, apellido, edad, cedula, fecha, dir, tel;

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public void Loading_Data(){
        Scanner lector = new Scanner(System.in);
        System.out.print("Digite el nombre: ");
        nombre = lector.next();
        System.out.print("Digite el apellido: ");
        apellido = lector.next();
        System.out.print("Digite edad: ");
        edad = lector.next();
        System.out.print("Digite la cédula: ");
        cedula = lector.next();
        System.out.print("Digite fecha: ");
        fecha = lector.next();
        System.out.print("Digite la dirección: ");
        dir = lector.next();
        System.out.print("Digite el teléfono: ");
        tel = lector.next();
    }
    
    public void Data_Show(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Cédula: "+cedula);
        System.out.println("Fecha: "+fecha);
        System.out.println("Dirección: "+dir);
        System.out.println("Nombre: "+tel);
    }
}

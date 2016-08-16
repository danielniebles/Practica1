/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item17;

/**
 *
 * @author Daniel
 */
public class ventas{
    private double total = 0;
    
    public void Leer(double[] arreglo, int x){
        for(int i=0;i<x;i++){
            total = total + arreglo[i];
        }
    }
    public void Mostrar(){
        System.out.println("Total:"+total);
        total = 0;
    }
}

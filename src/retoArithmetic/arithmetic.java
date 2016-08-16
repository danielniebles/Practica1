/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoArithmetic;

/**
 *
 * @author Daniel
 */
public class arithmetic {
    
    public int carry(char[] a,char[] b){
        int c = 0;
        int suma = 0;
        for(int i=0;i<a.length;i++){
            suma = a[i] + b[i] - 96;
            if (suma>9){
                c++;
            }
        }
        return c;
    }
    
    public void mostrar(int[] b){
        for(int i=0;i<b.length;i++){
            if(b[i] == 0 ){
                System.out.println("No carry operations");
            }else{
                System.out.println(b[i]+" carry operations");
            }
        }
        
    }
}

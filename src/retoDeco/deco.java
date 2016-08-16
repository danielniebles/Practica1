/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoDeco;

/**
 *
 * @author Daniel
 */
public class deco {
    
    private int a;
    private char b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(char b) {
        this.b = b;
    }
    
    public void imprimir(){
        for(int i=0;i<a;i++){
            System.out.print(b);   
        }
    }
}

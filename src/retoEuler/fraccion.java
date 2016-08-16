/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoEuler;

/**
 *
 * @author Daniel
 */
public class fraccion {
    private double denominador = 1;
 
    public double factorial(int n){
        for (int j=2; j<=n; j++){
                denominador = denominador*j;
            }
    return denominador;
    }
}


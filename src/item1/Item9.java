/*
Generar los números del 1 al 10 utilizando un ciclo que vaya de 10 a 1.
 */
package item1;

/**
 *
 * @author Daniel
 */
public class Item9 {
    public static void main(String[] args) {
        int contador = 0;
        for(int i=10;i>=1;i--){
            contador++;
            System.out.println(contador);
        }
    }
}

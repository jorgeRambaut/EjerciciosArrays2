/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author jorge
 */
public class Ejercicio14 {
    
    public static void main(String[] args) {
            int [] numeros = {3, 5, 1, 2, 1, 7, 0, -1};
            int mayor=0;
      
            for (int numero : numeros) {
                if (numero>mayor) {
                    mayor=numero;
                    
                }
             
        }
        System.out.printf("%s %d %s","El mayor Numero es ",mayor,"Del Array: ");
        System.out.print(Arrays.toString(numeros));
    }
    
}

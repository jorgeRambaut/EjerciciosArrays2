/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author jorge
 */
import java.util.Arrays;
import java.util.Collections;
public class EJercicio13 {
    
    public static void main(String[] args) {
    Integer [] numeros = {3, 5, 1, 2, 1, 7, 0, -1};
    Arrays.sort(numeros, Collections.reverseOrder());                                                                 
    
        System.out.println("Primer Mayor " + numeros[0]);
        System.out.println("Segundo Mayor " + numeros[1]);
        
        
        
    }
    
}

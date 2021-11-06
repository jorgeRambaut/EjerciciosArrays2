/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio12 {
    
    
    
    public static void main(String[] args) {
        int tamaño=0;
        int multiplos=0;
        Scanner lector = new Scanner(System.in);
        System.out.println("ingresar tamaño");
        tamaño=lector.nextInt();
        int array[] = new int[tamaño];
        System.out.println("Ingresar Numero");
        multiplos=lector.nextInt();
        
        for (int i = 0; i <array.length; i++) {
           array[i]=multiplos*(i+1);
            
        }
        System.out.println(Arrays.toString(array));
    }
    
}

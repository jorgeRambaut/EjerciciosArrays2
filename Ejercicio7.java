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
public class Ejercicio7 {
    public static void main(String[] args) {
        int tamaño =0;
        int multiplos=0;  
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresar Tamaño");
        tamaño=lector.nextInt();
        int [] vector = new int[tamaño];        
        System.out.println("Ingresar Numero");
        multiplos=lector.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
           vector[i]+=multiplos*i;
            
        }
        
        System.out.println(Arrays.toString(vector));
        
        
    }
}

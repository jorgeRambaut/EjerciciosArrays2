/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import static java.util.Arrays.binarySearch;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio6 {
       public static void main(String[] args) {
    int[] vector = new int[5];
    int busqueda=0;
    Scanner lector = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrear Numero");
            vector[i]=lector.nextInt();
            
        }
        
        System.out.println("Ingresar numero a buscar");
        busqueda=lector.nextInt();
        
        if (binarySearch(vector, busqueda)>=0) {
            
          System.out.println("Encontrado :) " + busqueda + " en Posicion " + binarySearch(vector, busqueda));

        
        }
        else{
        
            System.out.println("Lo Siento su numero no esta en el array :(");
        }
        

        
        
    }
}

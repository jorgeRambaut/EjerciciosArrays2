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
public class EJercicio5 {
    public static void main(String[] args) {
        int posicionN=0;
        System.out.println("Ingresar Tamaño");
        Scanner lector = new Scanner(System.in);
        posicionN=lector.nextInt();
        String [] vector = new String[posicionN];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingresar Nombre");
            vector[i]=lector.next();            
        }
        System.out.println(Arrays.toString(vector));
        

        
    }
}

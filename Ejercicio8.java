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
public class Ejercicio8 {
    public static void main(String[] args) {
     Scanner lector = new Scanner(System.in);
     int [] a = new int[5];   
     int [] b = new int[5]; 
     int [] c = new int[5]; 
        
        System.out.println("Ingresar Arreglo A[]");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingresar Numero");
            a[i]= lector.nextInt();
            
        }
        
        System.out.println("Ingresar Arrelgo B[]");
        for (int i = 0; i < b.length; i++) {
            System.out.println("Ingresar Numero");
            b[i]= lector.nextInt();;
            
        }
        
        for (int i = 0; i < c.length; i++) {
            c[i]=a[i]+b[i];
            
        }
        System.out.print("Arreglo A ");
        System.out.println(Arrays.toString(a));
        System.out.print("Arreglo B ");
        System.out.println(Arrays.toString(b));
        System.out.print("Arreglo C ");
        System.out.println(Arrays.toString(c));
        
    }
}

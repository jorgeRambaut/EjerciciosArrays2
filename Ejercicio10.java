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
public class Ejercicio10 {
    String paises[]={"Argentina","Brasil","Paraguay","Bolivia","Peru","Uruguay","Chile","Venezuela"};
    static void obtenerPais(String a[],int pos){        
      
        System.out.println("Pais "+a[pos] + " Posiscion " + pos);
        
    
    
    }
    
    
    public static void main(String[] args) {
        Ejercicio10 ejercicio10 = new Ejercicio10();
        int pos=0;
        Scanner lector = new Scanner(System.in);
        String paises[]=ejercicio10.paises;
        System.out.println("Ingresar Posicion");
        pos=lector.nextInt();
        System.out.print("Paises :");
        System.out.println(Arrays.toString(paises));        
        obtenerPais(paises,pos);
        
    }
    
    
}

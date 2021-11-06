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
public class Ejercicio11 {
    
    static int num(){
    int numa=0;
    numa=(int)(Math.random() * 101);    
    return numa;
    
    }
   
    static void  poneraCero(int a[],int pos){      
      
       a[pos]=0;        
    
    }
     
  
    
    
    public static void main(String[] args) {
        int arrayNumeros[] = new int[6];
        int pos =0;
        //lleno array 
        //TODO VER COMO PONER ESTE LLENADO EN UNA FUNCION
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i]=num();            
        }        
        
        System.out.println(Arrays.toString(arrayNumeros));
        System.out.println("Ingresar Posicion para poner su valor a 0");
        Scanner lector = new Scanner(System.in);
        pos=lector.nextInt();
        //restamos uno para  evitar out of bounds
        poneraCero(arrayNumeros,pos-1);
        System.out.println(Arrays.toString(arrayNumeros));

    }
    
    
    
}

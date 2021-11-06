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
public class Ejercicio9 {
    public static void main(String[] args) {
     
     int [] a = {1,3,-6,9,-23,-56};   
     int [] pos = new int[a.length]; 
     int [] neg = new int [a.length];
     
        for (int i = 0; i < a.length; i++) {
            if (a[i]>0) {                
                pos[i]=a[i];
                
            }
            else{
            neg[i]=a[i];
            
            
            }
            
        }
        System.out.print("Positivos");
        System.out.println(Arrays.toString(pos));
        System.out.print("Negativos");
        System.out.println(Arrays.toString(neg));
        
        
    }
}

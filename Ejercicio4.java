/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author jorge
 */
public class Ejercicio4 {
    public static void main(String[] args) {
    int[] vector = new int[10];
    double promedio=0;
        //lleno vector 
        for (int i = 0; i <vector.length; i++) {
            vector[i]=i*4;
            
        }
        //sumo valores
        for (int i = 0; i < vector.length; i++) {
            promedio+= vector[i];
            
        }
        //calculo promedio
        promedio=promedio/vector.length;
        
        System.out.println("Promedio " + promedio);
    }
          
}

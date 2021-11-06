/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Arrays;
import static java.util.Arrays.binarySearch;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class EJercicio15 {
    static String buscarCliente(){
    String cliente="";
    Scanner lector = new Scanner(System.in);
        System.out.println("Ingresar Cliente");        
        cliente=lector.next();
    return cliente;
    }
    
    public static void main(String[] args) {
    String clientes[]={"D10s","Guillote","Tota","Chitoro","Francis"};
    Arrays.sort(clientes);
    String cliente;
    System.out.println(Arrays.toString(clientes));
    cliente = buscarCliente();
    if (binarySearch(clientes, cliente)>=0) {
            
          System.out.println("Encontrado :) " + cliente + " en Posicion " + binarySearch(clientes, cliente));

        
        }
        else{
        
            System.out.println("Lo Siento su cliente no esta en el array :(");
        }
    
    
    
    }
    
}

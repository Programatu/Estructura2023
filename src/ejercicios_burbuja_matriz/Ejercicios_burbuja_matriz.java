/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_burbuja_matriz;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicios_burbuja_matriz {

   
    public static void main(String[] args) {
        //elabora un algoritmo que permita leer 20 numeros enteros en un arreglo e imprimirlos de mayor a menos
   
         int num []=new int [3];
        for (int i = 0; i < num.length;i++) {
          String numStr =JOptionPane.showInputDialog("ingresa el numero"+(i+1)+":");
          int numero=Integer.parseInt(numStr);
          num[i]=numero;
        }
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length -1; j++) {
                if (num [j]<num[j+1]) {
                     int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
            }  
        
              System.out.println("Arreglo ordenado");
             for (int numero:num){
             System.out.println(numero+" ");
        }       
    
         
         
 
         
        
        
       
    }         
  
    
}

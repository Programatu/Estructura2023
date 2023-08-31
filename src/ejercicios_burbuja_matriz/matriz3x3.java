/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_burbuja_matriz;

import java.util.Scanner;

/**
 *
 * @author Ana maria
 */
public class matriz3x3 {

    public static void main(String[] args) {
        
        //elabora un algoritmo que lea numeros enteros para los elementos de dos matrices de 3x3 y calcule en una 3er matriz cada elemento , la suma correspondiente de las dos anteriores
          Scanner entrada= new Scanner(System.in);
         int primeramatriz [][]=new int [3][3];
         int segundamatriz[][]=new int [3][3];
         int resultado[][]=new int [3][3];
           System.out.println("Digite los numeros de la primera matriz ");
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 System.out.print("Digite un numero en la posicion ["+i+"]["+j+"] : ");
                 primeramatriz[i][j]=entrada.nextInt();
             }
        }
          System.out.println("Digite los numeros de la segunda matriz");
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 System.out.print("Digite un numero en la posicion ["+i+"]["+j+"] : ");
                 segundamatriz[i][j]=entrada.nextInt();
             }
    }
          System.out.println("Primera matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(primeramatriz[i][j] + " ");
            }
            System.out.println();
        }
          System.out.println("Segunda matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(segundamatriz[i][j] + " ");
            }
            System.out.println();
        }
          for (int i = 0; i < primeramatriz.length; i++) {
             for (int j = 0; j < segundamatriz.length; j++) {
             resultado[i][j]=primeramatriz[i][j]+segundamatriz[i][j];
             }
        }
          System.out.println("\nSuma de las matrices es:");
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  System.out.print(resultado[i][j]+"");
                  
              }
                System.out.println(" ");
               
        }
          
     
        
        
        
        
        
        
        
        
        
        
        

    }
    
}

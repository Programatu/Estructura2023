/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_burbuja_matriz;

import java.util.Scanner;

public class Matriz_suma {
    public static void main(String[] args) {
        //Elabora un algortimo que lea los numeros en una matriz de 3x3, la imprima y coloque al final el resultado de la suma por columnas
        
         Scanner entrada= new Scanner(System.in);
         int primeramatriz [][]=new int [3][3];
         int segundamatriz[][]=new int [3][3];
         int resultado[][]=new int [3][3];
         
         //Llenamos la matriz 
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
         //Impresion de la matriz 1 y 2 
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
        //Sumar las columnas
        //sumar primera matriz
         int[] sumaColumnas1 = new int[3];
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                sumaColumnas1[j] += primeramatriz[i][j];
            }
        }
        //sumar segunda matriz
         int[] sumaColumnas2 = new int[3];
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                sumaColumnas2[j] += segundamatriz[i][j];
            }
        }
         System.out.println("Suma de las columnas de la Matriz 1:");
        for (int j = 0; j < 3; j++) {
            System.out.print(sumaColumnas1[j] + " ");
        }

        System.out.println("\nSuma de las columnas de la Matriz 2:");
        for (int j = 0; j < 3; j++) {
            System.out.print(sumaColumnas2[j] + " ");
        }
  
         /*
         //Suma de las matrices
         for (int i = 0; i < primeramatriz.length; i++) {
             for (int j = 0; j < segundamatriz.length; j++) {
             resultado[i][j]=primeramatriz[i][j]+segundamatriz[i][j];
             }
        }
         
         //Impresion de la suma
         System.out.println("La suma de la matriz es: ");
         for (int i = 0; i < primeramatriz.length; i++) {
             for (int j = 0; j < segundamatriz.length; j++) {
                 System.out.print(" [ "+primeramatriz[i][j]+" ]");
             }
             System.out.println("");
            
        }*/
         
         /*
          for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = primeramatriz[i][j] + segundamatriz[i][j];
            }
        }
         System.out.println("Matriz resultante (suma de las dos matrices):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
         */
         
         
    }
    
}

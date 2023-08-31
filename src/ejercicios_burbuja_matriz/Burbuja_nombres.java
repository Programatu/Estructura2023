/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_burbuja_matriz;


import javax.swing.JOptionPane;

public class Burbuja_nombres {

    public static void main(String[] args) {
        //Elabore un algortimo que permita leer 15 nombres de personas, los clasifique en orden ascendente y los imprima
        
        String nombre []=new String [3];

        for (int i = 0; i < nombre.length; i++) {
              String numNombres =JOptionPane.showInputDialog((i+1)+". Ingresa los nombres: ");
              nombre[i]=numNombres;
        }
        
        for (int i = 0; i < nombre.length -1; i++) {
            for (int j = 0; j < nombre.length  -1; j++) {
                 if (nombre[j].compareTo(nombre[j+1])>0) { //puedo modificar su forma ascendente y descendente 
                     String temp=nombre[j];
                    nombre[j]=nombre[j+1];
                    nombre[j+1]=temp;
                }
            }
            
        }
        
      System.out.println("Arreglo ordenado");
        for (String aux:nombre) {
            System.out.println(aux+"");
            
        }
    }
    
}

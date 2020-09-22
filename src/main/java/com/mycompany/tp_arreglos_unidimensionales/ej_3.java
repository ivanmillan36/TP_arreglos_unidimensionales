/*
 3.Crea un array o arreglo unidimensional donde tú le indiques el tamaño por teclado y 
crear una  función  que  rellene  el  array  o  arreglo  con  los  múltiplos  de  un  numero  pedido  por teclado. 
Por ejemplo, si defino un array de tamaño 5 y elijo un 3 en la función, el array contendrá 3, 6, 9, 12, 15. 
Muéstralos por pantalla usando otra función distinta.
 */
package com.mycompany.tp_arreglos_unidimensionales;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class ej_3 {
    public static void main(String[] args) {
        
        int arreglo[] = crearArreglo();
        rellenarArreglo(arreglo);
        imprimirArreglo(arreglo);
        
    }
    
    public static int[] crearArreglo(){
        System.out.println("Indique el tamaño del arreglo ingresando un numero entero: ");
        Scanner sc = new Scanner(System.in);
        int tamaño = sc.nextInt();
        return new int [tamaño];
    }
    
    public static void rellenarArreglo(int arreglo[]){
        System.out.println("Ingrese un entero para rellenar el arreglo con sus multiplos: ");
        Scanner sc = new Scanner(System.in);
        int multiplo = sc.nextInt();
        
        for (int i=0 ; i< arreglo.length ; i++ ){
            arreglo[i] = (i + 1) * multiplo;
        }
    }
    
    public static void imprimirArreglo(int arreglo[]){
        System.out.println("\nEl arreglo es el siguiente: ");
        System.out.println(Arrays.toString(arreglo));
    }
}

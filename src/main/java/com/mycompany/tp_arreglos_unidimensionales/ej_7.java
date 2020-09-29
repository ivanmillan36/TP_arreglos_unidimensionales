/*
7.Escriba una aplicación que solicite  y cargue en un arreglo 10  dígitos enteros, 
luego cree dos nuevos arreglos y asigne al primero los números ingresados por el usuario de formaa ascendente y 
en el segundo de forma descendente.Muestre los 2 arreglos por pantalla.
 */
package com.mycompany.tp_arreglos_unidimensionales;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class ej_7 {
    public static void main(String[] args) {
        int arreglo[] = new int[10];
        int arregloAscendente[];
        int arregloDescendente[];
        
        cargarArreglo(arreglo);
        System.out.println("Arreglo ingresado: " + Arrays.toString(arreglo));
        
        Arrays.sort(arreglo);
        arregloAscendente = arreglo;
        arregloDescendente = invertirArreglo(arregloAscendente);
        
        System.out.println("Arreglo ascendente: " + Arrays.toString(arregloAscendente));
        System.out.println("Arreglo descendente: " + Arrays.toString(arregloDescendente));
        
    }
    
    public static void cargarArreglo(int arreglo[]){
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i< arreglo.length; i++){
            System.out.println("Ingrese un entero para la posicion " + (i+1) + " del arreglo: ");
            arreglo[i] = sc.nextInt();
        }
    }
    
    public static int [] invertirArreglo (int arreglo[]){
        
        int nuevoArreglo[] = new int[arreglo.length];
        int cont = 0;
        
        for(int i=(arreglo.length -1) ; i >=0 ; i--){
            nuevoArreglo[cont] = arreglo[i];
            cont++;
        }
        return nuevoArreglo;
    }
    
}

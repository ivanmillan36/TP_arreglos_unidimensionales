/*
Dado 2 array de enteros, el primero de tamaño 5 y el segundo de tamaño 10, 
pedir los valores numéricosenteros para cargar cada uno de los arreglos,  
cree un tercer arreglo de tamaño 10 que contengaen casa posición la suma de la multiplicación
de cada elemento del array uno por cada elemento del array 2
ARRAY3= (posición 0 del arreglo 1 * posición 0 del arreglo 2) + (posición 0 del arreglo 1 *  posición  1  del  arreglo  2) 
+  (posición  0  del  arreglo  1  *  posición  2  del  arreglo  2)  + .............+ 
(posición 4 del arreglo 1 * posición 9 del arreglo 2) Use  2  estructuras  iterativas  anidadas  para  realizar  el  cálculo  y  
asignación  de  los  valores en el 3 array.
 */
package com.mycompany.tp_arreglos_unidimensionales;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class ej_10 {
    public static void main(String[] args) {
        int arreglo1[] = new int[5];
        int arreglo2[] = new int[10];
        int arreglo3[] = new int[10];
        
        cargarArreglo(arreglo1);
        cargarArreglo(arreglo2);
        
        calcularArreglo3(arreglo1, arreglo2, arreglo3);
        System.out.println(Arrays.toString(arreglo3));
        
    }
    
    public static void cargarArreglo(int arreglo[]){
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i< arreglo.length; i++){
            System.out.println("Ingrese un entero para la posicion " + (i+1) + " del arreglo: ");
            arreglo[i] = sc.nextInt();
        }
    }
    
    public static void calcularArreglo3(int arreglo1[] , int arreglo2[], int arreglo3[]) {
        int sumatoria = 0;
        
        for(int i=0 ; i<arreglo3.length; i++){
            for (int dato2: arreglo2){ 
                for(int dato1 : arreglo1){
                    sumatoria += (dato1 * dato2);
                }
            }
            arreglo3[i] = sumatoria;
            sumatoria = 0;
        }
        
    }
}

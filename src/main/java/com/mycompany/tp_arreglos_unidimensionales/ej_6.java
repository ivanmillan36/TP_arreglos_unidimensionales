/*
6.Realice  una búsqueda  secuencial  en  un  arreglo  unidimensional  de  tamaño  50
generado aleatoriamente mediante la función java random. Realice una búsqueda secuencial de la siguiente forma:
-se lee el valor que se desea buscar, 
-se compara la primera posición; 
-si soniguales, 
-fin de la búsqueda. 
-De lo contrario, compararlo con la segundaposición, y así sucesivamente. 
-Si se llega al final del arreglo y no se encontró elvalor, debe indicarlo con un mensaje apropiado. 
-Si se encuentra, se debe especificar la posición que ese valor ocupa en el arreglo por primera vez.
 */
package com.mycompany.tp_arreglos_unidimensionales;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class ej_6 {
    public static void main(String[] args) {
        int arreglo[] = new int[50];
            
        rellenarArreglo(arreglo);
        realizarBusqueda(arreglo);      
    }
    
    public static int [] rellenarArreglo(int arreglo[]){     
        for(int i=0; i< arreglo.length; i++){
            arreglo[i] = (int) ((Math.random() * 100) + 1);
        }
        System.out.println("Arreglo = " + Arrays.toString(arreglo) );
        return arreglo;
    }
    
    public static void realizarBusqueda(int arreglo[]){
        int posicion = 0;
        boolean encontrado = false;
        int dato = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un entero para buscarlo en el arreglo: ");
        dato = sc.nextInt();
        
        for(int i=0; i<arreglo.length ;i++){
            if(arreglo[i] == dato && encontrado == false){
                encontrado = true;
                posicion = i;
            }         
        }
        if(encontrado){
            System.out.println("Elemento encontrado en la posicion " + posicion + " del arreglo por primera vez.");
        }else{
            System.out.println("El elemento no se encuentra en el arreglo...");
        }
        
    }
}

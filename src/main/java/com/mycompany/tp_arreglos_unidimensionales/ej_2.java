/*
2.Crea  un  array  o  arreglo  unidimensional  con  un  tamaño  de  5,  
asignale  los  valores numéricos  manualmente  (los  que túquieras)  y  
muestralos  por  pantalla.  Solicite  los números mediante un bucle.
 */
package com.mycompany.tp_arreglos_unidimensionales;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author ivanmillan36
 */
public class ej_2 {
    public static void main(String[] args) {
        int arreglo[] = new int[5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < arreglo.length ; i++){
            System.out.println("\nIngrese un entero para la posicion " + (i+1) + " del arreglo: ");
            arreglo[i] = sc.nextInt();
            System.out.println("Numero almacenado: " + arreglo[i]);
        }
        
        System.out.println("\nEl arreglo quedo así: ");
        System.out.println(Arrays.toString(arreglo));
        }
    
}

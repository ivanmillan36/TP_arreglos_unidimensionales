/*
8.Solicite al usuario el ingreso de una cadena de números separadas por guiones medio, 
por ejemplo:45-9-8-6-45-23-21-74-96-32-45-25
Posteriormente aplique el método SPLIT de los String de Java para convertir la cadena en un arreglo, 
y calcular la suma total de los elementos y el valor promedio calculado.
 */
package com.mycompany.tp_arreglos_unidimensionales;

import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class ej_8 {
    public static void main(String[] args) {
        String cadena;
        String[] cadena_separada;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de numeros enteros separados por un guion medio(-)");
        cadena = sc.nextLine();
        
        cadena_separada = cadena.split("-");
        sumarArreglo(cadena_separada);
               
    }
    
    public static void sumarArreglo(String cadena[]){
        int suma = 0;
        for (String dato : cadena) {
            suma += Integer.parseInt(dato);
        }
        System.out.println("La suma de los elementos del arreglo es: " + suma);
        System.out.println("El promedio de los elementos del arreglo es: " + suma/cadena.length);
    }
}

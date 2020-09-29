/*
5.Escriba una aplicación para almacenar aleatoriamente20 números enterospositivos pares del 1 al 100,
de los cuales se desea saber: a) su promedio aritméticob) cuántos de los números son iguales al promedio aritméticoc)
cuántos de los números son mayores que el promedio aritméticod) cuántos de los números son menores que el promedio aritmético
 */
package com.mycompany.tp_arreglos_unidimensionales;

import java.util.Arrays;



/**
 *
 * @author ivanmillan36
 */
public class ej_5 {
    public static void main(String[] args) {
        int arreglo[] = new int[20] ;
        int promedio = 0;
        
        
        rellenarArreglo(arreglo);
        promedio = calcularPromedioArreglo(arreglo);
        System.out.println("El promedio es: " + promedio);
        System.out.println("Cantidad de numeros iguales al promedio: " + cantNumerosIgualesAlPromedio(arreglo, promedio));
        System.out.println("Cantidad de numeros mayores al promedio: " + cantNumerosMayoresAlPromedio(arreglo, promedio));
        System.out.println("Cantidad de numeros menores al promedio: " + cantNumerosMenoresAlPromedio(arreglo, promedio));
    }
    
    
    public static int [] rellenarArreglo(int arreglo[]){     
        for(int i=0; i< arreglo.length; i++){
            arreglo[i] = (int) ((Math.random() * 100) + 1);
        }
        System.out.println("Arreglo = " + Arrays.toString(arreglo) );
        return arreglo;
    }
    
    public static int calcularPromedioArreglo(int arreglo[]){
        int promedio = 0;
        for(int i=0; i< arreglo.length; i++){
            promedio += arreglo[i];
        }
        return promedio / arreglo.length;
    }
    
    public static int cantNumerosIgualesAlPromedio(int arreglo[], int promedio){
        int cant = 0;
        for(int i=0; i< arreglo.length; i++){
            if(arreglo[i] == promedio){
                cant++;
            }
        }
        return cant;
    }
    
    public static int cantNumerosMayoresAlPromedio(int arreglo[], int promedio){
        int cant = 0;
        for(int i=0; i< arreglo.length; i++){
            if(arreglo[i] > promedio){
                cant++;
            }
        }
        return cant;
    }
    
    public static int cantNumerosMenoresAlPromedio(int arreglo[], int promedio){
        int cant = 0;
        for(int i=0; i< arreglo.length; i++){
            if(arreglo[i] < promedio){
                cant++;
            }
        }
        return cant;
    }
}

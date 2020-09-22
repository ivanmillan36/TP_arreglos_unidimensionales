/*
4.Escriba una aplicación que: 
a)lea  20  números decimales ingresados  por  teclado  por  el  usuario
  y  los  coloque  en  unarreglo unidimensional.
b)determine y muestre el mayor de los números en el arreglo
c)determine y  muestre  el  menor  de  los  números  del  arreglo ,calcule  y  muestre  el  
  rango (diferencia entre el mayor y el menor) de los elementos en el arreglo.
 */
package com.mycompany.tp_arreglos_unidimensionales;

import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class ej_4 {
    public static void main(String[] args) {
        mensajeInicial();
        Float arreglo[] = new Float[20];
        rellenarArreglo(arreglo);
        Float mayor = encontrarMayor(arreglo);
        Float menor = encontrarMenor(arreglo);
        
        System.out.println("El mayor numero del arreglo es: " + mayor);
        System.out.println("El rango del arreglo es: " + getRango(mayor, menor));
        
    }
    
    public static void mensajeInicial() {
        System.out.println("Vamos a pedirle que ingrese 20 numeros decimales "
                + "para encontrar el mayor de ellos y calcularemos "
                + "la diferencia entre el mayor y el menor");
    }
    
    public static void rellenarArreglo(Float arreglo[]){
        
        Scanner sc = new Scanner(System.in);
        
        for (int i=0 ; i< arreglo.length ; i++ ){
            System.out.println("\nIngrese un entero para la posicion " + (i+1) + " del arreglo: ");
            arreglo[i] = sc.nextFloat();
            System.out.println("Numero almacenado: " + arreglo[i]);
        }
    }
    
    public static Float encontrarMayor (Float[] arreglo ){
        
        Float mayor = (float)0;
        
        for (int i=0 ; i < arreglo.length ; i++){
            if (arreglo[i] > mayor){
                mayor = arreglo[i];
            }
        }
        
        return mayor;
    }
    
    public static Float encontrarMenor (Float[] arreglo ){
        
        Float menor = (float)arreglo[0];
        
        for (int i=0 ; i < arreglo.length ; i++){
            if (arreglo[i] < menor){
                menor = arreglo[i];
            }
        }
        
        return menor;
    }
    
    public static Float getRango( Float a, Float b){
        if (a > b){
            return a - b;
        }else if(b > a){
            return b - a;
        }else return (float)0;
    } 
}

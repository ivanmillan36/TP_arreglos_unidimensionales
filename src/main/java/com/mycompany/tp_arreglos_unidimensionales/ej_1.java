/*
1.¿Qué sucede si tratamos de acceder un elemento fuera del tamaño del array?
 */
package com.mycompany.tp_arreglos_unidimensionales;

/**
 *
 * @author ivanmillan36
 */
public class ej_1 {
    public static void main(String[] args) {
        
        int [] arreglo = new int[5];
        
        arreglo[5] = 10;
        
    }
}
/* Si tratamos de acceder a un elemento fuera del tamaño del array obtenemos el siguiente mensaje de error cuando 
 ejecutamos el programa:

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at com.mycompany.tp_arreglos_unidimensionales.ej_1.main(ej_1.java:15)
Command execution failed.

Se lanza una excepcion que indica que se ha accedido a una matriz con un índice ilegal. 
El índice es negativo o mayor o igual que el tamaño de la matriz.

*/
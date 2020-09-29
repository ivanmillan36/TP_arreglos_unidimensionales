/*
9.En Argentina cada  persona  está  identificada  con  un  Documento  Nacional  de  Identidad (DNI) en el que figura un número y una letra, 
por ejemplo 56999545W . La  letra  que  sigue  al  número  se  calcula  siguiendo  la  metodología  que  vamos  a  indicar. 
Crea  un  programa  que  calcule  la  letra  de  un  DNI  a  partir  del  número  de  DNI  que introduzca el usuario. 
Es decir, se debe pedir el DNI sin la letra por teclado y el programa nos devolverá el DNI completo (con la letra).
Para calcular la letra, se debe tomar el resto de dividir nuestro número de DNI entre 23. El resultado debe estar por tanto entre 0 y 22.
Crea  un  método  obtenerLetra(int  numeroDNI)  donde  según  el  resultado  de  la  anterior fórmula busque en un array de caracteres la posición que corresponda a la letra. 
Esta es la tabla de caracteres:Posición 0123456789101112131415 16171819202122 Letra TRWAGMYFPDXBNJZSQVHLCKE Por ejemplo, si introducimos elDNI 20267079, el resto de dividirlo por 23 sería 8, 
luego la letra sería la P, que es la que ocupa esa posicionen la matriz de caracteres.
 */
package com.mycompany.tp_arreglos_unidimensionales;

import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class ej_9 {
    public static void main(String[] args) {
        
        int dni;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de DNI: ");
        dni = sc.nextInt();
        System.out.println("El dni con letra es: " + obtenerLetra(dni));
    }
    
    public static String obtenerLetra(int dni){
        char arregloLetras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        return dni + Character.toString(arregloLetras[dni % 23]);
    }
}

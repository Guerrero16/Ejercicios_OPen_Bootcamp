/*
Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
 */

package com.raul.ejercicios_tema4;

/**
 *
 * @author R-pc
 */
public class bucle_if {

    public static void main(String[] args) {

        int numeroIf = -4;
        
        if (numeroIf == 0) {
			System.out.println("El número es neutro");
		} else if (numeroIf < 0) {
			System.out.println("El número es negativo");
		} else {
			System.out.println("El número es positivo");
		}
		
    }
}

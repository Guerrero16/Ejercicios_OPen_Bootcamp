/*
Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
 */

package com.raul.ejercicios_tema4;

public class bucle_Do_While {
    public static void main(String[] args) {
        int i = 0;
    
    while(i != 0) {
      System.out.println("WHILE");  // No se ejecuta.
    }do {
      System.out.println("DO-WHILE"); // Se ejecuta una vez.
    } while(i != 0); 
    }
}

/*  
    Por último, para el Switch, deberás crear la variable estacion, 
    y distintos case para las cuatro estaciones del año. Dependiendo 
    del valor de la variable estacion se deberá mandar un mensaje por 
    consola informando de la estación en la que está. También habrá 
    que poner un default para cuando el valor de la variable no sea una estación.
*/

package com.raul.ejercicios_tema4;

public class bucle_Switch {
    public static void main(String[] args) {
        var estacion = "OTOÑO";

        switch (estacion) {
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}

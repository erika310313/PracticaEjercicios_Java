/* Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java. */

package javaIntro;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa una frase cualquiera: ");
        String frase = leer.nextLine();

        System.out.println("La frase en minúscula es: " + frase.toLowerCase());
        System.out.println("La frase en mayúscula es: " + frase.toUpperCase());

    }
}

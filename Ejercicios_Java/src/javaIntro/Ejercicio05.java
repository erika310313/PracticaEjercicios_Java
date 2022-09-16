/* Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */

package javaIntro;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una temperatura en grados centígrados: ");
        double temperatura = leer.nextDouble();

        temperatura = 32 + (9 * temperatura / 5);

        System.out.println("La temperatura en grados Fahrenheit es: " + temperatura);
    }
}

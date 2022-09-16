/* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla. */

package javaIntro;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = leer.nextLine();

        System.out.println("Ingresaste el nombre: " + nombre);
    }
}

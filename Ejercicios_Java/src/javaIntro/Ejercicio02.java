/* Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma */

package javaIntro;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número entero");
        int num1 = leer.nextInt();

        System.out.println("Ingrese otro número entero");
        int num2 = leer.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma de ambos número es: " + suma);

    }
}

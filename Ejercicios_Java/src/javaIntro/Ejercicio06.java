/* Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt(). */

package javaIntro;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int num = leer.nextInt();

        System.out.println("El doble del número ingresado es: " + num * 2 + "\n");
        System.out.println("El triple del número ingresado es: " + num * 3 + "\n");
        System.out.println("La raiz cuadrada del número ingresado es: " + Math.sqrt(num));
    }
}

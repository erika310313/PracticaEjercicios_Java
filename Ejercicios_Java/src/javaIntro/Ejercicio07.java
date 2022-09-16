/* Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla. */

package javaIntro;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int num1 = leer.nextInt();

        System.out.println("Ingrese otro número entero: ");
        int num2 = leer.nextInt();

        if (num1 > num2){
            System.out.println("El número mayor es: " + num1);
        } else {
            System.out.println("El número mayor es: " + num2);
        }
    }
}

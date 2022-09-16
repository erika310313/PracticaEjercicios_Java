/* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial. */

package javaIntro;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num = 0;
        int suma = 0;
        int limite = 0;

        System.out.println("Ingrese un valor límite positivo: ");
        limite = leer.nextInt();

        while (suma <= limite){

            System.out.println("Ingrese el número que desea sumar: ");
            num = leer.nextInt();

            suma = suma + num;

            if (suma <= limite){
                System.out.println(suma + " aún es menor que el " + limite);
            }

        } ;

            System.out.println(suma + " superó el límite de: " + limite);
    }
}

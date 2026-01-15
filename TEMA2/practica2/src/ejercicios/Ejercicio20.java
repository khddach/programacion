package ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

    public static boolean esPrimo(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        /*
          Programa que, dado un número entero positivo introducido por teclado, visualice por
           pantalla todos los números primos menores que él.
           Utiliza la función del ejercicio anterior. Ejemplo:
          */

        int num;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.print("Dime un número positivo: ");
            num = sc.nextInt();

            if (num < 1) {
                System.out.println("Error: Has introducido un número menor que 1");
            }

        } while (num < 1);


        System.out.print("Los primos menores de " + num + " son: 1");

        for (int i = 2; i < num; i++) {
            if (esPrimo(i)) {
                System.out.print("," + i);
            }
        }




    }

}
package ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

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
          Diseña un método que indique si un número entero pasado como parámetro
          es o no un número primo (devuelve un boolean).
          Un número primo es aquel que tiene por divisores el 1 y el propio número, únicamente.
          */
        int numero = 17;

        if (esPrimo(numero)) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }



    }

}
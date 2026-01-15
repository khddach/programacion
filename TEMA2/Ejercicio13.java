package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
            13. Programa que muestre por pantalla los números del 1 al 100 sin mostrar los que sean múltiplos de 5.
         */


       // ------------------- method 1 -------------------
        for (int i = 1; i <= 100 ; i++) {
            if (i % 5 != 0) {
                System.out.println(i);
            }
        }

        //------------------- method 2 -------------------
        for (int i = 1; i <= 100 ; i++) {
            if (i % 5 == 0) {
                continue;
            }

            System.out.println(i);
        }


    }

}
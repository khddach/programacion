package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
       /* Programa que lea un número por teclado e indique si es múltiplo de 2, 3, 5 o 7.*/


        int num ;
        int countMUltiplo = 0 ;
        Scanner sc = new Scanner(System.in);

        System.out.println("dame la numero: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " es múltiplo de 2");
            countMUltiplo++;
        }

        if (num % 3 == 0) {
            System.out.println(num + " es múltiplo de 3");
            countMUltiplo++;
        }

        if (num % 5 == 0) {
            System.out.println(num + " es múltiplo de 5");
            countMUltiplo++;
        }


        if (num % 7 == 0) {
            System.out.println(num + " es múltiplo de 7");
            countMUltiplo++;
        }

        if (countMUltiplo == 4 ) {
            System.out.println(num + " es múltiplo de 2, 3, 5 o 7");
        } else {
            System.out.println( num + " no es múltiplo de 2, 3, 5 o 7" );
        }


        // method 2
        System.out.println("method 2");

        if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0 && num % 7 == 0) {
            System.out.println(num + " es múltiplo de 2, 3, 5 o 7");
        }else {
            System.out.println( num + " no es múltiplo de 2, 3, 5 o 7" );
        }

    }
}

package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
            Programa que lea números hasta que le den el cero, y que diga cuál ha sido el mayor y cuál el menor de
los números introducidos (sin tener en cuenta el cero).
         */

        int min = 0,max = 0, num ;
        Scanner sc = new Scanner(System.in);
        boolean primer = true;

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (primer) {
                min = num;
                max = num;
                primer = false;
            }

            if (max < num) {
                max = num ;
            }

            if (min > num) {
                min = num ;
            }
        }

        System.out.println(max);
        System.out.println(min);
    }

}
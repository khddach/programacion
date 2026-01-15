package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        /*
           Programa que lea un entero positivo introducido por el usuario y que muestre por pantalla todos sus
divisores.
          */

        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número : ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                System.out.println(i);
            }
        }

    }

}
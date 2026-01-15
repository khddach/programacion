package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*
        12. Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =
        número de líneas, que se pida por teclado.
           *
          ***
         *****
        *******
          .*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de estrellas:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            String spaces = "";
            String estrellas = "";

            for (int j = i; j <= num; j++) {
                spaces += " ";
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                estrellas += "*";
            }

            System.out.println(spaces + estrellas);

        }
    }
}
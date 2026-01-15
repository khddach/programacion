package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
            Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =
            número de líneas, que se pida por teclado.
            *
            **
            ***
            ****
          .*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de estrellas:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            String estrellas = "";

            for (int j = 1; j <= i; j++) {
                estrellas += "*";
            }
            System.out.println(estrellas);

        }

    }
}
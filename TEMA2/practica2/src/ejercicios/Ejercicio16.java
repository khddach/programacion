package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        /*
            Programa que lea por teclado una serie de números enteros hasta que introduzca el -1 y obtenga su media. Deberá mostrarla por pantalla.
         */

        int num ,contador = 0,suma = 0;
        double media;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Escribe el número: ");
            num = sc.nextInt();

            if (num != -1) {
                suma = suma + num ;
                contador++;
            }

        } while (num != -1);


        media = (double) suma / contador ;

        System.out.println(media);

    }

}
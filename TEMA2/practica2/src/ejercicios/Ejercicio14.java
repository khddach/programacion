package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        /*
           14. Programa que lea dos números positivos e imprima por pantalla todos los números pares que estén entre
los dos números dados. También debe indicar cuántos números pares hay en ese intervalo.
         */

        int num1,num2, contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el primer número positivo: ");
        num1 = sc.nextInt();

        System.out.print("Escribe el segundo número positivo: ");
        num2 = sc.nextInt();

        if (num2 < num1) {
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }

        for (int i = num1; i <= num2; i++) {
           if (i % 2 == 0){
               System.out.println(i);
               contador++;
           }
        }

        System.out.println("La suma de los números pares es :" + contador);
    }

}
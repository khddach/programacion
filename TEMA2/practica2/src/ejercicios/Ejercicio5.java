package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
       /* Programa que pida al usuario un número repetidamente hasta que esté entre 1 y 10.*/

        Scanner sc = new Scanner(System.in);
        int num = 0;

        do {

            System.out.print("Introduce un numero entre 1 y 10 : ");
            num = sc.nextInt();

            if (num < 1 || num > 10) {
                System.out.println("Error: Un numero mo entre 1 y 10.");

            } else {
                System.out.println("Bueno, has introducido un numero correcto -->  " + num);

            }

        } while (num < 1 || num > 10) ;



        //method 2
        System.out.println("------------------- method 2 -------------------");
        num = 0;

        while (num < 1 || num > 10){
            System.out.print("Introduce un numero entre 1 y 10 : ");
            num = sc.nextInt();

            if (num < 1 || num > 10) {
                System.out.println("Error: Un numero mo entre 1 y 10.");
            }
        }

        System.out.println("Bueno, has introducido un numero correcto -->  " + num);
    }
}

package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio21 {


    public static void main(String[] args) {
        /*
          21. Pedir un número entero positivo N. A continuación, introducir por teclado N números enteros.
          Mostrar la media de los N números introducidos, el mayor y el menor.
          */

        int telcadoNum = 0,max = 0,min = 0,suma = 0,media = 0;

        Scanner sc = new Scanner(System.in);


        do {


            try {
                System.out.print("Dime un número positivo: ");
                telcadoNum = sc.nextInt();

                if (telcadoNum <= 0) {
                    System.out.println("Error: Has introducido un número menor que 1");
                }

            } catch (InputMismatchException  e) {
                System.out.println("Escribe bien el número");
                //sc.nextLine();
                sc = new Scanner(System.in);
            }

        } while (telcadoNum <= 0);


        for (int i = 1; i <= telcadoNum ; i++) {

            int num = 0;
            do {

                try {
                    System.out.print("Dime un número " + i + ": ");
                    num = sc.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Escribe bien el número");
                    //sc.nextLine();
                    sc = new Scanner(System.in);
                }

            } while(num <= 0);


            if (i == 1) {
                min =  num;
                max =  num;
            }

            if (max <  num) {
                max =  num;
            }

            if (min >  num) {
                min =  num;
            }

            suma +=  num ;

        }


        media = suma / telcadoNum ;


        System.out.println("Mayor: " + max);
        System.out.println("Menor: " + min);
        System.out.println("Media: " + media);

    }

}
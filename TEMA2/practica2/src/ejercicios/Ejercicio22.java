package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio22 {


    public static void main(String[] args) {
        /*
          22. Pedir un número entre 1 y 9999 y decir si es capicúa.

          */

        int telcadoNum = 0;

        Scanner sc = new Scanner(System.in);


        do {


            try {
                System.out.print("Dime un número positivo: ");
                telcadoNum = sc.nextInt();

                if (telcadoNum < 1 || telcadoNum > 9999) {
                    System.out.println("Error: Pedir un número entre 1 y 9999");
                }

            } catch (InputMismatchException  e) {
                System.out.println("Escribe bien el número");
                //sc.nextLine();
                sc = new Scanner(System.in);
            }

        } while (telcadoNum < 1 || telcadoNum > 9999);


        int capicua = 0;
        int num = telcadoNum ;
        while (num > 0) {
            int digito = num % 10;
            capicua = capicua * 10 + digito;
            num = num / 10;
        }



        if (capicua == telcadoNum) {
            System.out.println(telcadoNum + " es capicua : " + capicua);
        } else {
            System.out.println(telcadoNum + " no es capicua : " + capicua);
        }



    }

}
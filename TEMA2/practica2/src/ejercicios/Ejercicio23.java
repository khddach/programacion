package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio23 {


    public static void main(String[] args) {
        /*
         23 . Pedir el día, mes y año de una fecha y mostrar la fecha del día siguiente (sin años bisiestos).
           Hacer primero una función para determinar que la fecha introducida es correcta.

          */


        Scanner sc = new Scanner(System.in);

        int dia = 0, mes = 0, anio = 0;
        int dias = 0;




        while (true) {

            try {
                System.out.print("Dime el día: ");
                dia = sc.nextInt();
                System.out.print("Dime el mes: ");
                mes = sc.nextInt();
                System.out.print("Dime el año: ");
                anio = sc.nextInt();

            } catch (InputMismatchException  e) {
                System.out.println("Escribe bien el número");
                //sc.nextLine();
                sc = new Scanner(System.in);
                continue;
            }


            switch (mes) {
                case 1,3,5,7,8,10,12:
                    dias = 31;
                    break;
                case 4,6,9,11:
                    dias = 30;
                    break;
                case 2:
                    dias = 28;
                    break;
            };

            if (mes < 1 || mes > 12) {
                continue;
            }

            if (dia < 1 || dia > dias) {
               continue;
            }

            if (anio < 1) {
                continue;
            }

            break;

        }

        dia++;

        if (dia > dias) {
            dia = 1 ;
            mes++;

        }

        if (mes > 12) {
            mes = 1 ;
            anio++;
        }

        System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + anio);

    }

}
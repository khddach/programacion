package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio24 {
    public static int diasMes(int mes , int anio) {
        int dias = 0;
        switch (mes) {
            case 1,3,5,7,8,10,12:
                dias = 31;
                break;
            case 4,6,9,11:
                dias = 30;
                break;
            case 2:
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
        };
        return dias ;
    }
    public static boolean esFechaValida(int dia, int mes, int anio) {

        int dias = diasMes(mes,anio);


        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || dia > dias) {
            return false;
        }

        if (anio < 1) {
            return false;
        }

        return true ;
    }

    public static void main(String[] args) {

        /*
         Escribe un método, de nombre esFechaValida, que reciba como parámetros tres valores enteros con el día,
          mes y año de una fecha y devuelva un valor booleano que indique si se trata de valores válidos para una fecha.
           Si puedes comprueba también que el año sea bisiesto.
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

            if (!esFechaValida(dia,mes,anio)) {
                continue;
            }


            break;

        }

        dias = diasMes(dia,anio);

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
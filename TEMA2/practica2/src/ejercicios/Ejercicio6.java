package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*  Programa que sume los 100 primeros números enteros impares.  .*/


        int suma = 0;
        int numero = 1;
        int contador = 1;

//        while (contador <= 100) {
//            suma += numero;
//            numero += 2;
//            contador++;
//        }

        while (contador <= 100) {

            if (numero % 2 != 0) {
                suma += numero;
                contador++;
            }

            numero += 1;

        }

        System.out.println("La suma de los primeros 100 números impares es " + suma);



        //method 2
        System.out.println("------------------- method 2 -------------------");
        suma = 0;
        contador = 0;

        for (int i = 1; i < 500; i += 2) {

            if (contador == 100){
                break;
            }

            suma += i;
            contador++;
        }
        System.out.println("La suma de los primeros 100 números impares es " + suma);

    }
}
package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        /*  Programa que imprima la tabla de multiplicar de cualquier número entre el 1 y el 10 introducido por teclado.  .*/

        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("calcular la tabla de multiplicar");
        System.out.print("Introduce un número : ");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + ( num * i ));
        }
    }
}
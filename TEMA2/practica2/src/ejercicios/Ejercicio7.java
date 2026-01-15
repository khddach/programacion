package ejercicios;

public class Ejercicio7 {

    public static long factorial(int numero) {
        long resultado = 1 ;
        for (int i = numero; i >= 1; i--) {
            resultado = resultado * i ;
        }
        return resultado ;
    }

    public static void main(String[] args) {
        /*  Función que calcule el factorial de un número entero positivo pasado como parámetro.  .*/

        int numero = 4;
        System.out.println("factorial numero " + numero + " es: " + factorial(numero));

    }
}
package ejercicios;

public class Ejercicio1 {

   /* Crea una función (método) que reciba como parámetros tres números enteros y devuelva el mayor de
    los tres números. Utilizar esa función para el calcular el mayor de cuatro números enteros. Sería así:
    public int mayor (int a, int b, int c) { … }
    */

    public static int mayor (int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {

        System.out.println(mayor(9,8,9));

    }
}

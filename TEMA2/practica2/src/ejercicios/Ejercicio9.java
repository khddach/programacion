package ejercicios;

public class Ejercicio9 {

    public static int cuantosDigitos(long num) {
        int count = 0;

        if (num == 0) {
            num = 1;
        }


        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count ;
    }

    public static void main(String[] args) {
        /*  Crea un método que, dado un número entero pasado como parámetro, devuelva cuántos dígitos lo
forman. P.ej.: el número 54326 consta de 5 dígitos. Pista: cuántas veces se puede dividir entre 10.   .*/


        System.out.println(cuantosDigitos(54326));
        System.out.println(cuantosDigitos(100));
        System.out.println(cuantosDigitos(1));
        System.out.println(cuantosDigitos(0));

    }
}
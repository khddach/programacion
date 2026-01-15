package ejercicios;

public class Ejercicio4 {

    public static void calcBilletes(int cantidad) {
        int resto = 0;

        int billete200 = cantidad / 200;

        if (cantidad >= 200) {
            System.out.println(billete200 + " billete(s) de 200 euros");
        }


        resto = cantidad % 200;
        int billete100 = resto / 100;

        if (resto >= 100) {
            System.out.println(billete100 + " billete(s) de 100 euros");
        }


        resto = resto % 100;
        int billete50 = resto / 50;


        if (resto >= 50) {
            System.out.println(billete50 + " billete(s) de 50 euros");
        }

        resto = resto % 50;
        int billete10 = resto / 10;


        if (resto >= 10) {
            System.out.println(billete10 + " billete(s) de 10 euros");
        }

        resto = resto % 10;
        int billete5 = resto / 5;


        if (resto >= 5) {
            System.out.println(billete5 + " billete(s) de 5 euros");
        }


        resto = resto % 5;
        System.out.println("sobran " + resto + " euros");
    }

    public static void main(String[] args) {
       /* Crea una función que no devuelva nada (void) que, dado un importe en euros, nos indique el mínimo
        número de billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad. Ejemplo:
        362 euros → 1 billete de 200, 1 billete de 100, 1 billete 50, un billete de 10, sobran 2 euros. Pista: hay
        que ir sacando la división entera, y el resto se lleva al siguiente billete.*/


        int cantidad = 362;
        calcBilletes(cantidad);

    }


}

package ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {
       /* Crea una función que no devuelva nada (void) que, dado un importe en euros, nos indique el mínimo
        número de billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad. Ejemplo:
        362 euros → 1 billete de 200, 1 billete de 100, 1 billete 50, un billete de 10, sobran 2 euros. Pista: hay
        que ir sacando la división entera, y el resto se lleva al siguiente billete.*/


        int price =  12370;
        int resto = price;

        int price200 =  0;
        int price100 =  0;

        price200 = price / 3600;
        resto = resto % 3600;
        System.out.println(price200);


        price100 = resto / 60;
        resto = resto % 60;

        System.out.println(price100);
        System.out.println(resto);


    }


}

package tema1;

public class ejercicio10 {
    public static void main() {
        /*
        10. ¿Qué mostrará el siguiente código por pantalla?
            int num=5;
            num += num - 1 * 4 + 1;
            System.out.println(num);
            num=4;
            num %= 7 * num % 3 * 5;
            System.out.println(num);
        */

        int num=5;
        num += num - 1 * 4 + 1; // 5 + (5 - 1 * 4 + 1) = 5 + 2  = 7
        System.out.println(num); // 7
        num=4;
        num %= 7 * num % 3 * 5; // 4 % (7 * 4 % 3 * 5) = 4 % (28 % 3 * 5) = 4 % (28 % 3 * 5) = 4 % 5 = 4
        System.out.println(num); //4
    }
}

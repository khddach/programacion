package tema1;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        // 12. Realiza un programa en Java que, dadas dos variables a y b, intercambie los valores de a y b.

        String a, b, c ;

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el valor a : ");
        a = sc.nextLine();

        System.out.print("Dime el valor b : ");
        b = sc.nextLine();

        c = a ;
        a = b;
        b = c ;

        System.out.println("valor a es: " + a);
        System.out.println("valor b es: " + b);
    }
}

package tema1;

public class ejercicio2 {
    public static void main(String[] args) {
        // ¿Cuáles son los valores de a y b después de ejecutar las siguientes instrucciones?
        //a = 3;
        //b = 4;
        //c = 2 * a * b;
        //a = a + 2;
        //b = c – a;

        int  a = 3, b = 4, c;

        c = 2 * a * b;  // c = 24
        a = a + 2;      // a = 5
        b = c - a;      // b = 19

        System.out.println("resultado a es : " + a);
        System.out.println("resultado b es : " + b);
        System.out.println("resultado c es : " + c);
    }
}

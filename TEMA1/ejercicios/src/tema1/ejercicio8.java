package tema1;

public class ejercicio8 {

    static int n1=50;

    public static void main(String[] args) {
        /*
        8. Modifica el siguiente programa para hacer que compile y funcione:

        class Suma {
         static int n1=50;
         public static void main(String [] args)
         {
          int n2=30, suma=0, n3; --> la variable n3 no está inicializada.
          suma=n1+n2;
          System.out.println("LA SUMA ES: " + suma);
          suma=suma+n3;
          System.out.println(suma);
         }
        }
        */

        int n2=30, suma=0, n3=0;
        suma=n1+n2;
        System.out.println("LA SUMA ES: " + suma);
        suma=suma+n3;
        System.out.println(suma);
    }
}

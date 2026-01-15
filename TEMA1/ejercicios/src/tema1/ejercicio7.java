package tema1;

public class ejercicio7 {
    public static void main(String[] args) {
        /*
            7. ¿Por qué no compila el siguiente programa? Modifícalo para hacer que funcione.

            class Suma {
             public static void main(String [] args)
             {
              int n1=50,n2=30, --> falta ;
              boolean suma=0; --> sum es boolean no numero int
              suma=n1+n2; --> int(n1+n2) no se puede asignar a boolean
              System.out.println("LA SUMA ES: " + suma);
             }
            }


        */

        int n1=50,n2=30;
        int suma=0;
        suma=n1+n2;
        System.out.println("LA SUMA ES: " + suma);
    }
}

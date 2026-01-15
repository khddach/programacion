package tema1;

public class ejercicio9 {
    public static void main(String[] args) {
        /*
        9. El siguiente programa tiene 3 fallos, averigua cuáles son y modifica el programa para que funcione.

            class Cuadrado {
              public static void main(String [] args)  {
                  int numero=2, --> falta ;
                  cuad=numero * número;  --> número es variable número no declarada
                  System.out.println("EL CUADRADO DE "+NUMERO+" ES: " + cuad); --> NUMERO es variable número no declarada
               }
            }
        */

        int numero=2,
        cuad=numero * numero;
        System.out.println("EL CUADRADO DE "+numero+" ES: " + cuad);
    }
}

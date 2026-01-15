package tema1;

public class ejercicio14 {
    public static void main(String[] args) {
        // 14. Realiza un programa en Java que genere números de forma aleatoria simulando la tirada de un dado.

        int dado;

        dado = (int) (Math.random() * 6) + 1 ;

        System.out.println("la tirada de un dado es: " + dado);
    }
}

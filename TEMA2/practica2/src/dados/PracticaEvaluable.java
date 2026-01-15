package dados;

import java.util.Random;
import java.util.Scanner;

public class PracticaEvaluable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n======= MENÚ PRACTICA EVALUABLE =======");
            System.out.println("1. Ejercicio STRINGS");
            System.out.println("2. Ejercicio ARRAYS (2 dados)");
            System.out.println("3. Estadísticas dado 12 caras");
            System.out.println("4. Juego Caza del Tesoro (MATRICES)");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    ejercicioStrings(sc);
                    break;
                case 2:
                    ejercicioDados();
                    break;
                case 3:
                    ejercicioEstadisticas(sc);
                    break;
                case 4:
                    juegoTesoro(sc);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 5);
    }

    // ------------------------------
    //     EJERCICIO 1: STRINGS
    // ------------------------------
    public static void ejercicioStrings(Scanner sc) {
        System.out.println("\n--- EJERCICIO STRINGS ---");

        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();

        System.out.println("Número de vocales: " + contarVocales(texto));
        System.out.println("Número de palabras: " + contarPalabras(texto));
        System.out.println("Texto reemplazado: " + reemplazarA(texto));
    }

    public static int contarVocales(String s) {
        int contador = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarPalabras(String s) {
        String[] palabras = s.trim().split("\\s+");
        return palabras.length;
    }

    public static String reemplazarA(String s) {
        StringBuffer sb = new StringBuffer(s);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a' || sb.charAt(i) == 'A') {
                sb.setCharAt(i, '@');
            }
        }
        return sb.toString();
    }

    // ------------------------------
    //     EJERCICIO 2: ARRAYS
    // ------------------------------
    public static void ejercicioDados() {
        System.out.println("\n--- EJERCICIO ARRAYS (2 DADOS) ---");

        Random r = new Random();
        int d1, d2;
        int sumaTotal = 0;
        int tiradas = 0;

        do {
            d1 = r.nextInt(6) + 1;
            d2 = r.nextInt(6) + 1;

            tiradas++;
            sumaTotal += d1 + d2;

            System.out.println("Tirada " + tiradas + ": (" + d1 + ", " + d2 + ")");

        } while (!(d1 == 6 && d2 == 6));

        System.out.println("\nTOTAL TIRADAS: " + tiradas);
        System.out.println("SUMA TOTAL: " + sumaTotal);
    }

    // ------------------------------
    //     EJERCICIO 3: ESTADÍSTICAS
    // ------------------------------
    public static void ejercicioEstadisticas(Scanner sc) {
        System.out.println("\n--- EJERCICIO ESTADISTICAS ---");
        System.out.print("Introduce cuántas tiradas quieres (ej: 100 o 1000): ");
        int n = sc.nextInt();

        double[] resultado = estadisticas(n);

        for (int i = 0; i < resultado.length; i++) {
            System.out.printf("Número %2d → %.2f%%\n", (i + 1), resultado[i]);
        }
    }

    public static double[] estadisticas(int n) {
        Random r = new Random();
        int[] contador = new int[12];

        for (int i = 0; i < n; i++) {
            int tiro = r.nextInt(12) + 1;
            contador[tiro - 1]++;
        }

        double[] porcentajes = new double[12];
        for (int i = 0; i < 12; i++) {
            porcentajes[i] = (contador[i] * 100.0) / n;
        }

        return porcentajes;
    }

    // ------------------------------
    //   EJERCICIO 4: CAZA DEL TESORO
    // ------------------------------
    public static void juegoTesoro(Scanner sc) {
        System.out.println("\n--- JUEGO CAZA DEL TESORO ---");

        char[][] tablero = new char[10][10];
        inicializarTablero(tablero);

        Random r = new Random();
        int tesX = r.nextInt(10);
        int tesY = r.nextInt(10);

        int intentos = 15;
        int distAnterior = Integer.MAX_VALUE;

        while (intentos > 0) {
            System.out.println("\nIntentos restantes: " + intentos);
            mostrarTablero(tablero);

            System.out.print("Introduce X (0-9): ");
            int x = sc.nextInt();
            System.out.print("Introduce Y (0-9): ");
            int y = sc.nextInt();

            if (x == tesX && y == tesY) {
                tablero[x][y] = 'T';
                mostrarTablero(tablero);
                System.out.println("\n🎉 ¡HAS ENCONTRADO EL TESORO! 🎉");
                return;
            }

            int distActual = distancia(tesX, tesY, x, y);

            if (distActual < distAnterior)
                System.out.println("Estás más cerca.");
            else if (distActual > distAnterior)
                System.out.println("Estás más lejos.");
            else
                System.out.println("Estás igual de lejos.");

            distAnterior = distActual;
            tablero[x][y] = 'X';
            intentos--;
        }

        System.out.println("\n❌ No te quedan intentos.");
        System.out.println("El tesoro estaba en: (" + tesX + ", " + tesY + ")");
    }

    public static void inicializarTablero(char[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = '-';
            }
        }
    }

    public static void mostrarTablero(char[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int distancia(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}

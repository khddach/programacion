package prepar;

import java.util.Scanner;

public class ex4 {

    public static void initTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                tablero[i][j] = '~';
            }
        }

    }

    public static void print(char[][] tablero) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean todosBarcosHundidos(char[][] tablero) {
        boolean todosHundidos = true;
        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 'B') { //Ver al principio si me pone los barcos
                    todosHundidos = false ;
                    break;
                }
            }
        }

        return todosHundidos ;
    };

    public static void mostrarTablero(char[][] matriz, boolean mostrarBarcos) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                if (mostrarBarcos && matriz[i][j] == 'B') { //Ver al principio si me pone los barcos
                    System.out.printf("%3c", matriz[i][j]);
                }else {
                    System.out.printf("%3c", matriz[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void colocarBarco (char[][] tablero, int tamano) {
        boolean colocado = false;

        while (!colocado) {
            int fila = (int) (Math.random() * 8);
            int col = (int) (Math.random() * 8);
            int direccion = (int) (Math.random() * 2);
            boolean libre = true;

            if (direccion == 0) {
                if ( (fila + tamano < 8) && tablero[col][fila] == '~' && tablero[col][fila + 1] == '~' ) {
                    tablero[col][fila] = 'B';
                    tablero[col][fila+1] = 'B';
                    colocado = true;
                }
            } else {
                if ( (col + 1 < 8) && tablero[col][fila] == '~' && tablero[col + 1][fila] == '~') {
                    tablero[col][fila] = 'B';
                    tablero[col+1][fila] = 'B';
                    colocado = true;
                }
            }

        }
    }
    public static void main(String[] args) {
        char[][] tablero = new char[8][8];
        int disparos = 20;
        int dispFila, dispColumna;
        Scanner sc = new Scanner(System.in);
        initTablero(tablero);

        colocarBarco(tablero, 2);
        colocarBarco(tablero, 2);
        colocarBarco(tablero, 2);

        mostrarTablero(tablero,true);

        while (disparos != 0) {
            try {
                System.out.println("Introduce fila del disparo:");
                dispFila = Integer.parseInt(sc.nextLine());
                System.out.println("Introduce columna del disparo:");
                dispColumna = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Coordenadas incorrectas");
                continue;
            }

            try {
                if (tablero[dispFila][dispColumna] == 'B') {
                    System.out.println("TOCADO!");
                    tablero[dispFila][dispColumna] = 'X';
                } else if (tablero[dispFila][dispColumna] == '~') {
                    System.out.println("AGUA");
                    tablero[dispFila][dispColumna] = 'O';
                } else if (tablero[dispFila][dispColumna] == 'X' || tablero[dispFila][dispColumna] == 'O') {
                    System.out.println("YA DISPARASTE AHI");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordenadas fuera de rango");
                continue;
            }

            mostrarTablero(tablero, false);
            //Condición de victoria
            if (todosBarcosHundidos(tablero)) {
                System.out.println("GANASTE");
                break;
            }
            disparos--;
            System.out.println("Disparos restantes: " + disparos);
        }
        if (disparos == 0) {
            System.out.println("PERDISTE");
        }
    }
}

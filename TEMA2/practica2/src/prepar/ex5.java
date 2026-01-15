package prepar;

import java.util.Scanner;

public class ex5 {

    public static void initTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                tablero[i][j] = '~';
            }
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

                if (col + tamano <= 8) {

                    for (int i = 0; i < tamano; i++) {
                        if (tablero[fila][col + i] != '~') {
                            libre = false;
                            break;
                        }
                    }

                    if (libre) {
                        for (int i = 0; i < tamano; i++) {
                            tablero[fila][col + i] = 'B';
                        }
                        colocado = true;
                    }
                    
                }


            } else {

                if (fila + tamano <= 8) {

                    for (int i = 0; i < tamano; i++) {

                        if (tablero[fila + i][col] != '~') {
                            libre = false;
                            break;
                        }

                    }

                    if (libre) {

                        for (int i = 0; i < tamano; i++) {
                            tablero[fila + i][col] = 'B';
                        }

                        colocado = true;

                    }
                }

            }

        }
    }

    public static  void mostrarTablero(char[][] tablero, boolean mostrarBarcos) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                if (!mostrarBarcos && tablero[i][j] == 'B') {
                    System.out.printf("%2c", '~');
                } else {
                    System.out.printf("%2c", tablero[i][j]);

                }
            }
            System.out.println();
        }


    }

    public static boolean todosBarcosHundidos(char[][] tablero) {
        boolean isBarcos = false;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                if (tablero[i][j] == 'B') {
                    isBarcos = true;
                    break;
                }
            }
        }

        return isBarcos ;
    }


    public static void main(String[] args) {

        char[][] tablero = new char[8][8];
        int disparos = 20;
        int dispFila, dispColumna;
        Scanner sc = new Scanner(System.in);

        initTablero(tablero);

        colocarBarco(tablero,2);
        colocarBarco(tablero,2);
        colocarBarco(tablero,2);



        mostrarTablero(tablero,true);



        while (disparos > 0) {

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
                    System.out.println("¡TOCADO!");
                    tablero[dispFila][dispColumna] = 'X';
                } else if (tablero[dispFila][dispColumna] == '0') {
                    System.out.println("Agua");
                    tablero[dispFila][dispColumna] = 'O';
                } else if (tablero[dispFila][dispColumna] == 'O' | tablero[dispFila][dispColumna] == 'X') {
                    System.out.println("Ya disparaste ahí");
                }

            } catch (Exception e) {
                System.out.println("Coordenadas fuera de rango");
                continue;
            }

            mostrarTablero(tablero, true);

            if (!todosBarcosHundidos(tablero)) {
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

package prepar;

import java.util.Scanner;

public class LABERINTO {

    static int moveX = 0;
    static int moveY = 0;

    public static int aleatorio(int max, int min) {
        return (int) ((Math.random() * (max - min + 1)) + min);
    }

    public static void initLista(String[][] lista) {

        for (int i = 0; i < lista.length; i++) {

            for (int j = 0; j < lista[i].length; j++) {


                lista[i][j] = ".";

                if (i == 0) {
                    lista[0][j] = "-";
                } else if (i == lista.length - 1) {
                    lista[lista.length - 1][j] = "-";
                }


                if (j == 0) {
                    lista[i][0] = "|";
                } else if (j == lista[i].length - 1) {
                    lista[i][j] = "|";
                }


            }

        }

        lista[0][0] = "@";
        salidaLaberinto(lista);

    }

    public static void mostrarLista(String[][] lista) {
        for (int i = 0; i < lista.length; i++) {

            for (int j = 0; j < lista[i].length; j++) {
                System.out.print(lista[i][j] + " ");
            }

            System.out.println();

        }
    }

    public static int keyNum(Scanner sc, String msg) {
        int numero = -1;

        while (true) {
            try {
                System.out.println(msg);
                numero = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("solo numero");
                sc = new Scanner(System.in);
                continue;
            }

        }

        return numero;

    };

    public static int[] bomba(String[][] lista) {
        int posX = aleatorio(lista.length - 2,1);
        int posY = aleatorio(lista.length - 2,1);

        //lista[posY][posX] = "X";

        System.out.println(posY);
        System.out.println(posX);

        return new int[]{posY,posX};
    }
    public static void  salidaLaberinto(String[][] lista) {

        int posX, posY;




        do {
            posX = aleatorio(lista.length-1,0);
            posY = aleatorio(lista.length-1,0);

            int pos  =  aleatorio(4,0);

            if (pos == 0) {
                posX = 0;
            } else if (pos == 1) {
                posX = lista.length-1;
            } else if (pos == 2) {
                posY = 0;
            }
            else {
                posY = lista.length-1;
            }


        } while (posY == 0 && posX == 0);

        lista[posY][posX] = "#";

    }

    public static boolean listMenu(int menu, String[][] board,int[] bomba,int pasos) {
        if (board[0][0] == "@") {
            board[moveY][moveX] = ".";
        }

        board[moveY][moveX] = ".";


        boolean play = true;


        switch (menu) {
            case 0:
                String punto = "";
                System.out.print("salir ");
                for (int i = 0; i < 4; i++) {
                    punto += "-";
                    try {
                        Thread.sleep(120);
                    } catch (Exception e) {
                        System.out.println();
                    }
                    System.out.print(punto + " ");
                }
                System.out.println("-----> by by");

                break;
            case 1:

                moveX++;
                break;
            case 2:
                moveX--;

                break;
            case 3:
                moveY++;

                break;
            case 4:
                moveY--;

                break;
        }



        try {
            if (bomba[0] == moveY && bomba[1] == moveX) {
                play = false;
                System.out.println("BOOM! 💣 لقد انفجرت القنبلة! خسرت اللعبة.");
            }
            else if (board[moveY][moveX] == "#") {
                play = false;
                System.out.println("🎉 مبروك! لقد خرجت من المتاهة في "  + pasos);
            } else {
                board[moveY][moveX] = "@";
            }
        } catch (Exception e) {
            System.out.println("🚫 لقد سقطت خارج حدود العالم! انتهت اللعبة (Game Over).");
            play = false;
        }


        return play;
    }

    public static void main(String[] args) {

        String[][] board = new String[20][20];
        Scanner sc = new Scanner(System.in);
        int menu = -1;

        //init board
        initLista(board);
        int[] bomba = bomba(board);

        boolean play = true;
        int pasos  = 0;

        do {
            mostrarLista(board);
            System.out.println("******************************");
            System.out.println("Introduce opcion :");
            System.out.println("0. salir");
            System.out.println("1. derecha");
            System.out.println("2. izquierda");
            System.out.println("3. abajo");
            System.out.println("4. derecha");
            System.out.println("******************************");


            pasos++;
            menu = keyNum(sc, "");

            play = listMenu(menu,board,bomba,pasos);

            if (!play) {
                break;
            }

        } while (menu != 0);


    }
}

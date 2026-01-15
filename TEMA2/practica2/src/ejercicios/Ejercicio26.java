package ejercicios;

import java.util.Scanner;

public class Ejercicio26 {

    public static void convierteEnPalotes(int n) {

        String numString =  String.valueOf(n);
        String listaPalotes = "";

        for (int i = 0; i < numString.length() ; i++) {

            int num = numString.charAt(i)- '0';

            switch (num) {
                case 1 :
                    listaPalotes += "|-";
                    break;
                case 2 :
                    listaPalotes += "||-";
                    break;
                case 3 :
                    listaPalotes += "|||-";
                    break;
                case 4 :
                    listaPalotes += "||||-";
                    break;
                case 5 :
                    listaPalotes += "|||||-";
                    break;
                case 6 :
                    listaPalotes += "||||||-";
                    break;
                case 7 :
                    listaPalotes += "|||||||-";
                    break;
                case 8 :
                    listaPalotes += "||||||||-";
                    break;
                case 9 :
                    listaPalotes += "|||||||||-";
                    break;
                default:
                    listaPalotes += "-";
            };

        }

        System.out.println(listaPalotes);





    }

    public static void main(String[] args) {

        /*
         Marcus Cubitus y Julius Humerus se encuentran en racha y prueban un juego nuevo.
         Una partida de este juego consiste en varios turnos.
         En cada uno de ellos, un jugador tira cuatro dados y el otro jugador tira sólo uno.
         Si el segundo jugador saca un valor distinto a los del primero, gana un punto, pero
         si saca alguno de los valores sacados por el primero, es el primer jugador quien gana un punto.
          Escriba un programa que muestre una partida de este juego, detallando quién gana el punto en
          cada turno y la puntuación final de cada jugador.
          */

        Scanner sc = new Scanner(System.in);

        System.out.println("por ejemplo : 470213");
        System.out.println("||||-|||||||--||-|-|||-");

        System.out.println("Escribe el número de palotes:");
        int num = sc.nextInt();
        convierteEnPalotes(num);
    }

}
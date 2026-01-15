package ejercicios;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio25 {



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



        int ganaMarcus = 0;
        int ganaJulius = 0;
        int marcusTirada1, marcusTirada2,marcusTirada3,marcusTirada4;
        int juliusTirada1;


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de rondas de juego.");
        int rondas = sc.nextInt();

        for (int i = 1; i <= rondas ; i++) {


            marcusTirada1 = (int) (Math.random() * 6) + 1 ;
            marcusTirada2 = (int) (Math.random() * 6) + 1 ;
            marcusTirada3 = (int) (Math.random() * 6) + 1 ;
            marcusTirada4 = (int) (Math.random() * 6) + 1 ;

            juliusTirada1 = (int) (Math.random() * 6) + 1;


            if (juliusTirada1 == marcusTirada1 || juliusTirada1 == marcusTirada2 || juliusTirada1 == marcusTirada3
                    || juliusTirada1 == marcusTirada4) {
                System.out.println("Marcus Cubitus gana");
                ganaMarcus++;
            } else {
                System.out.println("Julius Humerus gana");
                ganaJulius++;
            }



        }

        if (ganaMarcus > ganaJulius) {
            System.out.println("La partida la gana Marcus Cubitus  -> " + ganaMarcus + ":" + ganaJulius);
        } else if (ganaMarcus < ganaJulius) {
            System.out.println("La partida la gana Julius Humerus -> " + ganaJulius + ":" + ganaMarcus);
        } else {
            System.out.println("Empate");
        }

    }

}
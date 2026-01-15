package dados;

import java.util.Scanner;

public class Ejercicio3 {


    public static void main(String[] args) {
        /*
            Marcus Cubitus y Julius Humerus, dos legionarios romanos aficionados a los dados y
            habituales de estos exámenes, han ideado un nuevo juego. Primero se decide cuántos
            turnos va a tener la partida (uno por lo menos, lógicamente). En cada turno, cada uno
            tira un dado. Si ambos dados son pares o si ambos son impares, Cubitus se apunta la
            suma de los dos valores. Si un dado es par y el otro impar, los puntos se los lleva
            Humerus. El ganador es el que ha obtenido más puntos.
          */

        int tiradaMarcus, tiradaJulius;
        int sumaMarcus = 0, sumaJulius = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de rondas de juego.");
        int rondas = sc.nextInt();


        for (int i = 1; i <= rondas ; i++) {

            tiradaMarcus = (int) (Math.random() * 6) + 1;
            tiradaJulius = (int) (Math.random() * 6) + 1;

            if ( (tiradaMarcus % 2 == 0 && tiradaJulius % 2 == 0) || (tiradaMarcus % 2 != 0 && tiradaJulius % 2 != 0) ) {
                sumaMarcus = tiradaMarcus + tiradaJulius;
            } else if ( (tiradaJulius % 2 == 0 && tiradaMarcus % 2 != 0) || (tiradaJulius % 2 != 0 && tiradaMarcus % 2 == 0) ) {
                sumaJulius = tiradaJulius + tiradaJulius;
            }



        }


        if (sumaMarcus > sumaJulius){
            System.out.println("La partida la gana Marcus Cubitus: ---> " + sumaMarcus);
        } else if (sumaMarcus < sumaJulius) {
            System.out.println("La partida la gana Julius Humerus: ---> " + sumaJulius);
        } else {
            System.out.println("Empate ---> " + sumaMarcus + " : " + sumaJulius);
        }


    }
}

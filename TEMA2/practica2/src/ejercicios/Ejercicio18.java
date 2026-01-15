package ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        /*
          Marcus Cubitus y Julius Humerus, legionarios apasionados por los juegos de dados, aprovechan los días cada
          vez más largos del mes de Iunius para probar nuevos juegos. En este juego, en cada turno un jugador lanza
           cuatro dados y se anota la suma de los valores impares obtenidos, mientras que el otro jugador lanza
           tres dados y se anota la suma de los valores pares obtenidos. Gana el turno el jugador que obtenga
            más puntos y gana la partida el jugador que haya ganado más turnos.
          */

        int ganaMarcus = 0;
        int ganaJulius = 0;
        System.out.println("Introduzca el número de rondas de juego.");
        Scanner sc = new Scanner(System.in);

        int rondas = sc.nextInt();


        for (int i = 1; i <= rondas; i++) {

            int sumaMarcus = 0;
            int sumaJulius = 0;

            for (int j = 1; j <= 4 ; j++) {
                int dado = (int) (Math.random() * 6) + 1;

                if (dado % 2 != 0) {
                    sumaMarcus += dado;
                }

            }

            for (int t = 1; t <= 3; t++) {
                int dado = (int) (Math.random() * 6) + 1;

                if (dado % 2 == 0) {
                    sumaJulius += dado;
                }

            }


            if (sumaMarcus > sumaJulius) {
                System.out.println("Marcus Cubitus gana");
                ganaMarcus++;
            } else if (sumaMarcus < sumaJulius) {
                System.out.println("Julius Humerus gana");
                ganaJulius++;
            } else {
                System.out.println("Empate");
            }

        }


        if (ganaMarcus > ganaJulius) {
            System.out.println("La partida la gana Marcus Cubitus");
        } else if (ganaMarcus < ganaJulius) {
            System.out.println("La partida la gana Julius Humerus");
        } else {
            System.out.println("Empate");
        }

    }

}
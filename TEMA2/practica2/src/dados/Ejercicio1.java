package dados;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
            Marcus Cubitus y Julius Humerus son dos legionarios muy aficionados a los juegos de dados y que aparecen a
            menudo en estos exámenes. Esta vez juegan a un juego en el que primero se decide cuántos turnos se van a jugar.
            En cada turno, cada jugador tira un dado. Si un jugador saca un valor mayor que el otro, gana los puntos de ambos
            dados. Si los dos jugadores sacan el mismo valor, los puntos de ambos dados se acumulan para el siguiente turno.
            Si en el último turno hay un empate, esos puntos se pierden, porque la partida termina. Escriba un programa que
            muestre una partida de este juego, detallando quién gana la partida, quién gana cada turno y la puntuación
            acumulada por cada jugador tras cada turno.
          */

        int tiradaMarcus, tiradaJulius;
        int sumaMarcus = 0, sumaJulius = 0;
        int sumaEmpate = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de rondas de juego.");
        int rondas = sc.nextInt();


        for (int i = 0; i <= rondas ; i++) {

            tiradaMarcus = (int) (Math.random() * 6) + 1;
            tiradaJulius = (int) (Math.random() * 6) + 1;

            if (tiradaMarcus > tiradaJulius){
                sumaMarcus += tiradaMarcus + tiradaJulius + sumaEmpate ;
                sumaEmpate = 0;
                System.out.println("Marcus Cubitus gana");
            } else if (tiradaMarcus < tiradaJulius) {
                sumaJulius += tiradaMarcus + tiradaJulius + sumaEmpate ;
                sumaEmpate = 0;
                System.out.println("Julius Humerus gana");
            } else {
                sumaEmpate += tiradaMarcus + tiradaJulius;
                System.out.println("Empate");
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

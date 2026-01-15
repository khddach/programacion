package dados;

import java.util.Scanner;

public class Ejercicio2 {

    public static int jugadorTirada(int num) {

        int min = 0, max = 0, sum = 0;

        for (int i = 1; i <= num; i++) {

            int tirada = (int) (Math.random() * 6) + 1 ;

            if (i == 1) {
                max = tirada ;
                min = tirada ;
            }

            if (max < tirada) {
                max =  tirada;
            }

            if (min > tirada) {
                min =  tirada;
            }

            sum += tirada;

        }

        return sum - max - min;
    }

    public static void main(String[] args) {
        /*
            Marcus Cubitus y Julius Humerus son dos legionarios que se entretienen en sus ratos
            libres jugando a juegos de dados, el pasatiempo favorito de los antiguos romanos. Un
            juego que pudieron haber jugado estos amigos consiste en tirar cada jugador cinco
            dados. La puntuación es la suma total de puntos, sin contar los valores que coincidan
            con el mínimo o el máximo obtenido. El jugador que saca más puntos gana la partida.
            Escriba un programa que simule varias partidas seguidas de este juego de dados.
          */

        int tiradaMarcus, tiradaJulius;
        int sumaMarcus = 0, sumaJulius = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de rondas de juego.");
        int rondas = sc.nextInt();


        for (int i = 1; i <= rondas ; i++) {

            tiradaMarcus = jugadorTirada(5);
            tiradaJulius = jugadorTirada(5);

            if (tiradaMarcus > tiradaJulius) {
                sumaMarcus++;
            } else if (tiradaMarcus < tiradaJulius) {
                sumaJulius++;
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

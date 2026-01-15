package dados;

import java.util.Scanner;

public class Ejercicio5 {

    public static int tirarDado(int numCaras) {
        int resultado;
        resultado = (int) (Math.random() * numCaras) + 1;
        return resultado;
    }

    public static int calcularPuntuacion() {
        int dado1, dado2, dado3, dado4, dado5;
        int total=0,sumDados=0;

        dado1 = tirarDado(6);
        dado2 = tirarDado(6);
        dado3 = tirarDado(6);
        dado4 = tirarDado(6);
        dado5 = tirarDado(6);

        sumDados = dado1 + dado2 + dado3 + dado4 + dado5 ;
        total = sumDados ;

        if ( (dado1 == 1 && dado2 == 2 && dado3 == 3 && dado4 == 4 && dado5 == 5)
                || (dado1 == 2 && dado2 == 3 && dado3 == 4 && dado4 == 5 && dado5 == 6) ) {
            total += 10;
        }

        if ( dado2 == dado1 && dado3 == dado1 && dado4 == dado1 && dado5 == dado1 ) {
            total += 10;
        }

        if (sumDados < 8) {
            total -= 5;
        }

        System.out.println("D1: " + dado1 + " D2: " + dado2 + " D3: " + dado3 + " D4: " + dado4 + " D5: " + dado5);

        return total;
    }

    public static void main(String[] args) {
        /*
            Marcus Cubitus y Julius Humerus son dos legionarios que se entretienen en sus ratos libres jugando a juegos de dados,
             el pasatiempo favorito de los antiguos romanos. Un juego que pudieron haber jugado estos amigos consiste en tirar cada
              jugador cinco dados de 6 caras. La puntuación es la suma total de puntos, pero hay un bonus de 10 puntos por sacar una
               escalera (1,2,3,4,5 o 2,3,4,5,6) y un bonus de 20 puntos por sacar los cinco dados iguales. Hay una penalización de 5
                puntos si la suma de los dados es menor de 8. El jugador que saca más puntos gana la partida.
            Escriba un programa que simule varias partidas seguidas de este juego de dados.
          */

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de partidas a jugar: ");
        int numPartidas = sc.nextInt();
        int ganadasC=0, ganadasH=0;
        int tiradaC=0, tiradaH=0;


        for(int i=0; i < numPartidas; i++) {
            tiradaC = calcularPuntuacion();
            tiradaH = calcularPuntuacion();

            System.out.println("Tirada Cubitus: " + tiradaC);
            System.out.println("Tirada Humerus: " + tiradaH);


            if (tiradaC > tiradaH) {
                ganadasC++;
            } else if (tiradaH > tiradaC) {
                ganadasH++;
            } else {
                System.out.println("Empate");
            }
        }


        if (ganadasC  > ganadasH){
            System.out.println("La partida la gana Marcus Cubitus: ---> " + ganadasC );
        } else if (ganadasC  < ganadasH) {
            System.out.println("La partida la gana Julius Humerus: ---> " + ganadasH);
        } else {
            System.out.println("Empate ---> " + ganadasC + " : " + ganadasH);
        }

    }
}

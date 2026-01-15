package dados;

import java.util.Scanner;

public class Ejercicio6_m2 {

    public static int tirarDado(int numCaras) {
        int resultado;
        resultado = (int) (Math.random() * numCaras) + 1;
        return resultado;
    }

    public static int calcularPuntuacionCubitus() {
        int dado1, dado2, dado3, dado4, dado5;
        int sumTotal = 0;

        dado1 = tirarDado(10);
        dado2 = tirarDado(10);
        dado3 = tirarDado(10);
        dado4 = tirarDado(10);
        dado5 = tirarDado(10);

        if (dado1 % 2 != 0) {
            sumTotal += dado1 ;
        }

        if (dado2 % 2 != 0) {
            sumTotal += dado1 ;
        }

        if (dado3 % 2 != 0) {
            sumTotal += dado1 ;
        }

        if (dado4 % 2 != 0) {
            sumTotal += dado1 ;
        }

        if (dado5 % 2 != 0) {
            sumTotal += dado1 ;
        }

        System.out.println("D1: " + dado1 + " D2: " + dado2 + " D3: " + dado3 + " D4: " + dado4 + " D5: " + dado5);


        return sumTotal;
    }

    public static int calcularPuntuacionHumerus() {
        int dado1, dado2, dado3;
        int sumTotal = 0;

        dado1 = tirarDado(15);
        dado2 = tirarDado(15);
        dado3 = tirarDado(15);


        if (dado1 % 2 == 0) {
            sumTotal += dado1 ;
        }

        if (dado2 % 2 == 0) {
            sumTotal += dado1 ;
        }

        if (dado3 % 2 == 0) {
            sumTotal += dado1 ;
        }

        System.out.println("D1: " + dado1 + " D2: " + dado2 + " D3: " + dado3);

        return sumTotal;
    }

    public static void main(String[] args) {
        /*
            Marcus Cubitus y Julius Humerus, legionarios apasionados por los juegos de dados,
            aprovechan los días cada vez más largos del mes de Iunius para probar nuevos juegos.
            Pide por teclado un número de turnos que van a jugar. En cada turno Cubitus lanza cuatro
            dados de 10 caras y se anota la suma de los valores impares obtenidos, mientras que el
            Humerus lanza tres dados de 15 caras y se anota la suma de los valores pares obtenidos.
            Gana el turno el jugador que obtenga más puntos y gana la partida el jugador que haya
            ganado más turnos.
            ¿Es un juego equitativo? ¿Cómo lo comprobarías?
          */

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de partidas a jugar: ");
        int numPartidas = sc.nextInt();
        int ganadasC=0, ganadasH=0;
        int tiradaC=0, tiradaH=0;


        for(int i=0; i < numPartidas; i++) {
            tiradaC = calcularPuntuacionCubitus() ;
            tiradaH = calcularPuntuacionHumerus();

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

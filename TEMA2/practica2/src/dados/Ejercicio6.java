package dados;

import java.util.Scanner;

public class Ejercicio6 {

    public static int tirarDado(int numCaras) {
        int resultado;
        resultado = (int) (Math.random() * numCaras) + 1;
        return resultado;
    }

    public static int calcularPuntuacion(int numDados,int numCaras,String tipo) {

        int total=0,sumDados=0;

        for (int i = 1; i <= numDados; i++) {
            int dado = tirarDado(numCaras);

            if (dado % 2 == 0 && tipo == "pares") {
                sumDados = dado ;
            }

            if (dado % 2 != 0 && tipo == "impares") {
                sumDados = dado ;
            }

            System.out.print(" D" + i + ": " + dado);
        }

        System.out.println();
        total = sumDados ;


        return total;
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
            tiradaC = calcularPuntuacion(5,10,"impares");
            tiradaH = calcularPuntuacion(3,15,"pares");

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

package tema1;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        // 13. Realiza un programa en Java con una variable entera t la cual contiene un tiempo en segundos y
        //queremos conocer este tiempo, pero expresado en horas, minutos y segundos.

        int t, horas, minutos, segundos;

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el tiempo en segundos : ");
        t = sc.nextInt();

        horas = t / 3600;
        minutos = (t % 3600 ) / 60;
        segundos = t % 60;

        System.out.println(horas + "h " + minutos + "m " + segundos + "s");
    }
}

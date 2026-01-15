package tema1;

public class ejercicio11 {
    public static void main(String[] args) {
        // 11. Realiza un programa que calcule el área y el perímetro de un círculo de radio 3,6 metros.

        double radio, area, perimetro;

        radio = 3.6;
        area = Math.PI * Math.pow(radio,2);
        perimetro = 2 * Math.PI * radio;

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}

public class ConversorDivisas {
    public static void main(String[] args) {
        double euros = 100.0;
        double tasaDolar = 1.08; // 1 Euro = 1.08 Dólares
        double tasaYen = 160.0;  // 1 Euro = 160.0 Yenes
        double dolares = euros * tasaDolar;
        double yenes = euros * tasaYen;

        System.out.println(euros + " Euros son:");
        System.out.println(dolares + " Dólares");
        System.out.println(yenes + " Yenes");
    }
}

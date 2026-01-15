package prepar;

import java.util.Scanner;

public class CazaTesoro {

    /**
     * (int)(Math.random() * (max - min + 1) + min)
     // Cuadrado
     areaCuadrado = L * L
     perimetroCuadrado = 4 * L

     // Rectángulo
     areaRectangulo = B * L
     perimetroRectangulo = 2 * (B + L)

     // Triángulo
     areaTriangulo = (B * h) / 2
     perimetroTriangulo = L1 + L2 + L3
     IndexOutOfBoundsException
     // Rombo
     areaRombo = (D * d) / 2
     perimetroRombo = 4 * L

     // Pentágono
     areaPentagono = (perimetro * apotema) / 2
     perimetroPentagono = 5 * L

     // Hexágono
     areaHexagono = (perimetro * apotema) / 2
     perimetroHexagono = 6 * L

     // Círculo
     areaCirculo = π * r²
     perimetroCirculo = 2 * π * r

     // Trapecio
     areaTrapecio = ((B + b) * h) / 2
     perimetroTrapecio = B + b + L1 + L2

     // Paralelogramo
     areaParalelogramo = B * h
     perimetroParalelogramo = 2 * (B + L)

     volumen = Math.PI * Math.pow(radio,2) * altura;
     area = 2 * Math.PI * (radio + altura);


     int capicua = 0;
     int num = telcadoNum ;
     while (num > 0) {
     int digito = num % 10;
     capicua = capicua * 10 + digito;
     num = num / 10;
     }

     horas = t / 3600;
     minutos = (t % 3600 ) / 60;
     segundos = t % 60;


     int billete200 = cantidad / 200;



     resto = cantidad % 200;
     int billete100 = resto / 100;
     (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)
     int num = numString.charAt(i)- '0';
     */

    public static void main(String[] args) {

        String[][] board = new String[10][10];
        Scanner sc = new Scanner(System.in);
        int menu = -1;

        int keyX, keyY;

        int colocaX = (int) (Math.random() * 10);
        int colocaY = (int) (Math.random() * 10);

        System.out.println(colocaX);
        System.out.println(colocaY);

        int intentos  = 15;
        boolean win  = false;

        int distanciaAnterior=0;

        while (intentos != 0) {

            // طلب الإحداثيات
            System.out.println("أدخل الصف (0-9): ");
            int x = sc.nextInt();
            System.out.println("أدخل العمود (0-9): ");
            int y = sc.nextInt();

            int distance = Math.abs(colocaX - x) + Math.abs(colocaY - y) ;

            if (colocaX == x && colocaY == y) {
                win = true;
                break;
            };

            if (intentos < 15) { // لا نعطي تلميحاً في أول محاولة لأنه لا يوجد "سابق"
                if (distance < distanciaAnterior) {
                    System.out.println("🔥 تلميح: أنت تقترب (أقرب من المرة السابقة)!");
                } else {
                    System.out.println("❄️ تلميح: أنت تبتعد (أبعد من المرة السابقة)!");
                }
            }

            distanciaAnterior = distance;


            intentos--;
            System.out.println("intentos es " + intentos);
        }

        if (!win && intentos == 0) {
            System.out.println("\n💀 انتهت المحاولات! لقد خسرت.");
            System.out.println("الكنز كان في: (" + colocaX + ", " + colocaY + ")");
        }else {
            System.out.println("🎉 مبروك! لقد وجدت الكنز وفزت!");
        }

    }
}

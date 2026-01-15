package tema1;

public class ejercicio1 {
    public static void main(String[] args) {

        // Si  A = 6, B = 2, C = 3, indicar el resultado final de las siguientes expresiones aritméticas:

        //a. (A * C) %  C --> (6×3)%3=18%3=0
        //b. A * B / C  --> 6×2/3=12/3=4
        //c. C % B + C * B --> 3%2+3×2=1+6=7
        //d. A % ( A * B * C / (B + C) ) --> 6%(6×2×3/(2+3))=6%(36/5)=6%7=6
        //e. B * B + C – B * (A % B ) -->  2×2+3−2×(6%2)=4+3−2×0=7

        int  A = 6, B = 2, C = 3;

        int resultadoA, resultadoB, resultadoC, resultadoD, resultadoE;

        resultadoA = (A * C) %  C ; //(6×3)%3=18%3=0
        resultadoB = A * B / C  ;
        resultadoC = C % B + C * B ;
        resultadoD = A % ( A * B * C / (B + C) ) ;
        resultadoE = B * B + C - B * (A % B )  ;


        System.out.println("resultado a es : " + resultadoA);
        System.out.println("resultado b es : " + resultadoB);
        System.out.println("resultado c es : " + resultadoC);
        System.out.println("resultado d es : " + resultadoD);
        System.out.println("resultado e es : " + resultadoE);
    }
}

package tema1;

public class ejercicio17 {
    public static void main(String[] args) {
        // 17. Escriba expresiones que almacenen en variables lo siguiente:
        //a. Crear un número entero positivo aleatorio entre 1 y 49.
        //b. Generar un número aleatorio positivo par.
        //c. Generar un número real aleatorio entre 1 y 10.
        //d. Crear un número entero negativo entre -50 y -150.
        //e. Crear un número entero entre -100 y 100.
        //f. Generar un número aleatorio que sea uno de los siguientes: 5, 7, 33, 125 o 77
        //g. Crea un generador aleatorio de uno de los meses del año
        //Puedes usar la siguiente fórmula:
        //int n = (int) (Math.random() * (<número_máximo + 1> - <número_mínimo>)) + <numero_mínimo>;


        // a. Crear un número entero positivo aleatorio entre 1 y 49.
        int a = (int) (Math.random() * (49 + 1 - 1)) + 1;

        //b. Generar un número aleatorio positivo par.
        int b = (int) ((Math.random() * 50) + 1) * 2;

        //c. Generar un número real aleatorio entre 1 y 10.
        int c = (int) (Math.random() * (10 + 1 - 1)) + 1;

        //d. Crear un número entero negativo entre -50 y -150.
        int d = (int) (Math.random() * (-50 + 1 + 150)) - 150;

        //e. Crear un número entero entre -100 y 100.
        int e = (int) (Math.random() * (100 + 1 + 100)) - 100;


        //f. Generar un número aleatorio que sea uno de los siguientes: 5, 7, 33, 125 o 77
        int f = (int) (Math.random() * 5) + 1;

        if (f==1) {
            System.out.println(5);
        }
        if (f==2) {
            System.out.println(7);
        }
        if (f==3) {
            System.out.println(33);
        }
        if (f==4) {
            System.out.println(77);
        }
        if (f==5) {
            System.out.println(125);
        }

        //g. Crea un generador aleatorio de uno de los meses del año
        int g = (int) (Math.random() * 12) + 1;

        if (g == 1) {
            System.out.println("Enero");
        }
        if (g == 2) {
            System.out.println("Febrero");
        }
        if (g == 3) {
            System.out.println("Marzo");
        }
        if (g == 4) {
            System.out.println("Abril");
        }
        if (g == 5) {
            System.out.println("Mayo");
        }
        if (g == 6) {
            System.out.println("Junio");
        }
        if (g == 7) {
            System.out.println("Julio");
        }
        if (g == 8) {
            System.out.println("Agosto");
        }
        if (g == 9) {
            System.out.println("Septiembre");
        }
        if (g == 10) {
            System.out.println("Octubre");
        }
        if (g == 11) {
            System.out.println("Noviembre");
        }
        if (g == 12) {
            System.out.println("Diciembre");
        }

    }
}

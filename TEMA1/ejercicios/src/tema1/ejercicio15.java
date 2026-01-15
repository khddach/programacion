package tema1;

public class ejercicio15 {
    public static void main(String[] args) {

        // 15. Escriba un programa que escriba en la pantalla cuánto le dará su banco después de seis meses si pone
        //2000€ en una cuenta a plazo fijo al 2, 75% anual. Recuerde que al pagarle los intereses el banco le
        //retendrá el 18% para hacienda.

        double dinero, interes,retendra,total ;
        double interesAno = 2.75/100;

        dinero = 2000;
        interes = (dinero * interesAno) * (6.0/12) ;
        retendra = interes * 0.18;
        total = dinero + (interes - retendra);

        System.out.println("intereses de 6 meses es : " + interes);
        System.out.println("Deducción bancaria es : " + retendra);
        System.out.println("total después de 6 meses es : " + total + " euros");


    }
}

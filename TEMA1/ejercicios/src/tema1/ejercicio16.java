package tema1;

public class ejercicio16 {
    public static void main(String[] args) {
        // 16. Escriba un programa para calcular el área y el volumen de un cilindro. Para ello declare una constante
        //que guarde el valor de Pi. Declare, también, variables para el diámetro y la altura del cilindro. Suponga
        //para el ejemplo que el cilindro tiene un diámetro de 15,5cm y una altura de 42,4cm.

        double area,volumen, altura, diametro,radio  ;

        altura = 42.4;
        diametro = 15.5;
        radio = diametro / 2;

        volumen = Math.PI * Math.pow(radio,2) * altura;
        area = 2 * Math.PI * (radio + altura);

        System.out.println("Área: " + area);
        System.out.println("Volumen: " + volumen);

    }
}

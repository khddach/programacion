package tema1;

public class EjemploCasa {
    public static void main(String[] args) {
        double distancia  = 750;
        double consumeCocheLitros = 5.8;
        double consumeCocheLitrosKm= 100;
        double cocheBateriaKm  = 120;

        double consumeLitrosViaje   = (distancia * consumeCocheLitros) / consumeCocheLitrosKm ;
        System.out.println("Litros consumidos en un viaje de 750 km es :" + consumeLitrosViaje);

        // coche es híbrido
        double cocheHibridoDistancia = distancia - cocheBateriaKm ;
        double cocheHibridoLitrosViaje   = (cocheHibridoDistancia * consumeCocheLitros) / consumeCocheLitrosKm ;
        System.out.println("Consumo de coches híbridos: es "+ cocheHibridoLitrosViaje );


        if (consumeLitrosViaje > cocheHibridoLitrosViaje) {

            System.out.println("Un coche normal consume más combustible.");
        } else if (consumeLitrosViaje < cocheHibridoLitrosViaje) {
            System.out.println("Un coche híbridos consume más combustible.");

        } else {
            System.out.println("Los coches híbridos y convencionales consumen la misma cantidad de combustible.");
        }

    }
}

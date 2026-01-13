package tema5.ejercicios;

public class Testt {
    public static void main(String[] args) {

        //1. Crea una lista de Spotify de 10 canciones
        Cancion cancion1 = new Cancion("psy","psy",300) ;
        Cancion cancion2 = new Cancion("psy","psy",300) ;
        Cancion cancion3 = new Cancion("psy","psy",300) ;
        Cancion cancion4 = new Cancion("psy","psy",300) ;
        Cancion cancion5 = new Cancion("psy","psy",300) ;
        Cancion cancion6 = new Cancion("psy","psy",300) ;
        Cancion cancion7 = new Cancion("psy","psy",300) ;
        Cancion cancion8 = new Cancion("psy","psy",300) ;
        Cancion cancion9 = new Cancion("psy","psy",300) ;
        Cancion cancion10 = new Cancion("psy","psy",300) ;

        ListaSpotify listaSpotify = new ListaSpotify("lista1");
        listaSpotify.addCancion(cancion1);
        listaSpotify.addCancion(cancion2);
        listaSpotify.addCancion(cancion3);
        listaSpotify.addCancion(cancion4);
        listaSpotify.addCancion(cancion5);
        listaSpotify.addCancion(cancion6);
        listaSpotify.addCancion(cancion7);
        listaSpotify.addCancion(cancion8);
        listaSpotify.addCancion(cancion9);
        listaSpotify.addCancion(cancion10);

        //2. Píntala
        System.out.println(listaSpotify);
        //3. Recorre la lista con un for y pinta cada canción su título y autor solo
        for (Cancion cancion:listaSpotify.getCanciones()) {
            System.out.println(cancion.getTitulo() + " _:_ "+ cancion.getArtista());
        }
        //4. Pide por teclado un título y un autor
        //5. Elimina la canción de la lista con ese título y ese autor

    }
}

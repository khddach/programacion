package tema5.metodosstatic;

public class TestVideojuego {
    public static void main(String[] args) {

        Videojuego dota = new Videojuego("dota","PC", Videojuego.CategoriaVideojuego.MMO);
        Videojuego lol = new Videojuego("lol","PC", Videojuego.CategoriaVideojuego.MMO);
        Videojuego dotaPS5 = new Videojuego(lol);
        dotaPS5.setPlataforma("PS5");

        System.out.println(dota);
        System.out.println(lol);
        System.out.println(dotaPS5);
    }
}

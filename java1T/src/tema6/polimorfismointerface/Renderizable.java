package tema6.polimorfismointerface;

public interface Renderizable {
    void render();
    void update();
    void dispose();

    default void init() {
        IO.println("Iniciando renderizado...");
    }
}
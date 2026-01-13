package tema5.ejercicios;

import java.util.ArrayList;

public class ListaSpotify {

    private String nombre;
    private ArrayList<Cancion> canciones;

    //Constructor parametrizado
    public ListaSpotify(String nombre) {
        this.nombre = nombre;
        canciones = new ArrayList<>(); //Se inicializa el ArrayList
    }

    //Constructor copia
    public ListaSpotify(ListaSpotify o) {
        this.nombre = o.nombre;
        this.canciones = o.canciones;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return this.canciones;
    }

    //ToString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ListaSpotify{");
        sb.append("nombre='").append(nombre).append('\'');
        for(Cancion cancion : canciones)
            sb.append(cancion).append('\n');
        sb.append('}');
        return sb.toString();
    }

    //Añadir canción
    public void addCancion(Cancion cancion) {
        this.canciones.add(cancion);
    }

    //Eliminar canción
    public void removeCancion(Cancion cancion) {
        this.canciones.remove(cancion);
    }
}
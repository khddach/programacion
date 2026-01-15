package tema5.ejercicioclase2.servicios;

import tema5.ejercicioclase2.modelos.Libro;

import java.util.ArrayList;

public class Bibliotica {
    private String nombre;
    private ArrayList<Libro> contenidos;


    public Bibliotica(String nombre) {
        this.nombre = nombre;
        this.contenidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getcontenidos() {
        return contenidos;
    }


    public void addContenido(Libro cd) {
        this.contenidos.add(cd);
    }


    public void removeContenido(Libro cd) {
        this.contenidos.remove(cd);
    }

    public void removecContenidoById(String id) {
        for (Libro cd: contenidos) {
            if (cd.getTipo().equals(id)) {
                contenidos.remove(cd);
            }
        }

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bibliotica{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", contenidos=").append('\'');
        for (Libro cd: contenidos){
            sb.append(cd).append('\'');
        }
        sb.append('}');
        return sb.toString();
    }


}

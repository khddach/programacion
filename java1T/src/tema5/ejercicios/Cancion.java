package tema5.ejercicios;

import java.util.Objects;

public class Cancion {
    private String titulo;
    private String artista;
    private Integer duracion;



    //Constructor parametrizado
    public Cancion(String titulo, String artista, Integer duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }


    //Constructor copia
    public Cancion(Cancion c) {
        this.titulo = c.titulo;
        this.artista = c.artista;
        this.duracion = c.duracion;
    }


    //Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    //ToString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cancion{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", artista='").append(artista).append('\'');
        sb.append(", duracion=").append(duracion);
        sb.append('}');
        return sb.toString();
    }


    //Equals con titulo y artista
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cancion cancion = (Cancion) o;
        return Objects.equals(titulo, cancion.titulo) && Objects.equals(artista, cancion.artista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, artista);
    }

}

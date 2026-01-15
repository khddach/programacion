package tema5.ejercicioclase2.modelos;

import java.util.UUID;

public class Libro {

    protected String id;
    protected String title;
    protected String author;
    protected Integer year;

    public Libro(String title, String author, Integer year) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Libro(Libro otro) {
        this.id = otro.id;
        this.title = otro.title;
        this.author = otro.author;
        this.year = otro.year;
    }


    public String getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    /**
     * Método abstracto String getTipo()
     * @return
     */
    public String getTipo() {
        return "Libro";
    } ;

    /**
     * Método abstracto void reproducir()
     */
   // public abstract void reproducir() ;
}

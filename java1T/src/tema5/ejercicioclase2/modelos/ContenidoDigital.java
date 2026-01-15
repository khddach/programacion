package tema5.ejercicioclase2.modelos;

import java.util.Objects;
import java.util.UUID;

public abstract class ContenidoDigital  extends Libro{


    /*
        Atributos: id, title, author, year, size
        Constructor con todo y constructor copia
        Getters y Setters
        toString
        equals por id
        Método abstracto String getTipo()
        Método abstracto void reproducir()
     */

    protected Integer size;

    public ContenidoDigital(String title, String author, Integer year, Integer size) {
        super(title, author, year);
        this.size = size;
    }

    public ContenidoDigital(ContenidoDigital otro) {
        super(otro);
        this.size = otro.size;
    }


    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContenidoDigital{");
        sb.append("id='").append(id).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", year=").append(year);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ContenidoDigital that = (ContenidoDigital) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    /**
     * Método abstracto String getTipo()
     * @return
     */
    public abstract String getTipo() ;

    /**
     * Método abstracto void reproducir()
     */
    public abstract void reproducir() ;
}

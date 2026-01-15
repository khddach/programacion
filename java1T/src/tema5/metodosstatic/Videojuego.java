package tema5.metodosstatic;

import java.util.Objects;

public class Videojuego {
    public enum CategoriaVideojuego {
        ACCION,
        AVENTURA,
        RPG,
        CONDUCCION,
        ESTRATEGIA,
        DEPORTE,
        SIMULACION,
        MMO
    }

    public static final String slugCodigo = "GAME-";

    public static Integer totalJuegos = 0;
    public static Double precioAlquiler = 5.0;
    public static Integer totalJuegosPrestados = 0;

    public String codigo;
    public String titulo;
    public String plataforma;
    public CategoriaVideojuego categoria;
    public boolean disponible;
    public Integer vecesAlquilado;

    //Constructor con titulo, plantaforma y categoria, lo demás lo ponéis vosotros

    public Videojuego(String titulo, String plataforma, CategoriaVideojuego categoria) {
        totalJuegos++;
        this.codigo = generarCodigo();
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.categoria = categoria;

        this.disponible = true ;
        this.vecesAlquilado = 0 ;

    }

    //Constructor copia, con código nuevo

    public Videojuego(Videojuego o) {
        totalJuegos++;
        this.codigo = generarCodigo();
        this.titulo = o.titulo ;
        this.plataforma = o.plataforma ;
        this.categoria = o.categoria ;
        this.disponible = o.disponible ;
        this.vecesAlquilado = o.vecesAlquilado ;

    }
    //Getters y setters

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public CategoriaVideojuego getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaVideojuego categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Integer getVecesAlquilado() {
        return vecesAlquilado;
    }

    public void setVecesAlquilado(Integer vecesAlquilado) {
        this.vecesAlquilado = vecesAlquilado;
    }

    public static Integer getTotalJuegos() {
        return totalJuegos;
    }

    public static Double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public static void setPrecioAlquiler(Double precioAlquiler) {
        Videojuego.precioAlquiler = precioAlquiler;
    }

    public static Integer getTotalJuegosPrestados() {
        return totalJuegosPrestados;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Videojuego{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", plataforma='").append(plataforma).append('\'');
        sb.append(", categoria=").append(categoria);
        sb.append(", disponible=").append(disponible);
        sb.append(", vecesAlquilado=").append(vecesAlquilado);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Videojuego that = (Videojuego) o;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }


    private String generarCodigo() {
        return slugCodigo+ String.format("%06d", totalJuegos);
    };

    public void cambiarPrecioAlquiler(double precio) {
        precioAlquiler  = precio ;
    };

    public boolean alquilar() {
       if (this.disponible) {
           this.disponible = false;
           totalJuegosPrestados++;
           this.vecesAlquilado++;
           return true;
       }
        return false;
    };

    public boolean devolver() {
        if (!this.disponible) {
            this.disponible = true;
            totalJuegosPrestados--;
            return true;
        }
        return false;
    };


    public double calcularPrecioAlquiler() {
        if ( (this.vecesAlquilado >= 20) && (this.vecesAlquilado <= 100) ) {
            return Videojuego.precioAlquiler + 1;
        }
        else if (this.vecesAlquilado >= 100) {
            return Videojuego.precioAlquiler + 2;
        }
        else {
            return Videojuego.precioAlquiler;
        }
    }

    //toString
    //equals por codigo
    //Metodo para generar código --> GAME-0000<totalJuegos>
    //Metodo para cambiar el precio del alquiler de todos los juegos
    //Metodo para alquilar --> Si está disponible, lo pone no disponible e incrementa totalJuegosPrestados
    //                         e incrementa vecesAlquilado en 1. true si puede alquilar, false si no
    //Metodo para devolver --> Si no está disponible, se pone disponible y se decrementa totalJuegosPrestados
    //                         true si puede devolver, false si no
    //Metodo para calcular el precio del alquiler de un juego -->
    //    - Si el juego ha sido alquilado más de 20 veces, le sumamos 1€ al precio base de alquiler y devolvemos ese valor
    //    - Si el juego ha sido alquilado más de 100 veces, le sumamos 2€ al precio base del alquiler y devolvemos ese valor

    //Test:
    // 1. Crear 4 juegos
    // 2. Pintar los juegos
    // 3. Alquilar uno 3 veces (hay que devolverlo tras cada alquiler)
    // y pintar su precio de alquiler en cada alquiler
    // 4. Cambiar precio de alquiler a 6€
    // 5. Alquilar un juego 22 veces (hay que devolverlo tras cada alquiler)
    // y pintar su precio de alquiler en cada alquiler




}

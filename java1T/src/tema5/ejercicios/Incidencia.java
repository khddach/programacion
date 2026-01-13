package tema5.ejercicios;

public class Incidencia {

    enum EstadoIncidencia {
        ABIERTA,
        EN_PROCESO,
        RESUELTA
    }

    private String codigo;
    private String problema;
    private String solucion;
    private EstadoIncidencia estado;

    private static Integer pendientes= 0;
    private static Integer autoinc = 0;


    public Incidencia(String problema) {
        this.problema = problema;
        this.estado = EstadoIncidencia.ABIERTA;
        Incidencia.autoinc++;
        this.codigo ="INC-"+(Incidencia.autoinc);
    }
}

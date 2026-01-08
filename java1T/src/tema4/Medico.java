package tema4;

public class Medico {

    /**
     * Crear clase Medico
     * Propiedades:
     * - nombre
     * - especialidad (enum Especialidad ->
     *     GENERAL, DIGESTIVO, OTORRINO, CARDIOLOGIA, NEUROLOGIA, TRAUMATOLOGIA)
     * - edad
     * - email
     * - telefono
     * - estado (enum Estado -> ACTIVO, INACTIVO)
     *
     * Constructor con todo menos 'estado'. El estado por defecto es ACTIVO.
     * Getters de todo
     * Setters de todo menos 'estado'
     * ToString
     * Metodos propios:
     * - baja() -> pone el estado en INACTIVO
     * - alta() -> pone el estado en ACTIVO
     *
     * En un main crea dos médicos, pon uno de baja y pinta los dos
     */


    private String nombre;
    private Especialidad especialidad;
    private int edad;
    private String email;
    private String telefono;
    private Estado estado;

    public Medico(String nombre, Especialidad especialidad, int edad, String email, String telefono, Estado estado) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Estado getEstado() {
        return estado;
    }



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Medico{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", especialidad=").append(especialidad);
        sb.append(", edad=").append(edad);
        sb.append(", email='").append(email).append('\'');
        sb.append(", telefono=").append(telefono);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }


    public void baja() {
        this.estado = Estado.INACTIVO;
    }

    public void alta() {
        this.estado = Estado.ACTIVO;
    }
}

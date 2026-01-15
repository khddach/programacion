package tema6.polimarfismolases;

public class Furgoneta {

    protected String marca;
    protected String modelo;
    protected String color;
    protected String matricula;

    public Furgoneta(String marca, String modelo, String color, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Furgoneta{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

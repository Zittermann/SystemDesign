package domain;

public abstract class Participante {


    protected String nombre;
    protected double ofertaMasReciente;

    public abstract double ofertar(Producto producto);


    public Participante(String nombre, double ofertaMasReciente) {
        this.nombre = nombre;
        this.ofertaMasReciente = ofertaMasReciente;
    }

    public String getNombre() {
        return nombre;
    }
}

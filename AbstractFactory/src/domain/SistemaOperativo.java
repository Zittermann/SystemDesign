package domain;

public abstract class SistemaOperativo {

    protected String nombre;

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "SistemaOperativo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

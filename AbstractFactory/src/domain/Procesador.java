package domain;

public abstract class Procesador {

    protected String marca;

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "marca='" + marca + '\'' +
                '}';
    }
}

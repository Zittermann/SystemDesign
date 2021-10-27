package domain;

public class Computadora {

    private SistemaOperativo so;
    private Procesador procesador;

    public Computadora(SistemaOperativo so, Procesador procesador) {
        this.so = so;
        this.procesador = procesador;
    }

    public SistemaOperativo getSo() {
        return so;
    }

    public void setSo(SistemaOperativo so) {
        this.so = so;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "so=" + so +
                ", procesador=" + procesador +
                '}';
    }
}

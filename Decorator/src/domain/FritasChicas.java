package domain;

public class FritasChicas extends Decorator {


    public FritasChicas(Comida comida) {
        super(comida);
    }

    @Override
    public double calcularPrecio() {
        return this.getComida().calcularPrecio() + 10;
    }
}

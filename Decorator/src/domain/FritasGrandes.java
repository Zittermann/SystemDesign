package domain;

public class FritasGrandes extends Decorator {


    public FritasGrandes(Comida comida) {
        super(comida);
    }

    @Override
    public double calcularPrecio() {
        return this.getComida().calcularPrecio() + 15;
    }
}

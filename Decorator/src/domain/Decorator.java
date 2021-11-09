package domain;

public abstract class Decorator implements Comida{

    private Comida comida;

    @Override
    public abstract double calcularPrecio();

    public Decorator(Comida comida){
        this.comida = comida;
    }

    public Comida getComida(){
        return comida;
    }

}

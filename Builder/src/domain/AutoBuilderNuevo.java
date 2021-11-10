package domain;

public class AutoBuilderNuevo {

    private Auto auto;

    public AutoBuilderNuevo() {
        this.auto = new Auto();
    }

    public AutoBuilderNuevo addMatricula(int matriculo){
        auto.setMatricula(matriculo);
        return this;
    }

    public AutoBuilderNuevo addMarca(String marca){
        auto.setMarca(marca);
        return this;
    }

    public Auto build(){
        return auto;
    }

}

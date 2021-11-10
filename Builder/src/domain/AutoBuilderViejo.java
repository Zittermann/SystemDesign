package domain;

public class AutoBuilderViejo {

    private Auto auto;

    public AutoBuilderViejo() {
        this.auto = new Auto();
    }

    public void addMatricula(int matricula){
        auto.setMatricula(matricula);
    }

    public void addModelo(String marca){
        auto.setMarca(marca);
    }

    public Auto build(){
        return auto;
    }

}

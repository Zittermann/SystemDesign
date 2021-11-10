package domain;

public class Auto {

    private int matricula;
    private String marca;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "matricula=" + matricula +
                ", modelo='" + marca + '\'' +
                '}';
    }
}

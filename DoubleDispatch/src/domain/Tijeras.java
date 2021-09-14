package domain;

public class Tijeras implements Situaciones {

    @Override
    public String jugar(Situaciones situaciones) {
        return situaciones.jugar(this);
    }

    @Override
    public String jugar(Papel papel) {
        return "GANA TIJERAS";
    }

    @Override
    public String jugar(Piedra piedra) {
        return "GANA PIEDRA";
    }

    @Override
    public String jugar(Tijeras tijeras) {
        return "EMPATE";
    }
}

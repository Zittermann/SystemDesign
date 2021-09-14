package domain;

public class Papel implements Situaciones {

    @Override
    public String jugar(Situaciones situaciones) {
        return situaciones.jugar(this);
    }

    @Override
    public String jugar(Papel papel) {
        return "EMPATE";
    }

    @Override
    public String jugar(Piedra piedra) {
        return "GANA PAPEL";
    }

    @Override
    public String jugar(Tijeras tijeras) {
        return "GANA TIJERAS";
    }
}

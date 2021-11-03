package domain;

public class ImplParticipantePorcentaje implements Participante {

    @Override
    public double ofertar(double precio) {
        return precio * 1.1d;
    }

}

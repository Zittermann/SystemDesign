package domain;

public class ImplParticipanteMultiplica implements Participante {

    @Override
    public double ofertar(double precio) {
        return precio * 2d;
    }
}

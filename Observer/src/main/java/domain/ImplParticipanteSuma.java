package domain;

public class ImplParticipanteSuma implements Participante {


    @Override
    public double ofertar(double precio) {
        return precio + 100d;
    }

}

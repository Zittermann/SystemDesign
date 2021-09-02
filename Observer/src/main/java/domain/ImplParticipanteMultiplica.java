package domain;

public class ImplParticipanteMultiplica extends Participante {


    @Override
    public double ofertar(Producto producto) {
        this.ofertaMasReciente *= 2d;

        return this.ofertaMasReciente;

    }

    public ImplParticipanteMultiplica(String nombre, double ofertaMasReciente) {
        super(nombre, ofertaMasReciente);
    }


}

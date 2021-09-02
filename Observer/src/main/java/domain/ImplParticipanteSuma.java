package domain;

public class ImplParticipanteSuma extends Participante {

    @Override
    public double ofertar(Producto producto) {
        this.ofertaMasReciente += 100d;

        return this.ofertaMasReciente;
    }

    public ImplParticipanteSuma(String nombre, double ofertaMasReciente) {
        super(nombre, ofertaMasReciente);
    }

}

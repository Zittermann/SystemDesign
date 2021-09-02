package domain;

public class ImplParticipantePorcentaje extends Participante {

    @Override
    public double ofertar(Producto producto) {
        this.ofertaMasReciente += (this.ofertaMasReciente * 0.1d);

        return this.ofertaMasReciente;
    }

    public ImplParticipantePorcentaje(String nombre, double ofertaMasReciente) {
        super(nombre, ofertaMasReciente);
    }

}

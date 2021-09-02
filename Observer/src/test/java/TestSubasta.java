import domain.*;

import java.util.ArrayList;

public class TestSubasta {

    public static void main(String[] args) {
        ArrayList<Participante> participantes = new ArrayList<>();

        Producto queso = new Producto("Queso", 100, 1000);

        participantes.add(new ImplParticipanteMultiplica("German", queso.getPrecioInicial()));
        participantes.add(new ImplParticipanteSuma("Tommy", queso.getPrecioInicial()));
        participantes.add(new ImplParticipantePorcentaje("Feli", queso.getPrecioInicial()));

        new Subasta().subastar(queso, participantes);

    }
}

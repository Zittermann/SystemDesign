import domain.*;

import java.util.ArrayList;

public class TestSubasta {

    public static void main(String[] args) {
        Producto queso = new Producto("Queso", 100, 1000);

        Subasta subasta = new Subasta();

        subasta.add(new ImplParticipanteMultiplica("German", queso.getPrecioInicial()));
        subasta.add(new ImplParticipanteSuma("Tommy", queso.getPrecioInicial()));
        subasta.add(new ImplParticipantePorcentaje("Feli", queso.getPrecioInicial()));

        subasta.subastar(queso);

    }
}

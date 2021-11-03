import domain.*;

import java.util.ArrayList;

public class TestSubasta {

    public static void main(String[] args) {

        Producto queso = new Producto("Queso", 100);
        Subasta subasta = new Subasta();

        subasta.add(new ImplParticipanteMultiplica());
        subasta.add(new ImplParticipanteSuma());
        subasta.add(new ImplParticipantePorcentaje());

        subasta.subastar(queso, 5000);

    }
}

import domain.Contrato;
import domain.ImplCreado;

import static domain.Contrato.getInstance;

public class TestContrato {

    public static void main(String[] args) {
        Contrato contrato = Contrato.getInstance();

        contrato.setContratoState(new ImplCreado());
        contrato.crear();
        contrato.editar();
        contrato.aprobar();

    }

}

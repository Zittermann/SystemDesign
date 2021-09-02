package domain;

public class ImplCreado implements  IContratoState {

    @Override
    public void crear(Contrato contrato) {
        System.out.println("Creamos nuevo contrato");
        contrato.setContratoState(new ImplEditado());
    }

    @Override
    public void editar(Contrato contrato) {
        System.err.println("No se puede editar un contrato que no ha sido creado");
    }

    @Override
    public void aprobar(Contrato contrato) {
        System.err.println("No se puede aprobar un contrato que no ha sido creado");
    }
}

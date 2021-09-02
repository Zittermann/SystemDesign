package domain;

public class ImplAprobado implements IContratoState {
    @Override
    public void crear(Contrato contrato) {
        System.err.println("No se puede crear un contrato que ya existe");
    }

    @Override
    public void editar(Contrato contrato) {
        System.err.println("No se puede editar un contrato que ya ha sido aprobado");
    }

    @Override
    public void aprobar(Contrato contrato) {
        System.out.println("Contrato aprobado!");
    }
}

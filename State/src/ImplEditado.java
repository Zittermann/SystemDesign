public class ImplEditado implements IContratoState {
    @Override
    public void crear(Contrato contrato) {
        System.err.println("No se puede crear un contrato que ya existe");
    }

    @Override
    public void editar(Contrato contrato) {
        System.out.println("Editamos el contrato...");
        contrato.setContratoState(new ImplAprobado());
    }

    @Override
    public void aprobar(Contrato contrato) {
        System.err.println("No se puede aprobar un contrato que no ha siendo editado");
    }
}
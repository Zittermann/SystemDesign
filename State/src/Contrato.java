public class Contrato {

    private IContratoState contratoState;


    public void crear(){
        contratoState.crear(this);
    }

    public void editar(){
        contratoState.editar(this);
    }

    public void aprobar(){
        contratoState.aprobar(this);
    }

    public IContratoState getContratoState() {
        return contratoState;
    }

    public void setContratoState(IContratoState contratoState) {
        this.contratoState = contratoState;
    }
}

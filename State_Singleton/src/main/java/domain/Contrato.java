package domain;

public class Contrato {

    private static Contrato instance = null;
    private IContratoState contratoState;

    private Contrato(){}

    public static Contrato getInstance(){
        if(instance == null){
            instance = new Contrato();
        }
        return instance;
    }

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

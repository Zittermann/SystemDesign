package domain;

public abstract class Colega {

    private Mediator mediator;

    public abstract void enviar(String destino, String mensaje);
    public abstract void recibir(String origen, String mensaje);

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}

package domain;

public interface Mediator {

    void addColega(Colega colega);
    void removeColega(Colega colega);
    void rutear(String origen, String destino, String mensaje);

}

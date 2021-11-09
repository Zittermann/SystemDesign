package domain;

public interface IBancoStrategy {
    void transferir(Cuenta origen, Cuenta destino, float monto);
}

package domain;

public interface IBanco {
    void transferir(Cuenta origen, Cuenta destino, float monto);

}

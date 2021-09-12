package domain;

public class NullObjectStrategy  implements IBancoStrategy {
    @Override
    public void transferir(Cuenta origen, Cuenta destino, float monto) {
        System.err.println("Error: No se le ha asignado una estrategia al banco");
    }
}

package domain;

public class NullObjectStrategy  implements IBancoStrategy {
    @Override
    public void transferir(Cuenta origen, Cuenta destino, float monto) throws NullObjectException {
        throw new NullObjectException();
    }
}

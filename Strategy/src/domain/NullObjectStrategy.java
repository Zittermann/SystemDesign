package domain;

public class NullObjectStrategy  implements IBancoStrategy {
    @Override
    public void transferir(Cuenta origen, Cuenta destino, float monto) {
        if (origen.getSaldo() >= monto) {
            origen.restarSaldo(monto);
            destino.agregarSaldo(monto);
            System.out.println("Se han transferido [" + monto + "]" + " con exito\n");
        } else System.err.println("Error: Saldo insuficiente\n");
    }
}

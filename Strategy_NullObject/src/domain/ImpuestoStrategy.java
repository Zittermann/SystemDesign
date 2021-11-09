package domain;

public class ImpuestoStrategy implements IBancoStrategy {


    @Override
    public void transferir(Cuenta origen, Cuenta destino, float monto) {

        float comisionIncluida = monto + (monto * origen.getComision());

        if (origen.getSaldo() >= comisionIncluida) {
            origen.restarSaldo(comisionIncluida);
            destino.agregarSaldo(monto);
            System.out.println("Se han transferido [" + monto + "]" + " con exito\n");
        } else System.err.println("Error: Saldo insuficiente\n");
    }
}

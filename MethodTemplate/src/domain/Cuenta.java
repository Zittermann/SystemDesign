package domain;

public abstract class Cuenta {

    protected float saldo;
    protected float comision;

    void agregarSaldo(float monto) {
        this.saldo += monto;
    }

    void restarSaldo(float monto) {
        this.saldo -= monto;
    }

    public Cuenta(float saldo, float comision) {
        this.saldo = saldo;
        this.comision = comision;
    }

    public final void transferir(Cuenta destino, float monto) {

        float comisionIncluida = monto + (monto * descontarComision());

        if (comisionIncluida >= monto) {
            this.saldo -= comisionIncluida;
            destino.saldo += monto;
            System.out.println("La trasnferencia se realizo exitosamente");
        } else System.err.println("Error: Saldo insuficiente");

    }

    public abstract float descontarComision();

    public float getSaldo() {
        return saldo;
    }

    public float getComision() {
        return comision;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", comision=" + comision +
                '}';
    }
}

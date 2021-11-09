package domain;

public class Cuenta {

    private final int cbu;
    private float saldo;
    private float comision;


    public Cuenta(int cbu, float saldo, float comision){
        this.cbu = cbu;
        this.saldo = saldo;
        this.comision = comision/100;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getComision() {
        return comision;
    }

    void agregarSaldo(float monto){
        this.saldo += monto;
    }

    void restarSaldo(float monto){
        this.saldo -= monto;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "cbu=" + cbu +
                ", saldo=" + saldo +
                ", comision=" + comision +
                '}';
    }
}

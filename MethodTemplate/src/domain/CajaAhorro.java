package domain;

public class CajaAhorro extends Cuenta {
    public CajaAhorro(float saldo, float comision) {
        super(saldo, comision);
    }

    @Override
    public float descontarComision() {
        return this.comision / 100;
    }
}

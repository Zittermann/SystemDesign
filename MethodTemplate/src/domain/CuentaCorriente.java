package domain;

public class CuentaCorriente extends Cuenta{

    public CuentaCorriente(float saldo, float comision) {
        super(saldo, comision);
    }

    @Override
    public float descontarComision() {
        return 0;
    }
}

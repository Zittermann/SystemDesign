package domain;

public class MagoFlyImpl implements UnidadFly {


    @Override
    public int getSalud() {
        return 40;
    }

    @Override
    public int getAtaque() {
        return 150;
    }

    @Override
    public int getDefensa() {
        return 20;
    }
}

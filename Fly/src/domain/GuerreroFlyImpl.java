package domain;

public class GuerreroFlyImpl implements UnidadFly {


    @Override
    public int getSalud() {
        return 100;
    }

    @Override
    public int getAtaque() {
        return 60;
    }

    @Override
    public int getDefensa() {
        return 50;
    }
}

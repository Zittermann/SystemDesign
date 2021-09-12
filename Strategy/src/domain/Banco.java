package domain;

public class Banco {

    private IBancoStrategy bancoStrategy;

    public Banco() {
        this.bancoStrategy = new NullObjectStrategy();
    }

    public Banco(IBancoStrategy bancoStrategy) {
        this.bancoStrategy = bancoStrategy;
    }


    public void ejecutar(Cuenta origen, Cuenta destino, float monto){
        bancoStrategy.transferir(origen, destino, monto);
    }


    public IBancoStrategy getBancoStrategy() {
        return bancoStrategy;
    }


    public void setBancoStrategy(IBancoStrategy bancoStrategy) {
        this.bancoStrategy = bancoStrategy;
    }
}

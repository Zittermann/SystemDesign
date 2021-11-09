package domain;

public class Adapter {

    private Banco banco;
    private String moneda;

    public void transformar(double monto){
        banco.transferirPesos(monto, this.moneda);
    }

    public Adapter(Banco banco, String moneda) {
        this.banco = banco;
        this.moneda = moneda;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

}

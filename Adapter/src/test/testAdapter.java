package test;

import domain.Adapter;
import domain.Banco;

public class testAdapter {

    public static void main(String[] args) {

        Banco banco = new Banco();
        Adapter adapter = new Adapter(banco, "pesos");

        adapter.transformar(1000);


    }

}

package test;

import domain.Soldado;
import domain.SoldadoFactory;

public class SoldadoTest {
    public static void main(String[] args) {

        SoldadoFactory soldadoFactory = new SoldadoFactory();
        Soldado mosquetero = soldadoFactory.crearMosquetero();

        mosquetero.caminar();
        mosquetero.atacar();

    }

}

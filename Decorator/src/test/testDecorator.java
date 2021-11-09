package test;

import domain.Comida;
import domain.FritasGrandes;
import domain.Hamburguesa;

public class testDecorator {

    public static void main(String[] args) {

        Comida hamburguesa = new Hamburguesa();
        System.out.println("Precio hamburguesa: " + hamburguesa.calcularPrecio());

        Comida papas = new FritasGrandes(hamburguesa);
        System.out.println("Precio hamburguesa con papas grandes: " + papas.calcularPrecio());

    }

}

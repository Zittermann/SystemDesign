package test;

import domain.Computadora;
import factories.AbstractFactory;
import factories.WinAmdFactory;

public class TestAbsFactory {

    public static void main(String[] args) {

        AbstractFactory WindowsAmd = new WinAmdFactory();
        Computadora computadora = new Computadora(WindowsAmd.crearSO(), WindowsAmd.crearProcesador());

        System.out.println(computadora.toString());

    }

}

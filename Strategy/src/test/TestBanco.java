package test;

import domain.Banco;
import domain.ImpuestoStrategy;
import domain.Cuenta;
import domain.IBancoStrategy;

public class TestBanco {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta(4344123, 5000, 1);
        Cuenta cuenta2 = new Cuenta(3312341, 5000, 0);

        Banco banco = new Banco();
        banco.setBancoStrategy(new ImpuestoStrategy());

        banco.ejecutar(cuenta1, cuenta2, 2500);


        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());

    }
}

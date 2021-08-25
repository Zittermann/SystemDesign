package test;

import domain.BancoImpl;
import domain.Cuenta;
import domain.IBanco;

public class TestBanco {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta(4344123, 5000, 1);
        Cuenta cuenta2 = new Cuenta(3312341, 5000, 0);
        IBanco banco = new BancoImpl();

        banco.transferir(cuenta1, cuenta2, 2500);

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());

    }
}

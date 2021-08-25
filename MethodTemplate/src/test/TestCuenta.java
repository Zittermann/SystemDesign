package test;

import domain.CajaAhorro;
import domain.Cuenta;

public class TestCuenta {

    public static void main(String[] args) {
        Cuenta cuenta1 = new CajaAhorro(5000, 1);
        Cuenta cuenta2 = new CajaAhorro(5000, 0);

        cuenta1.transferir(cuenta2, 2500);

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());



    }

}

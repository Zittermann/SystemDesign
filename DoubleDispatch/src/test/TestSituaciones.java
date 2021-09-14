package test;

import domain.Piedra;
import domain.Situaciones;
import domain.Tijeras;
import domain.Papel;

public class TestSituaciones {

    public static void main(String[] args) {
        Situaciones jugador1 = new Piedra();
        Situaciones jugador2 = new Tijeras();
        Situaciones jugador3 = new Papel();

        System.out.println(jugador2.jugar(jugador1));
    }

}

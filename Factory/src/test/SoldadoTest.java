package test;

import domain.Soldado;
import domain.SoldadoFactory;

import java.util.Scanner;

public class SoldadoTest {
    public static void main(String[] args) {

        SoldadoFactory soldadoFactory = new SoldadoFactory();
        Soldado soldado = null;


        Scanner s = new Scanner(System.in);

        System.out.println("(G)uerrero o (M)osquetero?");

        soldado = soldadoFactory.crearSoldado(s.nextLine());

        soldado.caminar();
        soldado.atacar();

    }

}

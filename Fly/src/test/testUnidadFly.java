package test;

import domain.*;

public class testUnidadFly {

    public static void main(String[] args) {

        int coordenadaX = 0, coordenadaY = 0;

        UnidadFlyFactory factory = new UnidadFlyFactory();

        Unidad guerrero1 = new Unidad("Guerrero", coordenadaX, coordenadaY);
        Unidad guerrero2 = new Unidad("Guerrero", coordenadaX, coordenadaY);
        Unidad mago1 = new Unidad("Mago", coordenadaX, coordenadaY);

        System.out.println(guerrero1.getUnidadFly());
        System.out.println(guerrero2.getUnidadFly());

    }

}

package test;

import domain.Persona;

public class testClone {

    public static void main(String[] args) {

        Persona persona = new Persona("German");
        Persona clone = (Persona) persona.clonar();

        System.out.println(persona.toString() + " " + persona.getNombre());
        System.out.println(clone.toString() + " " + clone.getNombre());

    }

}

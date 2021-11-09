package test;

import domain.Carpeta;
import domain.Elemento;
import domain.Exe;

public class testComposite {

    public static void main(String[] args) {

        Carpeta carpeta1 = new Carpeta("Trabajos practicos");
        Carpeta carpeta2 = new Carpeta("Clases");
        Exe warcraft3 = new Exe("Warcraft III");

        carpeta1.addHijo(warcraft3);
        carpeta1.addHijo(carpeta2);

        carpeta1.abrir();
        carpeta1.mostrarHijos();

        carpeta2.abrir();
        carpeta2.mostrarHijos();

        warcraft3.abrir();

    }

}

package domain;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Elemento{

    private String nombre;
    List<Elemento> hijos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo carpeta " + this.nombre);
    }

    @Override
    public void borrar() {
        System.out.println("Borrando carpeta " + this.nombre);
    }

    public void addHijo(Elemento elemento){
        hijos.add(elemento);
    }

    public void removeHijo(String nombreElemento){
        hijos.forEach(elemento -> {
            if(elemento.getNombre().equals(nombreElemento)){
                hijos.remove(elemento);
            }
        });
    }

    public void mostrarHijos(){

        System.out.println("Los elementos dentro de la carpeta " + this.getNombre() + " son:");

        hijos.forEach(hijo -> {
            System.out.println("\t" + hijo.getNombre());
        });

        System.out.println();

    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}

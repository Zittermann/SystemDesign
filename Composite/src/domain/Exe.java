package domain;

public class Exe implements Elemento{

    private String nombre;

    public Exe(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void abrir() {
        System.out.println("Ejecutando " + this.nombre + ".exe");
    }

    @Override
    public void borrar() {
        System.out.println("Eliminando " + this.nombre + ".exe");
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}

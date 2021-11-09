package domain;

public class Persona implements Clonable{

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Object clonar() {
        Persona clonePersona = new Persona();
        clonePersona.setNombre(new String(this.nombre));

        return clonePersona;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

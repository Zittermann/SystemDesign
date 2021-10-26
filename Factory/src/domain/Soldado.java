package domain;

public abstract class Soldado {

    private String nombre;
    private double damage;

    public void caminar(){
        System.out.println(this.nombre + " esta caminando!");
    }

    public void atacar(){
        System.out.println(this.nombre + " esta atacando!");
    }

    public Soldado(String nombre, double damage) {
        this.nombre = nombre;
        this.damage = damage;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}

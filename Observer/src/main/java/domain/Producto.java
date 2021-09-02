package domain;

public class Producto {

    private String nombre;
    private double precioInicial;
    private double precioMaximo;
    private double mayorOferta = 0;
    private String ganador;

    public Producto(String nombre, double precioInicial, double precioMaximo) {
        this.nombre = nombre;
        this.precioInicial = precioInicial;
        this.precioMaximo = precioMaximo;
    }

    public double getPrecioInicial() {
        return precioInicial;
    }

    public double getPrecioMaximo() {
        return precioMaximo;
    }

    public double getMayorOferta() {
        return mayorOferta;
    }

    public void setMayorOferta(double mayorOferta) {
        this.mayorOferta = mayorOferta;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }
}

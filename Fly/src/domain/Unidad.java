package domain;


public class Unidad {

    private static UnidadFlyFactory factory = new UnidadFlyFactory();

    private UnidadFly unidadFly;
    private int coordenadaX;
    private int coordenadaY;
    private int saludActual;

    public Unidad(String tipoUnidad, int coordenadaX, int coordenadaY) {
        this.unidadFly = factory.getFly(tipoUnidad);
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.saludActual = unidadFly.getSalud();
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        coordenadaY = coordenadaY;
    }

    public int getSaludActual() {
        return saludActual;
    }

    public void setSaludActual(int saludActual) {
        this.saludActual = saludActual;
    }

    public UnidadFly getUnidadFly() {
        return unidadFly;
    }

    public void setUnidadFly(UnidadFly unidadFly) {
        this.unidadFly = unidadFly;
    }
}

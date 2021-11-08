package domain;

public class ObjetoVolador extends Colega {

    private String nombre;

    public ObjetoVolador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void enviar(String destino, String mensaje) {
        getMediator().rutear(this.nombre, destino, mensaje);
    }

    @Override
    public void recibir(String origen, String mensaje) {
        System.out.println(origen + " a " + this.nombre + ": " + mensaje);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

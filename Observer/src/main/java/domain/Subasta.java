package domain;

import java.util.ArrayList;
import java.util.List;

public class Subasta {

    List<Participante> participantesList;
    private double precioActual;
    private Participante ganador;

    public Subasta() {
        this.participantesList = new ArrayList<>();
    }

    public void add(Participante participante){
        participantesList.add(participante);
    }

    public void remove(Participante participante){
        participantesList.remove(participante);
    }

    public void subastar(Producto producto, double precioMaximo) {

        this.precioActual = producto.getPrecio();

        while (precioActual < precioMaximo) {

            participantesList.forEach(participante -> {

                this.precioActual = participante.ofertar(precioActual);
                System.out.println("Oferta: " + precioActual);

                if(this.precioActual > precioMaximo){
                    this.ganador = participante;
                }

            });

        }

        System.out.println("Se ofrecio: [" + this.precioActual + "] por: ["+ producto.getNombre()+"]");

    }

}

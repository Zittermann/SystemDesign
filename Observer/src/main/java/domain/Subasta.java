package domain;

import java.util.ArrayList;

public class Subasta {

    ArrayList<Participante> participantesList;

    public void add(Participante participante){
        participantesList.add(participante);
    }

    public void remove(Participante participante){
        participantesList.remove(participante);
    }

    public void subastar(Producto producto) {

        while (producto.getMayorOferta() < producto.getPrecioMaximo()) {

            participantesList.forEach(participante -> {

                double nuevaOferta = participante.ofertar(producto);

                System.out.println(nuevaOferta);

                if (nuevaOferta > producto.getMayorOferta()) {
                    producto.setMayorOferta(nuevaOferta);
                    producto.setGanador(participante.getNombre());
                }

            });

        }

        System.out.println("El ganador: [" + producto.getGanador() + "] ofrecio: [" + producto.getMayorOferta() + "]");

    }

}

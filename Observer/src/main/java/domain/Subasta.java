package domain;

import java.util.ArrayList;

public class Subasta {

    public void subastar(Producto producto, ArrayList<Participante> participantes) {

        while (producto.getMayorOferta() < producto.getPrecioMaximo()) {

            participantes.forEach(participante -> {

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

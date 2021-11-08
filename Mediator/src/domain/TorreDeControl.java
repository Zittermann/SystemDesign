package domain;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControl implements Mediator {

    private List<Colega> colegas = new ArrayList<>();

    @Override
    public void addColega(Colega colega) {
        colegas.add(colega);
    }

    @Override
    public void removeColega(Colega colega) {
        colegas.remove(colega);
    }

    @Override
    public void rutear(String origen, String destino, String mensaje) {

        colegas.forEach(colega -> {
            if(((ObjetoVolador)colega).getNombre() == destino){
                colega.recibir(origen, mensaje);
            }
        });

    }

}

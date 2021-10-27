package factories;

import domain.Procesador;
import domain.SistemaOperativo;
import domain.entities.Amd;
import domain.entities.Windows;

public class WinAmdFactory implements AbstractFactory{

    @Override
    public Procesador crearProcesador() {
        return new Amd();
    }

    @Override
    public SistemaOperativo crearSO() {
        return new Windows();
    }
}

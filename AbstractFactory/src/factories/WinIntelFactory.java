package factories;

import domain.Procesador;
import domain.SistemaOperativo;
import domain.entities.Intel;
import domain.entities.Windows;

public class WinIntelFactory implements AbstractFactory{
    @Override
    public Procesador crearProcesador() {
        return new Intel();
    }

    @Override
    public SistemaOperativo crearSO() {
        return new Windows();
    }
}

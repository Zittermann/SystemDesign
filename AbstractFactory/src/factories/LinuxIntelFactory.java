package factories;

import domain.Procesador;
import domain.SistemaOperativo;
import domain.entities.Intel;
import domain.entities.Linux;

public class LinuxIntelFactory implements AbstractFactory{
    @Override
    public Procesador crearProcesador() {
        return new Intel();
    }

    @Override
    public SistemaOperativo crearSO() {
        return new Linux();
    }
}

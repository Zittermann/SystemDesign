package factories;

import domain.Procesador;
import domain.SistemaOperativo;

public interface AbstractFactory {

    Procesador crearProcesador();
    SistemaOperativo crearSO();

}

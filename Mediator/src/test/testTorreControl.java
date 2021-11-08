package test;

import domain.Mediator;
import domain.ObjetoVolador;
import domain.TorreDeControl;

public class testTorreControl {

    public static void main(String[] args) {

        ObjetoVolador avion = new ObjetoVolador("Avion");
        ObjetoVolador helicoptero = new ObjetoVolador("Helicoptero");

        Mediator mediator = new TorreDeControl();
        mediator.addColega(avion);
        mediator.addColega(helicoptero);

        avion.setMediator(mediator);
        helicoptero.setMediator(mediator);

        avion.enviar("Helicoptero", "Wenas wenas");

    }

}

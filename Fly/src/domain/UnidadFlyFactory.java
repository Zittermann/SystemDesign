package domain;

import java.util.HashMap;

public class UnidadFlyFactory {

    private HashMap<String, UnidadFly> factory = new HashMap<>();

    public UnidadFly getFly(String tipoUnidad){

        if(!factory.containsKey(tipoUnidad)){
            switch (tipoUnidad){

                case "Guerrero":
                    factory.put(tipoUnidad, new GuerreroFlyImpl());
                break;

                case "Mago":
                    factory.put(tipoUnidad, new MagoFlyImpl());
                break;

                default:
                    System.err.println("Esa unidad no existe!");
                break;

            }
        }

        return factory.get(tipoUnidad);

    }

}

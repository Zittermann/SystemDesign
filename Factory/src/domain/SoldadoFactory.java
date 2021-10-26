package domain;

public class SoldadoFactory {

    public Soldado crearSoldado(String tipoSoldado){

        if(tipoSoldado.equals("G")){
            return new Guerrero();

        } else if(tipoSoldado.equals("M")){
            return new Mosquetero();

        } else return null;

    }

}

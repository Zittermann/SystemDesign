package domain;

public class SoldadoFactory {

    public Soldado crearGuerrero(){
        return new Guerrero();
    }

    public Soldado crearMosquetero(){
        return new Mosquetero();
    }

}

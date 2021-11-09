package domain;

public class NullObjectException extends RuntimeException{

    public NullObjectException(){
        super("Error: La estrategia no puede ser nula");
    }

}

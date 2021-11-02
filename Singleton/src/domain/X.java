package domain;

public class X {

    public static X instance;

    private X(){

    }

    public static X getInstance() {

        if(instance == null){
            instance = new X();
        }

        return instance;
    }

}

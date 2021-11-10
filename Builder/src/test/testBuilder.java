package test;

import domain.Auto;
import domain.AutoBuilderNuevo;
import domain.AutoBuilderViejo;

public class testBuilder {

    public static void main(String[] args) {

        Auto autoNormal = new Auto();

        autoNormal.setMarca("Ferrari");
        autoNormal.setMatricula(1234);
        System.out.println(autoNormal.toString());

        AutoBuilderViejo builderViejo = new AutoBuilderViejo();
        builderViejo.addModelo("Ferrari");
        builderViejo.addMatricula(1234);
        Auto autoViejo = builderViejo.build();
        System.out.println(autoViejo.toString());

        Auto autoNuevo = new AutoBuilderNuevo().addMatricula(1234).addMarca("Ferrari").build();
        System.out.println(autoNuevo.toString());


    }

}

package test;

import domain.X;

public class testSingleton {

    public static void main(String[] args) {

        X x = X.getInstance();
        X x2 = X.getInstance();

        System.out.println(x);
        System.out.println(x2);

    }

}


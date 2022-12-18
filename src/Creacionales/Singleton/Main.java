package Creacionales.Singleton;

import Creacionales.Singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.setContador(15);
        System.out.println(singleton.getContador());
        System.out.println(singleton);

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setContador(10);
        System.out.println(singleton2.getContador());
        System.out.println(singleton2);
    }
}


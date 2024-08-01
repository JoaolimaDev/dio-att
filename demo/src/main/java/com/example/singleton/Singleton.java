package com.example.singleton;

public class Singleton {

    public Singleton() {
        super();
    }

    private static class SingletonHelper {
        private static final Singleton instancia = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.instancia;
    }
}

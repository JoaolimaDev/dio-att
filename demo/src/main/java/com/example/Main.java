package com.example;

import com.example.singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        System.out.println("Singlenton instanciado : " + singleton);
        
    }
}
package org.example;

public class Singleton {
    private String name;
    private static Singleton instance;

    private Singleton(String name) {
        this.name = name;
    }

    public static Singleton getInstance() {
        if (instance == null) instance = new Singleton("Depree");
        return instance;
    }
}

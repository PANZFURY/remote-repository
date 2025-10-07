package org.example;

public class B extends A{
    private String name;
    private static String str = "";

    public B(String name) {
        this.name = name;
    }

    static class D {
        public void method() {
            str = "";
        }
    }

}

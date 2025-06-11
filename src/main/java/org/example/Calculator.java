package org.example;

public class Calculator {

    public Integer dodaj(Integer a, Integer b) {
        return a + b;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing...");
    }
}

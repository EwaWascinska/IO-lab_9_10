package org.example;

public class Calculator {

    private final int baseValue;

    public Calculator(final int baseValue) {
        this.baseValue = baseValue;
    }

    public int dodaj(final int a, final int b) {
        return baseValue + a + b;
    }
}

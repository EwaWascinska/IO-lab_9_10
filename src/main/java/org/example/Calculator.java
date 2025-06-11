package org.example;

public class Calculator {

    private final int baseValue;

    public Calculator(final int baseValue) {
        this.baseValue = baseValue;
    }

    public int dodaj(final int number1, final int number2) {
        return baseValue + number1 + number2;
    }
}

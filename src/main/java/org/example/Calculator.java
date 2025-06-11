package org.example;

public class Calculator {

    private final int baseValue;

    // Konstruktor z parametrem, który nadaje sens konstruktorowi
    public Calculator(int baseValue) {
        this.baseValue = baseValue;
    }

    public int dodaj(final int number1, final int number2) {
        return baseValue + number1 + number2;
    }
}

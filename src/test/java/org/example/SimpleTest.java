package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleTest {

    @Test
    public void test() {
        Calculator calc = new Calculator(0);
        assertEquals(3, calc.dodaj(1, 2));
    }

    @Test
    public void test2() {
        Calculator calc = new Calculator(0);
        assertEquals(11, calc.dodaj(1, 10));
    }

    @Test
    public void test3() {
        Calculator calc = new Calculator(0);
        assertEquals(-35, calc.dodaj(-45, 10));
    }
}

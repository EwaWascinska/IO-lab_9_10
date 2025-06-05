package org.example;
import org.junit.Test;

public class SimpleTest{

    @Test
    public void test()
    {
        Calculator calc = new Calculator();
        assert calc.dodaj(1, 2) == 3;
    }

    @Test
    public void test2()
    {
        Calculator calc = new Calculator();
        assert calc.dodaj(1, 10) == 11;
    }

    @Test
    public void test3()
    {
        Calculator calc = new Calculator();
        assert calc.dodaj(-45, 10) == -35;
    }



}
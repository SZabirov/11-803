package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc;

    //выполняется перед каждым тестом
    @Before
    public void setUp() {
        this.calc = new Calculator();
    }

    @Test
    public void testFactOn7() {

        int expected = 5040;
        int actual = calc.fact(7);

        assertEquals(expected, actual);
    }

    @Test
    public void testFactOn1() {
        Calculator calc = new Calculator();

        int expected = 1;
        int actual = calc.fact(1);

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactOnNegative() {
        calc.fact(-5);
    }

    @Test
    public void testIsSquareOn16() {
        assertTrue(calc.isSquare(16));
    }

    @Test
    public void testIsSquareOn42() {
        assertFalse(calc.isSquare(42));
    }
}

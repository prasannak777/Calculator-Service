package com.calculator.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorServiceImplTest {
    CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

    @Test
    void testAdd() {
        double result = calculatorServiceImpl.add(5d, 1d);
        Assertions.assertEquals(6d, result);
    }

    @Test
    void testSubtract() {
        double result = calculatorServiceImpl.subtract(234d, 34d);
        Assertions.assertEquals(200, result);
    }

    @Test
    void testMultiply() {
        double result = calculatorServiceImpl.multiply(32d, 4d);
        Assertions.assertEquals(128d, result);
    }

    @Test
    void testDivide() {
        double result = calculatorServiceImpl.divide(100d, 10d);
        Assertions.assertEquals(10d, result);
    }

    @Test
    void testDivideByZeroThrowsException() {
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            calculatorServiceImpl.divide(0d, 0d);
        });

        Assertions.assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
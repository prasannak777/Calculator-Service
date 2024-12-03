package com.calculator.controller;

import com.calculator.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class CalculatorControllerTest {
    @Mock
    CalculatorService calculatorService;
    @InjectMocks
    CalculatorController calculatorController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAdd() {
        when(calculatorService.add(anyDouble(), anyDouble())).thenReturn(0d);

        double result = calculatorController.add(0d, 0d);
        Assertions.assertEquals(0d, result);
    }

    @Test
    void testSubtract() {
        when(calculatorService.subtract(anyDouble(), anyDouble())).thenReturn(0d);

        double result = calculatorController.subtract(0d, 0d);
        Assertions.assertEquals(0d, result);
    }

    @Test
    void testMultiply() {
        when(calculatorService.multiply(anyDouble(), anyDouble())).thenReturn(0d);

        double result = calculatorController.multiply(0d, 0d);
        Assertions.assertEquals(0d, result);
    }

    @Test
    void testDivide() {
        when(calculatorService.divide(anyDouble(), anyDouble())).thenReturn(0d);

        double result = calculatorController.divide(0d, 0d);
        Assertions.assertEquals(0d, result);
    }
}

//Generated with love by TestMe :) Please raise issues & feature requests at: https://weirddev.com/forum#!/testme
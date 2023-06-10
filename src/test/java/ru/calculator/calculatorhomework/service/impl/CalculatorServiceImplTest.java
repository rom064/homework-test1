package ru.calculator.calculatorhomework.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.calculator.calculatorhomework.service.CalculatorService;

public class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void calculatorSum() {
        int num1 = 10;
        int num2 = 20;
        int expectedSum = num1 + num2;
        Integer actualSum =  calculatorService.add(num1, num2);

        Assertions.assertEquals(expectedSum,actualSum);
    }

    @Test
    public void calculatorSubtract() {
        int num1 = 10;
        int num2 = 20;
        int expectedSubtract = num1 - num2;
        Integer actualSubtract = calculatorService.subtract(num1, num2);

        Assertions.assertEquals(expectedSubtract, actualSubtract);
    }

    @Test
    public void calculatorMyltiply() {
        int num1 = 10;
        int num2 = 20;
        int expectedMyltiply = num1 * num2;
        Integer actualMyltiply = calculatorService.myltiply(num1, num2);

        Assertions.assertEquals(expectedMyltiply, actualMyltiply);
    }

    @Test
    public void calculatorDivide() {
        int num1 = 20;
        int num2 = 10;
        int expectedDivide = num1 / num2;
        Double actualDivide = calculatorService.divide(num1, num2);

        Assertions.assertEquals(expectedDivide, actualDivide);
    }

    @Test
    public void calculatorDivideIsZero() {
        int num1 = 10;
        int num2 = 0;
        Assertions.assertThrows(IllegalArgumentException.class,()->
            calculatorService.divide(num1, num2));

    }


}

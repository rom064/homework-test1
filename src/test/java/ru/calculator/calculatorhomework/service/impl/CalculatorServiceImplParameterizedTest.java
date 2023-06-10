package ru.calculator.calculatorhomework.service.impl;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.calculator.calculatorhomework.service.CalculatorService;

import java.util.stream.Stream;

public class CalculatorServiceImplParameterizedTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    private static Stream<Arguments> argumentCalculator() {
        return Stream.of(
                Arguments.of(5, 5),
                Arguments.of(50, -10),
                Arguments.of(-100, 150),
                Arguments.of(0, 0),
                Arguments.of(5, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentCalculator")
    public void calculatorSum(int num1, int num2) {
        Integer actualSum = calculatorService.add(num1, num2);
        Integer expectedSum = num1 + num2;
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @ParameterizedTest
    @MethodSource("argumentCalculator")
    public void calculatorSubtract(int num1, int num2) {
        int expectedSubtract = num1 - num2;
        Integer actualSubtract = calculatorService.subtract(num1, num2);

        Assertions.assertEquals(expectedSubtract, actualSubtract);
    }

    @ParameterizedTest
    @MethodSource("argumentCalculator")
    public void calculatorMyltiply(int num1, int num2) {
        int expectedMyltiply = num1 * num2;
        Integer actualMyltiply = calculatorService.myltiply(num1, num2);

        Assertions.assertEquals(expectedMyltiply, actualMyltiply);
    }

    @ParameterizedTest
    @MethodSource("argumentCalculator")
    public void calculatorDivide(int num1, int num2) {
        int expectedDivide = num1 / num2;
        Double actualDivide = calculatorService.divide(num1, num2);

        Assertions.assertEquals(expectedDivide, actualDivide);
    }


}

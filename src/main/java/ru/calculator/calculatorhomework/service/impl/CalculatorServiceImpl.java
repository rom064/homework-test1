package ru.calculator.calculatorhomework.service.impl;

import org.springframework.stereotype.Service;
import ru.calculator.calculatorhomework.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    public Integer add(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public Integer subtract(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Integer myltiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public Double divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return (double) num1 / num2;
    }
}

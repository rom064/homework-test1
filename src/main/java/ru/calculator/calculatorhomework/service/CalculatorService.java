package ru.calculator.calculatorhomework.service;


public interface CalculatorService {
    String greeting();
    Integer add(Integer num1, Integer num2);

    Integer subtract(Integer num1, Integer num2);

    Integer myltiply(Integer num1, Integer num2);

    Double divide(Integer num1, Integer num2);
}

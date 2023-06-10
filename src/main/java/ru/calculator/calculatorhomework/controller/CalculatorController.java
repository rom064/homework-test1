package ru.calculator.calculatorhomework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.calculator.calculatorhomework.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;


    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String greeting() {
        return calculatorService.greeting();
    }

    @GetMapping("/plus")
    public String addition(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + "+" + num2 + "=" + calculatorService.add(num1, num2);
    }
    @GetMapping("/minus")
    public String subtraction(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + "-" + num2 + "=" + calculatorService.subtract(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiplication(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + "*" + num2 + "=" + calculatorService.myltiply(num1, num2);
    }
    @GetMapping("/divide")
    public String division(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + "+" + num2 + "=" + calculatorService.divide(num1, num2);
    }
}

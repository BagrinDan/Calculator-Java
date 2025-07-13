package org.example.Calculator.Calculator;

import org.example.Calculator.Input.InputDate;
import org.example.Calculator.Input.Keyboard;
import org.example.Calculator.Interfaces.OperationBehaviour;
import org.example.Calculator.Operations.Addition;
import org.example.Calculator.Operations.Division;
import org.example.Calculator.Operations.Multiplication;
import org.example.Calculator.Operations.Substraction;



public class CalculatorPacket {
    Keyboard keyboard = new Keyboard();
    InputDate date;

    public void runCalculator(){
        date = keyboard.inputUser();

        OperationBehaviour operationBehaviour = getOperationStrategy();

        Calculator calculator = new Calculator(operationBehaviour);

        double result = calculator.calculate(date.firstDigit, date.secondDigit);

        System.out.println("Result: " + result);
    }

    private OperationBehaviour getOperationStrategy() {
        return switch (this.date.operation) {
            case '+' -> new Addition();
            case '-' -> new Substraction();
            case '*' -> new Multiplication();
            case '/' -> new Division();
            default -> throw new IllegalArgumentException("Unknown operation: " + this.date.operation);
        };
    }
}

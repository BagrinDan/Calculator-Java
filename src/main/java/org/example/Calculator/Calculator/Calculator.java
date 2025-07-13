package org.example.Calculator.Calculator;


import org.example.Calculator.Interfaces.OperationBehaviour;

public class Calculator {
    OperationBehaviour operationBehaviour;

    public Calculator(OperationBehaviour operationBehaviour){
        this.operationBehaviour = operationBehaviour;
    }

    public double calculate(double a, double b) {
        return operationBehaviour.executeOperation(a, b);
    }
}

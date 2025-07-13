package org.example.Calculator.Operations;


import org.example.Calculator.Interfaces.OperationBehaviour;

public class Substraction implements OperationBehaviour {
    @Override
    public double executeOperation(double firstDigit, double secondDigit){
        return firstDigit - secondDigit;
    }
}

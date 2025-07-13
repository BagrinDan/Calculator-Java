package org.example.Calculator.Operations;


import org.example.Calculator.Interfaces.OperationBehaviour;

public class Multiplication implements OperationBehaviour {
    @Override
    public double executeOperation(double firstDigit, double secondDigit){
        return firstDigit * secondDigit;
    }
}

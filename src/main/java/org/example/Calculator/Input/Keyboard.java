package org.example.Calculator.Input;

import java.util.Scanner;

public class Keyboard {
    Scanner sc = new Scanner(System.in);

    public InputDate inputUser(){
        System.out.println("Introduce first digit");
        double firstDigit = sc.nextDouble();

        sc.nextLine();

        System.out.println("Introduce operation");
        char operation = sc.nextLine().charAt(0);

        System.out.println("Introduce second digit");
        double secondDigit = sc.nextDouble();

        sc.nextLine();

        return new InputDate(firstDigit, operation, secondDigit) ;
    }
}

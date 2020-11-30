package CalculatorLogic;

import CalculatorInterface.CalculatorInterface;

public class Calculator {
    private final static char ADD = '+';
    private final static char DEDUCT = '-';
    private final static char DIVIDE = '/';
    private final static char MULTIPLY = '*';

    private final CalculatorInterface calculatorInterface;

    public Calculator(CalculatorInterface calculatorInterface) {
        this.calculatorInterface = calculatorInterface;
    }


    public void calculate(Formula formula) {
        switch (formula.getSign()) {
            case ADD -> {
                formula.setResult(calculatorInterface.combine(formula.getX(), formula.getY()));
                System.out.println("Result of calculation is: " + formula.getResult());
            }
            case DEDUCT -> {
                formula.setResult(calculatorInterface.deduct(formula.getX(), formula.getY()));
                System.out.println("Result of calculation is: " + formula.getResult());
            }
            case MULTIPLY -> {
                formula.setResult(calculatorInterface.multiply(formula.getX(), formula.getY()));
                System.out.println("Result of calculation is: " + formula.getResult());
            }
            case DIVIDE -> {
                formula.setResult(calculatorInterface.divide(formula.getX(), formula.getY()));
                System.out.println("Result of calculation is: " + formula.getResult());
            }
            default -> System.out.println("You have entered incorrect characters.\n" +
                    "Please enter one of the following characters: '+', '-', '*', '/' ");
        }
    }

}
package CalculatorLogic;

import CalculatorInterface.ReaderInterface;

import java.util.Scanner;

public class ConsoleReader implements ReaderInterface {
    Scanner keyboard = new Scanner(System.in);

    @Override
    public boolean hasNext() {
        System.out.println("Would you like to calculate again\n" + "y/n");
        return keyboard.next().equals("y");
    }

    @Override
    public Formula readNext() {
        Formula formula = new Formula();
        System.out.println("The calculation has been started");
        System.out.println("Please enter your 1-st number:");
        formula.setX(keyboard.nextDouble());
        System.out.println("Please enter one of the following characters: '+', '-', '*', '/'");
        formula.setSign(keyboard.next().charAt(0));
        System.out.println("Please enter your 2-nd number: ");
        formula.setY(keyboard.nextDouble());
        return formula;
    }

}

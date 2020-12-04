package CalculatorLogic;

import CalculatorInterface.ReaderInterface;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
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

    public static double getInput(Scanner keyboard)
    {
        boolean invalidEntry = true;
        double input = 0;

        while (invalidEntry)
        {
            try {
                System.out.println("Please enter number");
                input = keyboard.nextDouble();
                invalidEntry = false;
            }catch (InputMismatchException e){
                System.out.println("Number is invalid. Please enter a valid number");
                keyboard.next();
            }
        }
        return input;

    }

    public int readHistory(Scanner keyboard)
    {
        boolean entry = true;
        int read = 0;

        while (entry){
            try {
                System.out.println("Select formula for calculation");
                read = keyboard.nextInt();
                entry = false;
            }catch (InputMismatchException exception){
                System.out.println("Invalid. Please try again");
                keyboard.nextInt();
            }
        }
        return read;
    }

    public int printMenu()
    {
        ConsoleReader consoleReader = new ConsoleReader();
        Calculator calculator = new Calculator(new LocalCalculator());
        List<Formula> formulaList = new ArrayList<>();

        int option = 0;
        while (consoleReader.hasNext()){
            System.out.println("Select option from the menu");
            System.out.println("1. Calculate with the new operation");
            System.out.println("2. Print history");
            System.out.println("3. Recalculate past formula");
            option = keyboard.nextInt();

            switch (option){

                case 1:
                    Formula formula = consoleReader.readNext();
                    System.out.println("Result is: " + calculator.calculate(formula));
                    formulaList.add(formula);
                    break;

                case 2:
                    System.out.println("History operations");
                    for (int i = 0; i < formulaList.size(); i++){
                        Formula formula1 = formulaList.get(i);
                        System.out.println(i + " " + formula1.getX() + " " + formula1.getSign() + " " + formula1.getY() + " = " +calculator.calculate(formula1));
                    }
                    break;

                case 3:
                    int formula2 = consoleReader.readHistory(keyboard);
                    Formula formula3 = formulaList.remove(formula2);
                    System.out.println(formula3.getX() + " " + formula3.getSign() + " " + formula3.getY() + " = " + calculator.calculate(formula3));
                    formulaList.add(formula3);

                default:
                    System.out.println("Invalid entry. Please try again");
                    keyboard.nextInt();
            }
        }
        return option;
    }
}

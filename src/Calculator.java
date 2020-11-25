import java.util.Scanner;

public class Calculator
{
    final static String ADD = "+";
    final static String MINUS = "-";
    final static String DIVIDE = "/";
    final static String MULTIPLY = "*";
    static String userChoise;

    public static void main(String[] args)
    {
        double number1, number2;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please select one of the arithmetic operations: +, -, /, * ");
        userChoise = keyboard.next();

        if (userChoise.equals(ADD))
        {
            System.out.print("Please enter your first number: ");
            number1 = keyboard.nextDouble();

            System.out.print("Please enter your second number: ");
            number2 = keyboard.nextDouble();

            System.out.print("Your result is: " + (number1 + number2));
        }

        if (userChoise.equals(MINUS))
        {
            System.out.print("Please enter your first number: ");
            number1 = keyboard.nextDouble();

            System.out.print("Please enter your second number: ");
            number2 = keyboard.nextDouble();

            System.out.print("Your result is: " + (number1 - number2));
        }

        if (userChoise.equals(DIVIDE))
        {
            System.out.print("Please enter your first number: ");
            number1 = keyboard.nextDouble();

            System.out.print("Please enter your second number: ");
            number2 = keyboard.nextDouble();

            System.out.print("Your result is: " + (number1 / number2));
        }

        if (userChoise.equals(MULTIPLY))
        {
            System.out.print("Please enter your first number: ");
            number1 = keyboard.nextDouble();

            System.out.print("Please enter your second number: ");
            number2 = keyboard.nextDouble();

            System.out.print("Your result is: " + (number1 * number2));
        }
    }
}


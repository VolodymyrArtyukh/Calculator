import java.util.Scanner;

public class Calculator
{
        public static void main(String[] args)
        {

            String userChoise, add = "+", minus = "-", divide = "/", multiply = "*";
            double number1, number2;

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Please select one of the arithmetic operations: +, -, /, * ");
            userChoise = keyboard.next();

            if (userChoise.equals(add))
            {
                System.out.print("Please enter your first number: ");
                number1 = keyboard.nextDouble();

                System.out.print("Please enter your second number: ");
                number2 = keyboard.nextDouble();

                System.out.print("Your result is: " + (number1 + number2));
            }

            if (userChoise.equals(minus))
            {
                System.out.print("Please enter your first number: ");
                number1 = keyboard.nextDouble();

                System.out.print("Please enter your second number: ");
                number2 = keyboard.nextDouble();

                System.out.print("Your result is: " + (number1 - number2));
            }

            if (userChoise.equals(divide))
            {
                System.out.print("Please enter your first number: ");
                number1 = keyboard.nextDouble();

                System.out.print("Please enter your second number: ");
                number2 = keyboard.nextDouble();

                System.out.print("Your result is: " + (number1 / number2));
            }

            if (userChoise.equals(multiply))
            {
                System.out.print("Please enter your first number: ");
                number1 = keyboard.nextDouble();

                System.out.print("Please enter your second number: ");
                number2 = keyboard.nextDouble();

                System.out.print("Your result is: " + (number1 * number2));
            }
        }
}


package CalculatorLogic;

public class CalculatorMain {

   public static void main(String[] args) {
     ConsoleReader consoleReader = new ConsoleReader();
     Calculator calculator = new Calculator(new LocalCalculator());
     do {
         calculator.calculate(consoleReader.readNext());
         consoleReader.readHistory(consoleReader.keyboard);
         consoleReader.printMenu();
     }
     while (consoleReader.hasNext());
   }

}

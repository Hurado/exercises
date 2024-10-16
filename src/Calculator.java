import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    public void start() {
        System.out.println("Welcome to the Calculator!");
        System.out.println("Give 2 numbers and the operation to be applied on those numbers.");
        System.out.println("There are 4 types of operations to choose from: + (add), - (subtract), * (multiply), / (divide).");
        System.out.println("The calculator will work until you type 'exit' or 'quit' when program will ask you about type of operation.");

        while(true) {
            int num1 = getNumberFromUser("Enter first number: ");
            int num2 = getNumberFromUser("Enter second number: ");
            String operation = getOperationFromUser();

            if (isExitCommand(operation)) {
                break;
            }

            int result;
            switch(operation) {
                case "+":
                    result = add(num1, num2);
                    break;
                case "-":
                    result = subtract(num1, num2);
                    break;
                case "*":
                    result = multiply(num1, num2);
                    break;
                case "/":
                    if(num2==0) {
                        System.out.println("Error: Cannot divide by zero!");
                        continue;
                    }
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation! Please choose +, -, * or /.");
                    continue;
            }
            System.out.println("Result: " + result);

        }
    }

    private int getNumberFromUser(String prompt) {

        while (true) {
            System.out.println(prompt);
            String userInput = scanner.nextLine();
            if (isExitCommand(userInput)) {
                return -1;
            }

            try {
                int number = Integer.parseInt(userInput);
                if (isMoreThan0(number)) {
                    return number;
                } else {
                    System.out.println("Number must be greater than 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!. Please enter a valid number greater than 0.");
            }
        }
        }
        private String getOperationFromUser () {
            System.out.println("Enter operation: (+, -, *, /): ");
            return scanner.nextLine();
        }

        private boolean isMoreThan0 (int number){
            return number != 0;
        }

        private boolean isExitCommand (String input){
            return input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("quit");
        }
        private int add ( int a, int b){
            return a + b;
        }
        private int subtract ( int a, int b){
            return a - b;
        }
        private int divide ( int a, int b){
            return a / b;
        }
        private int multiply ( int a, int b){
            return a * b;
    }
}
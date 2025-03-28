import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
       
        // Prompt the user for input
        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();
       
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = scanner.next();
       
        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();
       
        // Perform calculation based on operator
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
            	break;
            case "-":
                System.out.println("Result: " + (first - second));
            	break;
            case "*":
                System.out.println("Result: " + (first * second));
            	break;
            case "/":
            	if (second != 0) {
                    System.out.println("Result: " + (first / second));
            	} else {
                    System.out.println("Error: Division by zero is not allowed.");
            	}
            	break;
            default:
                System.out.println("Invalid Operator.");
        }
       
        // Close the scanner
        scanner.close();
	}
}

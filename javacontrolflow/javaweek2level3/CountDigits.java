import java.util.Scanner;
 
public class CountDigits {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
       
        // Get an integer input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
       
        // Initialize count variable to 0
        int count = 0;
       
        // Use while loop to count digits
        int originalNumber = number;
        while (originalNumber != 0) {
            originalNumber /= 10; // Remove last digit
            count++; // Increase count
        }
       
        // Display the count
        System.out.println("The number of digits in " + number + " is: " + count);
       
        // Close the scanner
        scanner.close();
	}

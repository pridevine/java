import java.util.Scanner;
 
public class Harshad{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
       
        // Close the scanner
        scanner.close();
       
        // Calculate sum of digits
        int sum = 0;
        int temp = number;
       
        while (temp > 0) {
            sum += temp % 10; // Extract the last digit and add to sum
            temp /= 10; // Remove the last digit
        }
       
        // Check divisibility
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }
	}
}

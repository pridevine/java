import java.util.Scanner;
 
public class AbundantNumber{
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
       
        // Prompt the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
       
        // Variable to store the sum of divisors
        int sum = 0;
       
        // Find all divisors of the number and sum them
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
            	sum += i;
            }
        }
       
        // Check if the sum of divisors is greater than the number itself
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }
       
	}
}
 

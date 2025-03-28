import java.util.Scanner;
public class RocketLaunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a variable counter to take user inputted value for the countdown
        System.out.print("Enter the countdown start value: ");
        int n = scanner.nextInt();

        // Use the while loop to check if the counter is greater than or equal to 1
        while (n >= 1) {
            // Print the value of the counter
            System.out.println(n);

            // Decrement the counter
            n--;
        }

        // Print launch message
        System.out.println("Liftoff!");
        
        scanner.close();
    }
}
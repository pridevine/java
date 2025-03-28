import java.util.Scanner;
public class RocketLaunchF{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a variable counter to take user inputted value for the countdown
        System.out.print("Enter the countdown start value: ");
        int n = scanner.nextInt();

        // Use a for loop to count down from the counter to 1
        for (int i = n; i >= 1; i--) {
            // Print the value of the counter
            System.out.println(i);
        }

        // Print launch message
        System.out.println("Liftoff!");
        
        scanner.close();
    }
}
import java.util.Scanner;
public class KmToMilesInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Q8: Convert Kilometers to Miles (User Input)");
		//taking user input
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
		
		//converting values
        double miles = kilometers * 0.621371;
		
		//displaying output
        System.out.println("The total miles is " + miles + " mile for the given " + kilometers + " km");
        scanner.close();
	}
}
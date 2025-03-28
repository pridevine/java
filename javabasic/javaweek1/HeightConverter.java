import java.util.Scanner;
public class HeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Q10: Convert Height in cm to Feet and Inches");
		//asking user for height
        System.out.print("Enter your height in centimeters: ");
        double cm = scanner.nextDouble();
		
		//converting into cm and feet and remaining inches
        double inches = cm / 2.54;
        int feet = (int) (inches / 12);
        double remainingInches = inches % 12;
		
		//displaying output
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + remainingInches);
        scanner.close();
	}
}

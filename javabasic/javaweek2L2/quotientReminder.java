import java.util.Scanner;
public class quotientReminder{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		//taking number from user
		System.out.print("Enter first number");
		double number1 = scanner.nextInt();
		
		System.out.print("Enter second number");
		double number2 = scanner.nextInt();
		
		//performing operations
		double quotient = number1/number2;
		double reminder = number1%number2;
		
		//displaying output
		System.out.println("The Quotient is: " + quotient + " and Reminder is: " + reminder + " of two number: "+ number1+ " and " + number2);
		scanner.close();
	}
}
import java.util.Scanner;
public class SwapNumbers{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		//input number1
		System.out.print("Enter number1: ");
		double number1 = scanner.nextInt();
		//input number2
		System.out.print("Enter number2: ");
		double number2 = scanner.nextInt();
		
		//swaping using temproray variable
		double variable1 = number1;
		number1 = number2;
		number2 = variable1;
		
		//dispalying swaped numbers
		System.out.println("The swapped numbers are " + number1 +  " and " + number2);
		scanner.close();
	}
}	
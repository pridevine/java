import java.util.Scanner;
public class calculator{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		//input of first number
		System.out.print("Enter first number"); 
		double number1 = scanner.nextInt();
		
		//input of second number
		System.out.print("Enter second number");
        double number2 = scanner.nextInt();
		
		//performing opertaions
		double addition = number1 + number2;
		double subtraction =number1 - number2;
		double multiplication =number1 * number2;
		double division =number1 / number2;
		
		//displaying output
		 System.out.println(" The addition, subtraction, multiplication and division value of 2 numbers: " + number1 + " and " + number2 + " is " + addition + " , " + subtraction + " , " + multiplication + " , " + " and " + division);
		 
		scanner.close();
		}
	}
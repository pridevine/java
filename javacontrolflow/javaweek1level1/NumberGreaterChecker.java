import java.util.Scanner;
public class NumberGreaterChecker{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		//taking input
		System.out.println("Enter 1st number");
		int num1= scanner.nextInt();
		
		System.out.println("Enter 2nd number");
		int num2= scanner.nextInt();
		
		System.out.println("Enter 3rd number");
		int num3= scanner.nextInt();
		
		System.out.println("Is the first number the greatest? ____");
		System.out.println("Is the second number the greatest? ____");
		System.out.println("Is the third number the greatest? ____");
		
		//checking if first number is greatest of all three numbers
		if(num1>num2 && num1>num3){
			System.out.println("first is greatest");
		}
		else if(num2>num1 && num2>num3){
			System.out.println("second is greatest");
		}
		else{
			System.out.println("third is greatest");
		}
	}
}
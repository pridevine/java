import java.util.Scanner;
public class NumberSmallerChecker{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		//taking input
		System.out.println("Enter 1st number");
		int num1= scanner.nextInt();
		
		System.out.println("Enter 2nd number");
		int num2= scanner.nextInt();
		
		System.out.println("Enter 3rd number");
		int num3= scanner.nextInt();
		
		System.out.println("Is the first number the smallest? ____");
		
		//checking if first number is smallest of all three numbers
		if(num1<num2 && num1<num3){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}
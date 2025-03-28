import java.util.Scanner;
public class NumberChecker{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		//taking input
		System.out.println("Enter number");
		int num= scanner.nextInt();

		//checking number 
		if(num>0){
			System.out.println("print positive.");
		}
		else if(num<0){
			System.out.println("print negative.");
		}
		else{
			System.out.println("print zero.");
		}
	}
}
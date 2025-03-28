import java.util.Scanner;
public class NaturalNumber{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		//taking input
		System.out.println("Enter number");
		int num = scanner.nextInt();

		
		//checking if number is natural number
		if(num>0){
			//calculating sum of n Natural Number
			int sum = num * (num +1) / 2 ;
			
			System.out.println("The sum of "+num+ " natural numbers is " +sum);
		}
		else{
			System.out.println("The number "+num+ " is not a natural number");
		}
	}
}
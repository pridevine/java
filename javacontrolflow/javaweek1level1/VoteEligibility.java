import java.util.Scanner;
public class VoteEligibility{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		//taking input
		System.out.println("Enter age");
		int age = scanner.nextInt();

		//checking age
		if(age>=18){
			
			System.out.println("The person's age is "+age+" and can vote.");
		}
		else{
			System.out.println("The person's age is "+age+" and cannot vote.");
		}
	}
}
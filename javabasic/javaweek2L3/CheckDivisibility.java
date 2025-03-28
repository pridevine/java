import java.util.Scanner;
public class CheckDivisibility{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		//taking input from user
		int num = scanner.nextInt();
		
		//checking divisibility by 5
		if( num%5==0){
			System.out.println("Number " + num + " is divisble by 5");
		}
		else{
			System.out.println("Number " + num + " is not divisble by 5");
		}
		
	}
}

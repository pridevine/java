import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// input principle value rate and time
		System.out.print("Enter the value for Principal,Rate and time in years: ");
		double Principal= scanner.nextInt();
		double Rate=scanner.nextInt();
		double Time=scanner.nextInt();
		
		//calculating simple interest
		double simpleinterest= (Principal*Rate*Time)/100;
		
		//displaying output
		System.out.println("The Simple Interest is " + simpleinterest +" for Principal "+ Principal+ " , Rate of Interest " + Rate+ " and Time " + Time);
		scanner.close();
	}
}
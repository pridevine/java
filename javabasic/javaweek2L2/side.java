import java.util.Scanner;
public class side{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		//input perimeter
		System.out.print("Enter perimeter");
		double perimeter = scanner.nextInt();
		
		//calculating side
		double side = perimeter / 4;
		
		// displaying output
		System.out.println("The length of the side is: " + side+ " whose perimeter is: " + perimeter);
		scanner.close();
	}
}
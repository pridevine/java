import java.util.Scanner;
public class ChocolateDivision {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//taking input for no of chocolates
		System.out.print("Enter the number of chocolates: "); 
		int numberOfChocolates = scanner.nextInt();
		
		//taking input for no of children
		System.out.print("Enter the number of children: "); 
		int numberOfChildren = scanner.nextInt();
		
		// Calculationg the number of chocolates each child gets
		int chocolatesPerChild = numberOfChocolates / numberOfChildren;

		//Calculateing the number of remaining chocolates		
		int remainingChocolates = numberOfChocolates % numberOfChildren; 
		
		//displaying output
		System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
		scanner.close();
	}
}

import java.util.Scanner;
public class IntOperation{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		// inputing variables from user
		System.out.print("Enter value for a: ");
		int a = scanner.nextInt();
		
		System.out.print("Enter value for b: ");
		int b = scanner.nextInt();
		
		System.out.print("Enter value for c: ");
		int c = scanner.nextInt();
		
		//performing operations
		int operation1 = a + b *c;
		int operation2 = a * b + c;
		int operation3 = c + a / b;
		int operation4 = a % b + c;
		
		//displaying result of the operations
		System.out.println("The results of Int Operations are: " + operation1 + ", " +operation2+ ", "+ operation3 + " and "+ operation4);
		scanner.close();
	}
}
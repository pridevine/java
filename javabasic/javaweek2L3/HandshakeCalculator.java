import java.util.Scanner;
public class HandshakeCalculator {
 		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input for the number of students
		System.out.print("Enter the number of students: "); 
		int numberOfStudents = scanner.nextInt();
		
		 // Calculating the maximum number of handshakes using the formula
		int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		
		//displaying max number of handshakes
		System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + maxHandshakes);
		scanner.close();
	}
}
import java.util.Scanner;
 
public class LeapYearCheckeri{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();
       
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            	System.out.println("(Using logical operators) " + year + " is a Leap Year.");
            } else {
            	System.out.println("(Using logical operators) " + year + " is not a Leap Year.");
            }
        }
	}

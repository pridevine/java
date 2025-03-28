import java.util.Scanner;
 
public class LeapYearChecker{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();
       
        if (year < 1582) {
            System.out.println("The program only works for years 1582 and above.");
        } else {
           
            if (year % 4 == 0) {
            	if (year % 100 == 0) {
                	if (year % 400 == 0) {
                    	System.out.println(year + " is a Leap Year.");
                	} else {
                    	System.out.println(year + " is not a Leap Year.");
                	}
            	} else {
                	System.out.println(year + " is a Leap Year.");
            	}
            } else {
            	System.out.println(year + " is not a Leap Year.");
            }
           
          
        }
      
	}
}
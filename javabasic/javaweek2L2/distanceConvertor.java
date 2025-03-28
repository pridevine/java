import java.util.Scanner;
public class distanceConvertor{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		//input distance in feet
		System.out.print("Enter distance in feet");
		double distanceInFeet = scanner.nextInt();
		
		//convert the distance in yards
		double distanceInYard = distanceInFeet / 3;
		
		//convert the distance in miles
		double distanceInMiles = distanceInYard / 1760;
		
		//displaying output
		System.out.println( "Distance in yards is " + distanceInYard + "and distance in miles is " + distanceInMiles);
		scanner.close();
	}
}
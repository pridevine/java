import java.util.Scanner;
public class Athlete{
	public static void main(String[]args){
		Scanner scanner = new Scanner (System.in);
		
		//input sides
		System.out.print("Enter the distance of side 1, side 2 and side 3 in meters ");
		double side1=scanner.nextInt();
		double side2=scanner.nextInt();
		double side3=scanner.nextInt();
		
		//calculating perimeter and rounds
		double perimeter = side1+side2+side3;
		double rounds=5000/perimeter;
		
		//displaying rounds taken
		System.out.println("The total number of rounds the athlete will run is " +rounds + "to complete 5 km");
		scanner.close();
		}
	}
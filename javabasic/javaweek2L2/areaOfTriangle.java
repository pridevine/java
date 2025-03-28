import java.util.Scanner;
public class areaOfTriangle{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		//input base
		System.out.print("Enter base in cm"); 
		double baseCm = scanner.nextInt();
		
		//input height
		System.out.print("Enter height in cm");
        double heightCm = scanner.nextInt();
		
		//converting into inches
		double baseInch = baseCm * 0.393701;
		double heightInch = heightCm * 0.393701;
		
		//calculate area
		double areaCm = 0.5 * (heightCm  * baseCm);
		double areaInch= 0.5 * (heightInch * baseInch);
		
		//displaying output
		System.out.println("Area of triangle in cm is: " + areaCm + " while in inches is: "+ areaInch);
		scanner.close();
		}
	}
		
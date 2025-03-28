import java.util.Scanner;
public class SpringSeason{
 public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n1, n2;
		System.out.println("Enter The Date : ");
		n2 = input.nextInt();
		System.out.println("Enter  The Month Number : ");
		n1 = input.nextInt();
		if( (n1 == 3 && n2 >= 20 && n2 <= 31) ||(n1 == 4 && n2 >= 1 && n2 <= 30) ||(n1 == 5 && n2 >= 1 && n2 <= 31) ||(n1 == 6 && n2 >= 1 && n2 <= 20) ){
		System.out.println("Its a Spring Season");
		}
		else{
			System.out.println("Not a Spring Season");
		}
	}
}

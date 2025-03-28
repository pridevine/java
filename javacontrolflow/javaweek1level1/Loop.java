import java.util.*;
public class Loop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double n = 1;
		double sum = 0;
		while(n > 0){
			System.out.println("Enter Number: ");
			n = input.nextDouble();
			sum += n;
		}
		System.out.println(sum);
	}
}

import java.util.Scanner;
public class SumF{
 public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n, sum;
		System.out.println("Enter Number: ");
		n = input.nextInt();
 
		if( n > 0 ){
			sum = n * (n + 1) / 2;
			System.out.println("The sum of " + n + " natural numbers using normal is " + sum); 
		}
		else{
			System.out.println("The number " + n + " is not a natural number"); 
		}
		sum=0;
		for(int i = 1; i <= n; i++){
			sum = n*(n+1)/2;
		}
		System.out.println("The sum of " + n + " natural numbers using normal is " + sum);
	}
}

import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
                    int var = 0;
				for(int i = 2; i <= n / 2 ; i++){
                  	if( n % i == 0){
						var = 1;
						break;
                  	}
                  	else{
						var = 0;
                    }
                }
                if(var == 0){
                  	System.out.print("The number is prime");
				} else{
					System.out.print("The number is not prime ");
           	}
        }
	}
 

import java.util.Scanner;
public class SumUntilNegative{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        while (true) { // Infinite loop
            System.out.print("Enter a number (0 or negative to stop): ");
            int num = scanner.nextInt();
            
            if (num <= 0) { 
                break;
            }
            
            sum += num; 
        }
        
        System.out.println("Sum of entered numbers: " + sum);
        //scanner.close();
    }
}

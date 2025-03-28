import java.util.Scanner;
public class While{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i;
        System.out.println("Enter Number: ");
        n = input.nextInt();
        
        i = n; // Initialize i
        while (i > 0) { // Condition
            System.out.println(i);
            i--; // Decrement
        }
    }
}

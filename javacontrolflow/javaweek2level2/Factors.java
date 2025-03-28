import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter Number: ");
        n = input.nextInt();
        if (n > 0) {
            System.out.println("Factors of " + n + ":");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("The number entered is not positive.");
        }
        input.close();
    }
}
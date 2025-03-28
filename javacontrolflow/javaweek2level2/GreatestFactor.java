import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int great = 0;
        System.out.println("Enter Number: ");
        n = input.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n - 1; i++) {
                if (n % i == 0) {
                    if (i > great) {
                        great = i;
                    }
                }
            }
            System.out.println("Greatest Factor of " + n + " is " + great);
        } else {
            System.out.println("The number entered is not positive.");
        }

        input.close();
    }
}
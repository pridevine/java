import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter Number: ");
        n = input.nextInt();
        if (n > 0) {
            System.out.println("Even Numbers:");
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
            System.out.println("Odd Numbers:");
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Not a natural Number");
        }
        input.close();
    }
}
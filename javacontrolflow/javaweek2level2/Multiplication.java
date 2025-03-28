imimport java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter Number: ");
        n = input.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(n * i);
        }

        input.close();
    }
}
import java.util.Scanner;
public class Height {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4, n5, n6;

        System.out.println("Enter Amar's age: ");
        n1 = input.nextInt();
        System.out.println("Enter Amar's height: ");
        n4 = input.nextInt();

        System.out.println("Enter Akbar's age: ");
        n2 = input.nextInt();
        System.out.println("Enter Akbar's height: ");
        n5 = input.nextInt();

        System.out.println("Enter Anthony's age: ");
        n3 = input.nextInt();
        System.out.println("Enter Anthony's height: ");
        n6 = input.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println("Amar is youngest");
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("Akbar is youngest");
        } else {
            System.out.println("Anthony is youngest");
        }

        if (n4 > n5 && n4 > n6) {
            System.out.println("Amar is tallest");
        } else if (n5 > n4 && n5 > n6) {
            System.out.println("Akbar is tallest");
        } else {
            System.out.println("Anthony is tallest");
        }

        input.close();
    }
}
import java.util.Scanner;
class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, exponent;
        System.out.println("Enter Number: ");
        base = input.nextInt();
        System.out.println("Enter Power: ");
        exponent = input.nextInt();

        double result = Math.pow(base, exponent);

        System.out.println("Answer = " + result);

        input.close();
    }
}
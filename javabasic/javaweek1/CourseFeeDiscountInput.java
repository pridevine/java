import java.util.Scanner;
public class CourseFeeDiscountInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Q9: Course Fee Discount (User Input)");
		
		//asking user input
        System.out.print("Enter the course fee (INR): ");
        double courseFee = scanner.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercent = scanner.nextDouble();
		
		//calculating discount
        double discountAmount = (discountPercent / 100) * courseFee;
        double finalPrice = courseFee - discountAmount;
		
		//displaying output
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalPrice);
        scanner.close();
	}
}

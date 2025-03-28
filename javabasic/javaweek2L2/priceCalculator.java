import java.util.Scanner;
public class priceCalculator{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		//input unit price and quantity of item
		System.out.print("Enter unit price of the item bought");
		double unitPrice = scanner.nextInt();
		
		System.out.print("Enter quantity of item bought");
		double quantity = scanner.nextInt();
		
		// calculating total price
		double totalPrice = unitPrice * quantity;
		
		// displaying total price
		System.out.println("The total purchase price is INR: " + totalPrice + "if the quantity is: " + quantity + " and unit price is INR: " + unitPrice);
		scanner.close();
	}
}
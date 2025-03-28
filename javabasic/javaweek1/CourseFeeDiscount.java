public class CourseFeeDiscount{
    public static void main(String[] args) {
		//inputing values
        double courseFee = 125000, discountPercent = 10;
		
		//calculating output
        double discountAmount = (discountPercent / 100) * courseFee;
        double finalPrice = courseFee - discountAmount;
		
		//displaying output
        System.out.println("Q6: Course Fee Discount Calculation");
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalPrice);
	}
}

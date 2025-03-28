public class ProfitLossCalculator {
    public static void main(String[] args) {
		//inputing values
        double costPrice = 129, sellingPrice = 191;
        double profit = sellingPrice - costPrice;
		
		//calculating profit percentage
        double profitPercentage = (profit / costPrice) * 100;
		
		//displaying output
        System.out.println("Q4: Profit and Loss Calculation");
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	}
}

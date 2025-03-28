import java.util.Scanner;
 
public class BMI{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight: ");
        double weight = scanner.nextDouble();
       	System.out.print("Enter the height(cm): ");
        double height = scanner.nextDouble();
        double nheight = height / 100;
        double bmi = weight / (nheight* nheight) ;
        if(bmi >= 40){
			System.out.println("Obese");
		}
		else if(bmi >= 25){
			System.out.println("OverWeight");
		}
		else if(bmi >= 18.5){
			System.out.println("Normal");
		}
		else{
			System.out.println("Underweight");
		}
       
    }
}

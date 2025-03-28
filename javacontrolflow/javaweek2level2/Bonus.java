import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary, time, bonus, totalSalary;
        System.out.println("Enter Your Salary: ");
        salary = input.nextInt();
        System.out.println("Enter Your Time of Service: ");
        time = input.nextInt();
        if (time > 5) {
            bonus = (salary * 5) / 100;
            totalSalary = salary + bonus;
            System.out.println("Bonus: " + bonus);
            System.out.println("Total Salary: " + totalSalary);
        } else {
            System.out.println("Your time of service is less than 5 years");
        }
        input.close();
    }
}
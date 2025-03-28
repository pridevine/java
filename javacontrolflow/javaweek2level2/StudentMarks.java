import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of students: ");
        n = input.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }
        int sum = 0, highest = marks[0], lowest = marks[0];
        for (int mark : marks) {
            sum += mark;
            if (mark > highest) highest = mark;
            if (mark < lowest) lowest = mark;
        }
        double average = (double) sum / n;
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        input.close();
    }
}
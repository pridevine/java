import java.util.Scanner;
public class AvgMarks{
 public static void main(String[] args){
          	Scanner input = new Scanner(System.in);
			int phy , chem , maths;
			System.out.println("Enter Your Marks in Maths : ");
			maths = input.nextInt();
			System.out.println("Enter Your Marks in Physics : ");
			phy = input.nextInt();
			System.out.println("Enter Your Marks in Chemistry : ");
			chem = input.nextInt();
			int avgMarks = ((maths + phy + chem) * 100 )/ 300;
			if(avgMarks >= 80){
				System.out.println("Grade A");
				System.out.println("Marks " + avgMarks);
				System.out.println("Level 4 , above agency - normalized standards");
			}
			else if(avgMarks >= 70){
				System.out.println("Grade B");
				System.out.println("Marks " + avgMarks);
				System.out.println("Level 3 , at agency - normalized standards");
			}
			else if(avgMarks >= 60){
				System.out.println("Grade C");
				System.out.println("Marks " + avgMarks);
				System.out.println("Level 2 , below , but approaching agency - normalized standards");
			}
			else if(avgMarks >= 50){
				System.out.println("Grade D");
				System.out.println("Marks " + avgMarks);
				System.out.println("Level 1 , well below agency - normalized standards");
			}
			else if(avgMarks >= 40){
				System.out.println("Grade E");
				System.out.println("Marks " + avgMarks);
				System.out.println("Level 1 , too - below agency - normalized standards");
			}
			else{
				System.out.println("Grade R");
				System.out.println("Marks " + avgMarks);
				System.out.println("(Remedial standards)");
			}
 
 
		}
	}

public class PenDistribution {
    public static void main(String[] args) {
		//inputing values
        int totalPens = 14, students = 3;
		
		//calculating pens per student and remaining pens
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;
		
		//diplaying result
        System.out.println("Q5: Pen Distribution Among Students");
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
	}
}

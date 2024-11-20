import java.util.Scanner;
public class IT24104151Lab4Q2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		//Enter exam marks from user 
		System.out.print("Please enter exam marks (out of 100) :"); 
		double marks = scanner.nextDouble();
		//Check whether marks are between 0 and 100
		if (marks<0 || marks>100){
			System.out.println("Invalid input for exam marks. Terminating program");
			return;
		}

		//Enter lab marks
		System.out.print("Please enter lab submission marks(out of 100) :");
		double LabMarks = scanner.nextDouble();
		//Validate lab marks
		if (LabMarks<0 || LabMarks>100){
			System.out.println("Invalid input for exam marks. Terminating program");
			return;
		}	

		//Input percentage for exam 
		System.out.print("Please enter the percentage given for the exam:");
		double ExamPercentage = scanner.nextDouble();

		//Input percentage for lab 
		System.out.print("Please enter the percentage given for the lab submission:");
		double LabPercentage = scanner.nextDouble();

		if (ExamPercentage + LabPercentage != 100){
			System.out.println("The percentage must add up to  100.Terminating program.");
			return;
		}	

		double FinalMarks =  (marks * ExamPercentage / 100) + (LabMarks * LabPercentage / 100);
		System.out.println("Final Exam Mark is:" +FinalMarks);	
	}
}
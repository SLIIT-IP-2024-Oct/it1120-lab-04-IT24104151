import java.util.Scanner;
public class IT24104151Lab4Q3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		// take a number from user
		System.out.print("Enter a number:");
		int number = scanner.nextInt();

		// Check the number using Ternary Operator
		String result = (number > 0) ? "Positive"
			      : (number < 0) ? "Negative"
			      : "Zero";

		//Output the result
		System.out.println("The Number is:" +result);
		







	}







}
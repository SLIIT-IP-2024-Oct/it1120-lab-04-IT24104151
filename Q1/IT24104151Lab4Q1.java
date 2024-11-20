import java.util.Scanner;
public class IT24104151Lab4Q1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		// take a number from user
		System.out.print("Enter a number:");
		int number = scanner.nextInt();

		// Check whether number is positive or negative or zero
		if (number>0){
			System.out.println("The number is: Positive");
		} else if (number<0){
			System.out.println("The number is: Negative");
		} else {
			System.out.println("The number is: Zero");
		}








	}







}
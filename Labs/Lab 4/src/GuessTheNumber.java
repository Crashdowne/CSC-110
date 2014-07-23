import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args)
	{
		int secretNumber = 5;
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		
		int i = 0;
		while (i <3)
		{
			int guess = inputNumber.nextInt();
			if (guess == secretNumber)
			{
				System.out.println("You are correct");
				break;
			}
			else if(i < 2)
			{
				System.out.println("Please try again");
				i++;
			}
			else
			{
				System.out.println("The Secret Number was " + secretNumber);
				i++;
			}
		}
		
	}
}

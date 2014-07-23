import java.util.Scanner;


public class June2 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double sum = 0;
		double x = 0;
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter a temperature");
			x = input.nextDouble();
			if (x >= 0)
			{
				sum += x;
			}
			else
			{
				//Keeps the loop going so it doesn't continue incrementing i after a negative number
				System.out.println("Please enter a positive number");
				i--;
			}
		}
		System.out.println("The sum is: " + sum);

	}
}

import java.util.Scanner;

//Take the average of an indefinite amount of numbers and output it to the screen
//Problems: Keeping input in memory, How to end the loop / stop getting input
//Keep track of the number of numbers (what you would divide by)

public class May29Part2 {

	public static void main(String[] args)
	{
		Scanner stdin=new Scanner(System.in);
		
		System.out.println("Enter your numbers to average");
		//Program will end when -1 is entered
		//-1 is a Sentinel value
		System.out.println("Enter -0 to end");
		
		//Takes in numbers from the screen
		int x = stdin.nextInt();
		//Track the number of numbers input
		int i =1;
		int total = x;
		while(x != -0)
		{
			x = stdin.nextInt();
			total = total + x;
			i++;
		}
		
		System.out.println("Average: " + total/i);
	}
}

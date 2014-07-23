
public class ExerciseFour {

	public static void main(String[] args)
	{
		exercise1();
		exercise2();
		exercise3();
		exercise4();
		exercise5();
	}
	
	public static void exercise1()
	{
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print("*");
			
			}
			System.out.println();
		}
	}
	
	public static void exercise2()
	{
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void exercise3()
	{
		for (int i=1; i<=7; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void exercise4()
	{
		int spaces=5;
		for (int i=1; i<=5; i++)
		{
			for (int j=spaces; j>=1; j--)
			{
				System.out.print(" ");
			}
			System.out.print(i);
			System.out.println();
			spaces--;
		}
	}
	
	public static void exercise5()
	{
		int numbers = 1;
		int spaces =5;
		for (int i=1; i<=5; i++)
		{
			for (int j = spaces; j >= 1; j--)
			{
				System.out.print(numbers);
				numbers = numbers + 1;
			}
		}
		spaces--;
	}
	
}

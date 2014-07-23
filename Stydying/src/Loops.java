
public class Loops {

	public static void main(String[] args)
	{
		System.out.print("   ");

		for (int i=1; i<=14; i++)
		{
			if(i<10)
			{
				System.out.print("   "+i);
			}
			else
			{
				System.out.print("  "+i);
			}
			
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------");

		for (int i=1; i<=100; i++)
		{
			if(i<10)
			{
				System.out.print(i+" |");
			}
			else
			{
				System.out.print(i+"|");
			}
			for (int j=1; j<=100; j++)
			{
				// Runs from i*j = 0-9
				if(i*j < 10)
				{
					System.out.print("   "+i*j);
				}
				// Runs from i*j = 10=99
				else if(i*j < 100)
				{
					System.out.print("  "+i*j);
				}
				//Runs from i*j = 100-999
				else if(i*j < 1000)
				{
					System.out.print(" "+i*j);
				}
				else
				{
					// Shits on fire yo
					//assumption that i*j will never be > 999
					throw new IndexOutOfBoundsException();
					// 1. Try to fix it in code
					// 2. Stop what you were doing + error dialogue
					// 3. Crash
				}
					
			}
			System.out.println();
		}
	}
}

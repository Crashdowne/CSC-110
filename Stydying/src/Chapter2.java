
public class Chapter2 {

	public static void main(String[] args)
	{
		//exercise8();
		//exercise9();
		exercise16();
	}
	
	public static void exercise8()
	{
		int spaces =5;
		int increasingNumbers =1;
		int numbers=1;
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=spaces; j++)
			{
				System.out.print(" ");
			}
			spaces--;
			for (int k=0; k<numbers; k++)
			{
				System.out.print(increasingNumbers);
			}
			numbers++;
			increasingNumbers++;
			System.out.println();
		}
	}
	
	public static void exercise9()
	{
		for (int i=1; i<=40; i++)
		{
			System.out.print("-");
		}
		System.out.println();
		for (int j=1; j<=8; j++)
		{
			System.out.print("_-^-_");
		}
		System.out.println();
		int increasingEleven=11;
		for (int k=1; k<=9; k++)
		{
				System.out.print(increasingEleven);
				increasingEleven = increasingEleven+11;
		}
		int eleven = 11;
		System.out.print("00");
		for (int l=1; l<=9; l++)
		{
			System.out.print(eleven);
			eleven = eleven+11;
		}
		System.out.print("00");
		System.out.println();
		for (int i=1; i<=40; i++)
		{
			System.out.print("-");
		}
	}
	
	public static void exercise16()
	{
		for (int i=0; i<6; i++)
		{
			for (int j=1; j<=22; j++)
			{
				if (i == 0)
				{
					System.out.print("!");
				}
			}
			
		}
	}
}

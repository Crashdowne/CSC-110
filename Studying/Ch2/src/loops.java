
public class loops {
	public static final int SIZE = 4;

	public static void main(String args[])
	{
		//fourStar();
		//increasingStar();
		//increasingNumbers();
		//justifiedDecreasingNumbers();
		//slashes();
		slashes2();
	}
	
	public static void fourStar()
	{
		for(int i=0; i<4; i++)
		{
			for(int z=0; z<6; z++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void increasingStar()
	{
		for(int i=0; i<5; i++)
		{
			// Finishes completely, z is always reset to 0 for the next iteration of i
			for(int z=0; z<=i; z++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void increasingNumbers()
	{
		for(int i=0; i<8; i++)
		{
			for(int z=0; z<i; z++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void justifiedDecreasingNumbers()
	{
		for(int i=5; i>=1; i--)
		{
			for(int z=1; z<=i; z++)
			{
				System.out.print(" ");
			}
			System.out.println(i);
		}
	}
	
	public static void slashes()
	{
		int width = 22;
		int line = 1;
		int height =6;
		
		for(int i=0; i<height; i++)
		{
			for(int p=0; p<(line-1)*2; p++)
			{
				System.out.print("\\");
			}
			
			for(int z=0; z<width; z++)
			{
				System.out.print("!");
			}
			
			for(int p=0; p<(line-1)*2; p++)
			{
				System.out.print("/");
			}
			
			width = width-4;
			line++;
			System.out.println();
		}
	}
	
	// Work in progress
	public static void slashes2()
	{
		
		int width = 22;
		int line = 1;
		int height =6;
		
		for(int i=0; i<SIZE; i++)
		{
			for(int p=SIZE; p>=SIZE-p; p--)
			{
				System.out.print("\\");
			}
			
			for(int z=SIZE; z<=(SIZE*z)-2; z--)
			{
				System.out.print("!");
			}
			
			for(int p=0; p<(line-1)*2; p++)
			{
				System.out.print("/");
			}
			
			width = width-4;
			line++;
			System.out.println();
		}
	}
}

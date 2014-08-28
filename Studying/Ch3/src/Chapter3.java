import java.util.*;


public class Chapter3 {

	public static void main(String args[])
	{
		//processName();
		drawSegments(4, 5);
		
	}
	
	public static void processName()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your full name: ");
		String name = input.next();
		System.out.println("\nYour name is: "+name);
	}
	
	public static void drawSegments(int numSegments, int height)
	{
		for(int i=1; i<=height; i++)
		{
			for(int j=height; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=(i*2)-1; k++)
			{
				System.out.print("*");
			}
				System.out.println();
		}
		
		for(int i=1; i<=height; i++)
		{
			for(int j=(height*2)-5; j>i; j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=(i*2)+1; k++)
			{
				System.out.print("*");
			}
				System.out.println();
		}
	}
}

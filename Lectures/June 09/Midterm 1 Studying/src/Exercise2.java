
public class Exercise2 {

	public static void main(String[] args)
	{
		int count = 1;
		for (int i=-5; i<57; i++)
		{
			System.out.println("Hi " + count);
			
			count++;
		}
		
		for (int j=0; j<3; j++)
		{
			for (int k=3; k>0; k--)
			{
				System.out.print((k+j)+ " , ");
			}
		System.out.println(j);
		}
	
		tracing();
	}
	
	public static void tracing()
	{
		int i=4;
		System.out.println("i = " + i);
		sumToNumber(6);
		System.out.println("i = " + i);
		i=multiplyToNumber(i);
		System.out.println("i = " + i);
	}
	
	public static void sumToNumber(int theNumber)
	{
		int total = 0;
		for (int i=1; i<theNumber; i++)
		{
			total = total + i;
		}
		System.out.println("total = " + total);
	}
	
	public static int multiplyToNumber(int theNumber)
	{
		int total = 1;
		for (int i=1; i<theNumber; i++)
		{
			total = total * i;
		}
		System.out.println("total = " + total);
		return total;
	}
}

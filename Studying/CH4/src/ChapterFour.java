import java.util.Arrays;


public class ChapterFour {

	public static void main(String args[])
	{
		
		//sumFractions(200);
		//returnSumFractions(10);
		repeat("hello", 4);		
	}
	
	public static void sumFractions(int n)
	{
		int i=1;
		double next;
		
		while(i<=n)
		{
			next = (1.0/i);
			System.out.println(next);
			i++;
		}
	}
	
	public static double[] returnSumFractions(int n)
	{
		int i=1;
		int index=0;
		double next;
		double[] fractions = new double[n+1];
		
		while(i<=n)
		{
			next = (1.0/i);
			fractions[index] = next;
			System.out.println(next);
			index++;
			i++;
		}
		
		System.out.println(Arrays.toString(fractions));
		return fractions;
	}
	
	public static void repeat(String s, int repts)
	{
		int i=1;
		String concad=s;
		
		while(i<=repts)
		{
			concad+=s;
			i++;
		}
		System.out.println(concad);
	}
	
}

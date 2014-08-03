
public class Part1 {
	
	
	public static void main (String[] args)
	{
		GCD(25, 10);
	}
	
	public static int GCD(int x, int y)
	{
		
		int big =x;
		int gcd = 1;
		
		for(int i=0; i<big; i++)
		{
			if(x%y==0 && y%x==0)
			{
				gcd=i;
			}
		}
		return gcd;
	}
	
}


public class Lab3Part3 {

	public static void main(String[] args)
	{
		exponents(2, 5);
	}
	
	public static int exponents(int base, int exponent)
	{
		int out = 0; 
		for(int x=0; x<=exponent; x++)
		{
			out = (base*base)*x;
		}
		System.out.println(out);
		return out;
	}
}

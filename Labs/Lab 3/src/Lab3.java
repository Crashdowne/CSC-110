
public class Lab3 {

	public static void main(String[] args)
	{
		int x=5;
		System.out.println("x is "+x);
		printNumbers(2);
		System.out.println("x is "+x);
		printNumbers(x);
		System.out.println("x is "+x);
	}
	
	public static void printNumbers(int y)
	{
		System.out.println("y is "+y);
		y*=4;
		System.out.println("y is "+y);
	}
	
}


public class Exercise4 {

	public static void main(String[] args)
	{
		whileTest(5, 6);
		whileTest(5, 20);
		whileTest(5, 22);
		whileTest(3, 10);
		whileTest(1, 21);
		
		int max;
		
		max = 17 / 10;
		System.out.println(max);
	}
	
	public static void whileTest(int x, int y)
	{
		while (x>0 && y>x)
		{
			x--;
			y=y%7;
			System.out.print(x+" , ");
		}
		System.out.println(y);
	}
}

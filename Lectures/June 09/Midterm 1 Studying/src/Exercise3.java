
public class Exercise3 {

	public static void main(String[] args)
	{
		ifTest(5, 5);
		ifTest(4, 4);
		ifTest(7, 3);
		ifTest(7, 4);
		ifTest(8, 3);
	}
	
	public static void ifTest(int x, int y)
	{
		if (x==y)
		{
			x+=5;
		}
		else if (x>y+2)
		{
			y*=2;
		}
		if (x%2 == 0 || y > x)
		{
			x = y+1;
			y-=7;
		}
		System.out.println(x+" and "+y);
	}
}


public class NumberOne {

	public static void main(String[] args)
	{
		// Question 3 from Midterm
		int constant = 10;
		for (int i =0; i<=9; i++)
		{
			for	(int k=0; k<i; k++)
			{
				System.out.print(".");
			}
			System.out.println(constant);
			constant--;
		}

	}
}
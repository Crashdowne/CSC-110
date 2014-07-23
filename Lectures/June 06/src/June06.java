
public class June06 {

	public static void main(String args)
	{
		double height = 25.7;
		int count = 1;
		System.out.println("Bounce Number Height");
		
		while(height > 0.007)
		{
			System.out.println(count + height+"m");
			height = height/2;
			count++;
		}
	}
}

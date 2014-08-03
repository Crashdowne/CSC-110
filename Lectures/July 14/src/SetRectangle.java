
public class SetRectangle {

	public static void main(String[] args)
	{
		//created 2 rectangle objects
		Rectangle rectangle1 = new Rectangle(5,6);
		Rectangle rectangle2 = new Rectangle (6,7);
		
		
		
		//have to use .equals (== compares memory addresses), this compares 2 objects
		boolean yes = rectangle1.equals(rectangle2);
		
		System.out.println(yes);
	}
	
}

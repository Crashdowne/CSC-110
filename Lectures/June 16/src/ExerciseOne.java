
public class ExerciseOne {

	public static void main(String[] args)
	{
		exampleOne();
		exampleTwo();
		exampleThree();
	}
	
	public static void exampleOne()
	{
		String p1 = new String("Hi");
		String p2 = new String("Hi");
		String p3 = p2;
		
		if (p1 == p2)
		{
			System.out.println("1");
		}
		if (p1.equals(p2))
		{
			System.out.println("2");
		}
		if (p2 == p3)
		{
			System.out.println("3");
		}
	}
	
	public static void exampleTwo()
	{
		String p1 = new String("Hello");
		
		if (p1.startsWith("H"))
		{
			System.out.println("It's true");
		}
		if (p1.startsWith("He"))
		{
			System.out.println("It's still true");
		}if (p1.startsWith("Hep"))
		{
			System.out.println("It's true");
		}
		else
		{
			System.out.println("It's false");
		}
		System.out.println(p1.indexOf("l"));
		System.out.println(p1.indexOf("e"));
		
	}
	
	public static void exampleThree()
	{
		/*String p2 = new String("Hello");
		String p3 = p2;
		String p3 = new String("Hello");
		
		System.out.println();
		*/
	}
}

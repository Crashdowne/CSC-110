import java.util.Scanner;


public class ExampleOne {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		name = name.toUpperCase();
		System.out.println(name);
		System.out.println(name.substring(2, 6));
		System.out.println(name.length());
		
		// Create a blank string
		String reverse="";
		
		for(int i=0; i<= name.length(); i++)
		{
			reverse += name.charAt(name.length() - i);
		}
		name = reverse;
		System.out.println(name);
	}
}

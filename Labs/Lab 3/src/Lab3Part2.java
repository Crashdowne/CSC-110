
public class Lab3Part2 {

	public static void main(String[] args)
	{
		printInformation("Mary", 29, 7.2);
		String name = "John";
		int age = 21;
		double gpa = 5.7;
		printInformation(name, age, gpa);
		printInformation("Sue", age, 3.1);
		printInformation(name, 17, gpa);
		
		printTriangle(5, "*");
		printTriangle(7,"ab");
		
	}
	
	public static void printInformation(String person, int age, double grades)
	{
		System.out.println(person + " is " +age+ " years old");
		System.out.println(person + "'s GPA is " +grades);
		System.out.println();
	}
	
	public static void printTriangle(int length, String chara)
	{
		for(int x=1; x<length; x++ )
		{
			for(int y=0; y<x; y++)
			{
				System.out.print(chara);
			}
			System.out.println();
		}
		System.out.println();
	}
		
}

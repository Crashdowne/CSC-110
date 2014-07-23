import java.util.Scanner;

public class May29Part3 {

	public static void main(String[] args)
	{
		Scanner stdin=new Scanner(System.in);
		System.out.println("Please enter 3 midterm scores per student");
		
		for(int x=1; x<=5; x++)
		{
			//Midterm 1
			double mid1 = stdin.nextDouble();
			//Midterm 2
			double mid2 = stdin.nextDouble();
			//Midterm 3
			double mid3 = stdin.nextDouble();
			double avg = (mid1+mid2+mid3)/3;
			System.out.println("Student number " +x + "'s average midterm grade is: " + avg);
		
		}
		
		/*
		int x = stdin.nextInt();
		System.out.println("First Number is: " + x);
		int y = stdin.nextInt();
		System.out.println("Second Number is: " + y);
		int z = stdin.nextInt();
		System.out.println("Third Number is: " + z)*/

	}
}
//Attach library to code
import java.util.*;

public class May29 {

	public static void main(String[] args)
	{
		Scanner stdin=new Scanner(System.in);
		int x = stdin.nextInt();
		System.out.println("First Number is: " + x);
		int y = stdin.nextInt();
		System.out.println("Second Number is: " + y);
		int z = stdin.nextInt();
		System.out.println("Third Number is: " + z);
		
		double avg = (x+y+z)/3;
		
		System.out.println("Average: " + avg);
	}
}

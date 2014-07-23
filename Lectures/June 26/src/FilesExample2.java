import java.io.*;
import java.util.*;


public class FilesExample2 {

	public static void main(String[] args) throws FileNotFoundException
	{
		File f =new File("weather2.txt");
		Scanner stdin =new Scanner(f);
		double temp1 = stdin.nextDouble();
		
		
		while (stdin.hasNext() != false)
		{
			if (stdin.hasNextDouble())
			{
				double temp2 = stdin.nextDouble();
				double diff = temp1 - temp2;
				System.out.println("Temp 1: " +temp1 + " Temp2: " + temp2 + " Diff: " + diff);
				temp1 = temp2;
			}
			else
			{
				stdin.next();
			}
		}
	}
}

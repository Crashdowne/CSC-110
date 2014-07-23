
import java.io.*;
import java.util.Scanner;


public class FileInputExample {

	public static void main(String[] args)
	throws FileNotFoundException
	{
		// Create a file object
		// Need to protect ourselves if the file does not exist
		{
			File f =new File("weather.txt");
			Scanner stdin =new Scanner(f);
			PrintStream ouput = new PrintStream("output.txt");
			double temp1 = stdin.nextDouble();
			for(int i=0; i<10; i++)
			{
				double temp2 = stdin.nextDouble();
				double diff = temp1 - temp2;
				System.out.println("Temperature 1 "  + temp1 + " Temperature 2 " +  temp2 + " Difference " + diff);
				output.println("Temperature 1 "  + temp1 + " Temperature 2 " +  temp2 + " Difference " + diff);
				temp1 = temp2;
				i++;
			}
		}
	}
}

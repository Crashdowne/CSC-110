import java.io.*;
import java.util.*;


public class Exercise1 {

	public static void main(String[] args) throws IOException
	{
		File data = new File("data.txt");
		Scanner readFile = new Scanner(data);
		PrintStream output = new PrintStream("output.txt");
		
		double number1;
		double number2=0;
		double average = 0;
		double actualAverage;
		double count=0;
		double product=0;

		while(readFile.hasNext() != false)
		{
			number1 = readFile.nextDouble();
			//System.out.println(number1);
			average = number1+number2;
			number2 = average;
			System.out.println(average);
			count++;
			output.println(number1);
			product=average;
			//System.out.println(product);
		}
		actualAverage=average/count;
		//System.out.println(actualAverage);
		output.println(actualAverage);
		output.println(product);
	}
}

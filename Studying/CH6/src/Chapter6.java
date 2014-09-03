import java.io.*;
import java.util.*;


public class Chapter6 {

	public static void main(String args[]) throws FileNotFoundException
	{
		//boyGirl();
		//essayCount();
		namePop();
	}
	
	public static void boyGirl() throws FileNotFoundException
	{
		Scanner input = new Scanner(new File("names.txt"));
		
		int boySum = 0;
		int girlSum = 0;
		
		int pos=0;
		while (input.hasNext())
		{
			input.next();
			if(pos%2==0)
			{
				boySum += input.nextInt();
			}
			else
			{
				girlSum += input.nextInt();
			}
			pos++;
		}
		System.out.println("Boy sum: "+boySum);
		System.out.println("Girl sum: "+girlSum);
	}
	
	public static void essayCount() throws FileNotFoundException
	{
		Scanner input = new Scanner (new File("test.txt"));
		
		int wordCount =0;
		int lineCount=0;
		while(input.hasNext())
		{
			input.next();
			wordCount++;
		}
		input.close();
		
		Scanner input2 = new Scanner (new File("test.txt"));
		while(input2.hasNextLine())
		{
			String line = input2.nextLine();
			lineCount++;
		}
		input2.close();
		
		Scanner input3 = new Scanner (new File("test.txt"));
		
		String words="";
		
		while(input3.hasNext())
		{
			words += input3.next();
		}
		
		int charaCount=words.length();
		input3.close();
		
		System.out.println(wordCount);
		System.out.println(lineCount);
		System.out.println(charaCount);
	}
	
	public static void namePop()
	{
		
	}
}

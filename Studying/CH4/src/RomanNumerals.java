import java.util.*;


public class RomanNumerals {
	
	public static void main(String args[])
	
	{
		int number = promptForNumber();
		numerals(number);
		
	}
	
	public static int promptForNumber()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer to be converted to its correspondng Roman Numeral: \n");
		return input.nextInt();
	}
	
	public static String numerals(int number)
	{
		String numeral = "Roman Numeral: ";
		int remainder =0;
		
		
		for(int i=1; i<=number; i++)
		{
			if (i % 10 == 0)
			{
				numeral += 'X';
			}
		}
		
		remainder = number % 10;

		if (remainder % 5  == 0)
		{
			numeral += 'V';
		}
		
		remainder = remainder % 5;
		
		for(int j=1; j<= remainder; j++)
		{
			numeral += 'I';
		}

		System.out.println(remainder);	
		System.out.println(numeral);
		
		return null;
	}

}
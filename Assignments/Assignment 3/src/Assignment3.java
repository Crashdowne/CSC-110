/*
 * Bryan Kesteloo 
 * V00718963
 * Assignment 3
 * This program passes values to three methods, which perform different mathematical operations
 */

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args)
	{
		//Calls the following methods
		printNumbers(10);
		printPowersof2(9);
		printPowersofN(-3, 7);
		//Calls the extra method which performs the previous operations, but using numbers input by the user
		userInputNumbers();
	}
	
	//Method prints out the numbers between 1 and 10 and encapsulates them within []
	//Receives the integer 10 from the method call above
	public static void printNumbers(int maximum)
	{
		System.out.println("Here are numbers between 1 and 10\n");
		int i = 1;
		while(i <= maximum)
		{
			System.out.println("[" + i + "]");
			i++;
		}
		System.out.println();
	}
	
	//Method prints out the values of 2^9, starting at 2^0
	//Receives the integer 9 from the method call above
	public static void printPowersof2(int pow)
	{
		System.out.println("Here is 2 to the power of 9\n");
		int i = 0;
		int count = 1;
		while(i <= pow)
		{
			//Gives the value of 2^0
			if(i == 0)
			{
				System.out.println("1");
			}
			//Multiplies count by 2 and prints it for the remainder of the loop to print out the powers of 2
			else
			{
				count = count*2;
				System.out.println(count);
			}
			i++;	
		}
		System.out.println();
	}
	
	//Method prints out the values of -3^7, starting at -3^0
	//Receives the integers -3, 7 from the method call above
	public static void printPowersofN(int base, int pow)
	{
		System.out.println("Here is -3 to the power of 7\n");
		int count = 1;
		int i = 0;
		while(i <= pow)
		{
			//Gives the value of -3^0
			if(i == 0)
			{
				System.out.println("1");
			}
			//Multiplies the base (-3) by count, which acts as if -3 were being multiplied by its self x number of times
			else
			{
				count = base * count;
				System.out.println(count);
			}
			i++;
		}
		System.out.println();
	}
	
//The methods that follow allow the user to input their own numbers for each of the operations
	public static void printNumbersInput()
	{
		System.out.println("\nEnter a number to count to");
		Scanner maxNumber = new Scanner(System.in);
		int maximum;
		maximum = maxNumber.nextInt();
		
		System.out.println("\nHere are numbers between 1 and " + maximum + "\n");
		int i = 1;
		while(i <= maximum)
			{
			System.out.println("[" + i + "]");
			i++;
			}
			System.out.println();
	}
	
	public static void printPowersof2Input()
	{
		System.out.println("\nEnter a number to raise 2 to");
		Scanner maxPower = new Scanner(System.in);
		int pow = maxPower.nextInt();
		
		System.out.println("Here is 2 to the power of " + pow + "\n");
		int i = 0;
		int count = 1;
		while(i <= pow)
		{
			if(i == 0)
			{
				System.out.println("1");
			}
			else
			{
				count = count*2;
				System.out.println(count);
			}
			i++;
		}
		System.out.println();
	}
	
	public static void printPowersofNInput()
	{
		System.out.println("Enter a base number");
		Scanner baseInput = new Scanner(System.in);
		int base = baseInput.nextInt();
		
		System.out.println("\nEnter a number to raise the base to\n");
		Scanner powerInput = new Scanner(System.in);
		int power = powerInput.nextInt();
		
		System.out.println("Here is " + base + " to the power of " + power + "\n");
		int count = 1;
		int i = 0;
		while(i <= power)
		{
			if(i == 0)
			{
				System.out.println("1");
			}
			else
			{
				count = base * count;
				System.out.println(count);
			}
			i++;
		}
	}
	
	public static void userInputNumbers()
	{
		System.out.println("Would you like to input your own numbers for these methods? (Y/N)");
		
		boolean stop = false;
		
		Scanner yesNo = new Scanner(System.in);
		
		while(stop != true)
		{
			String decision = yesNo.next();
			if(decision.equalsIgnoreCase("y"))
			{
				printNumbersInput();
				printPowersof2Input();
				printPowersofNInput();
					
				stop = true;
			}
			else if(decision.equalsIgnoreCase("n"))
			{
				System.out.println("Maybe later");
				stop = true;
			}
			else
			{
				System.out.println("Wrong letter(s)");
				System.out.println("Would you like to input your own numbers for these methods? (Y/N)");
			}
		}
	}
}

/**
 * LotteryTicket.java
 *
 * Complete this class for Part 2 of Assignment 1.
 */

import java.util.Random;
import java.util.Arrays;

public class LotteryTicket
{
    /**
	 * There are 6 numbers in each lottery ticket
	 */
	private final int TOTAL_NUMBERS	= 6;

	/**
	 * The smallest number on the ticket is assumed to be 1
	 * The largest number on the ticket is 49
	 */
	private final int MAX_NUMBER = 49;

	// Creates an array to hold the individual numbers on the ticket, with length of 6 (inherited from TOTAL_NUMBERS)
	public int[] ticketNumbers = new int[TOTAL_NUMBERS]; 


	/**
	 * This is the General Constructor. It should initialize and populate the
	 * lottery number into the array.
	 */
	public LotteryTicket()
	{
		// Generates the numbers for the lottery ticket and sorts them from lowest to highest
		generate();
		Arrays.sort(ticketNumbers);
	}

	/**
	 * This method populates the array a with numbers
	 * between MIN_NUMBER and MAX_NUMBER and ensures there are no duplicate numbers.
	 */
	private void generate()
	{
		Random r = new Random();

		for (int i=0;i<this.TOTAL_NUMBERS;i++)
		{
			int newItem = r.nextInt(MAX_NUMBER)+1;
			
			// Keep getting new number until you find a unique one
			while(checkForDuplicates(ticketNumbers, newItem) == true)
			{
				newItem = r.nextInt(MAX_NUMBER)+1;
			}
			
			ticketNumbers[i] = newItem;
		}

	}
	
	// Takes in the ticketNumbers array and the latest randomly generated number and compares loops through the array to make sure there are no duplicate numbers
	private boolean checkForDuplicates(int[] a, int newItem)
	{
		for (int i=0;i<TOTAL_NUMBERS;i++)
		{
			// If there is a duplicate, it returns true so the generate method has to generate another random number at that index
			if(a[i] == newItem)
			{
				return true;
			}
		}
		
		return false;
	}

	/**
	 * This method should return the numbers in the lottery ticket as a printable String,
	 * in the same format as the one used by the display method in Part 1.
	 */
	public String toString()
	{
		String s = "{";
		for(int i=0;i<ticketNumbers.length;i++)
		{
			s += ticketNumbers[i];
			if (i!=ticketNumbers.length-1)
			{
				s += ",";
			}
		}
		s += "}";
		return s;
	}

	/**
	 * This method compares two sets of LotteryTicket and returns a boolean (true or false)
	 * indicating whether they match. LotteryDraw uses this method to determine if it has found a
	 * winning ticket, so it is very important that it functions properly.
	 */
	public boolean matches(LotteryTicket other)
	{		
		// Loops through both arrays to compare the individual values at each index and stops as soon as it gets different values, or continues to check
		for(int i=0; i<TOTAL_NUMBERS; i++)
		{
			if(ticketNumbers[i] != other.ticketNumbers[i])
			{
				return false;
			}
		}
		return true;
	}
}

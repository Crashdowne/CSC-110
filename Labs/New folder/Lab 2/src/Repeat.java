/*
 * Bryan Kesteloo
 * V00718963
 * Creates a rhyme about "The house that Jack built"
 * Outputs the rhyme in proper form
 * 
 */

public class Repeat 
{
	public static void main(String[] args) 
	{
		//Passes the rest of the "This is..." statement and gives lineCount a number
		lines("the house that Jack built.", 0);
		lines("the malt", 1);
		lines("the rat,", 2);
		lines("the cat,", 3);
		lines("the dog,", 4);
		lines("the cow with the crumpled horn,", 5);
		lines("the maiden all forlorn", 6);	
	}
	
	public static void lines(String postThisIsStr, int lineCount)
	{
		//new line, this is...
		System.out.println("This is " + postThisIsStr);
		
		//repeated lines
		//As lineCount increases, the number of true if statements increases and thus adds lines to the rhyme
		if (lineCount >= 6)
		{
			System.out.println("That milked the cow with the crumpled horn,");
		}
		
		if (lineCount >= 5)
		{
			System.out.println("That tossed the dog,");
		}
		
		if (lineCount >= 4)
		{
			System.out.println("That worried the cat,");
		}
		if(lineCount >= 3) 
		{
			System.out.println("That killed the rat");
		}
		
		if(lineCount >= 2)
		{
			System.out.println("That ate the malt");
		}
		
		//The first repeated line is added under the first "This is..." phrase 
		if(lineCount >= 1)
		{
			System.out.println("That lay in the house that Jack built.");
		}
		
		// new line
		System.out.println();
	}
}

import java.util.*;


public class Chapter5 {

	public static void main(String args[])
	{
		//showTwos(29);
		//pigLatin("penis tastes awesome");
		rockPaperScissors();
		
		
	}	
	
	public static void showTwos(int num)
	{

		int twos=0;
		
		if(num % 2 != 0)
		{
			System.out.println(num+" = "+num);
		}
		
		if(num % 2 == 0)
		{
			twos = num/2;
			System.out.println("2*"+(twos));
		}
	}
	
	public static void pigLatin(String sentence)
	{
		String[] words = sentence.split(" ");
		
		char firstLetter;
		
		int i =0;
		while (i<=words.length-1)
		{
			String word = words[i];
			firstLetter = word.charAt(0);
		
			if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u' || firstLetter == 'y')
			{
				System.out.println("First letter is a vowel");
				word = word + 'a' + 'y';
			}
			else
			{
				System.out.println("First letter is a consonant");
				word = word.substring(1) + firstLetter +'a' +'y';
			}
		
			i++;
			System.out.println(word);
		}		
	}
	
	public static void rockPaperScissors()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Let's play Rock, Paper, Scissors:");
		System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors");
		
		int userChoice = input.nextInt();
		
		Random r = new Random();
		int compChoice = r.nextInt(2);
		
			if(compChoice == 0 && userChoice == 0)
			{
				System.out.println("Tie!!");
			}
			
			else if(compChoice == 1 && userChoice == 1)
			{
				System.out.println("Tie!!");
			}
			
			else if(compChoice == 2 && userChoice == 2)
			{
				System.out.println("Tie!!");
			}
			
			else if(compChoice == 0 && userChoice == 1)
			{
				System.out.println("You Win!");
			}
			
			else if(compChoice == 0 && userChoice == 2)
			{
				System.out.println("You Lose!");
			}
			
			else if(compChoice == 1 && userChoice == 0)
			{
				System.out.println("You Lose!");
			}
			
			else if(compChoice == 1 && userChoice == 2)
			{
				System.out.println("You Win!");
			}
			
			else if(compChoice == 2 && userChoice == 0)
			{
				System.out.println("You Win!");
			}
			
			else if(compChoice == 2 && userChoice == 1)
			{
				System.out.println("You Lose!");
			}
	}
}

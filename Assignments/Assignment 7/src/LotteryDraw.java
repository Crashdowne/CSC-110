/**
 * LotteryDraw.java
 *
 * A simple simulation of a lottery.
 */

public class LotteryDraw
{
	public static void main(String[] args)
	{
		int	numDraws = 10;
		// Creates a new lottery ticket by calling the LotteryTicket class
		LotteryTicket myTicket = new LotteryTicket();

		System.out.println("My lucky ticket is:");
		System.out.println(myTicket);

		if (args.length != 0)
		{
			numDraws = Integer.parseInt(args[0]);
		}

		System.out.print("Performing " + numDraws);
		System.out.println(" draws.  Good luck!");

		for (int i=0;i<numDraws;++i)
		{
			// Creates the ticket that our ticket has to match in order to win
			LotteryTicket winner = new LotteryTicket();
			if (myTicket.matches(winner))
			{
				System.out.println("YOU WIN!!!!");
				System.out.println("Time to quit school.");
				return;
			}
			else
			{
				System.out.println("You didn't match " + winner);
			}
		}
	}
}

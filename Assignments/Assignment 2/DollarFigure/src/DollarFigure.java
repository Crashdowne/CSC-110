/*
 * Bryan Kesteloo
 * V00718963
 * Outputs a pattern of Dollar Signs and Stars
 * 
 */

public class DollarFigure 
{
	public static void main(String[] args) 
	{
		//Creates the 7 rows for the pattern
		for(int row = 1; row <= 7; row++)
		{
			//Creates each of the columns for the pattern
			for(int column = 1; column <= 28; column++)
			{
				//Draws $ wherever the conditions are true and draws stars where they are false
				if((2*(row-1) < column && column <= (row-1)+7) || (column >= (-1*(row-1)+22) && (31-(2*row) > column)))
				{
					System.out.print("$");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

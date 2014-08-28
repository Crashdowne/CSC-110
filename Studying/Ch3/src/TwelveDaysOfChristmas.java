
public class TwelveDaysOfChristmas {
	
	public static void main(String args[])
	{
		int presentsReceived=1;
		int totalPresents=0;
		
		for(int day=1; day<=12; day++)
		{
			totalPresents = totalPresents+day;
			presentsReceived+=1;
			System.out.println("Day: " + day + "    Total Presents: " + totalPresents);	
		}
	}

}

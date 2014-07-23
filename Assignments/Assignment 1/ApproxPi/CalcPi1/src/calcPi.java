
public class calcPi {

	public static void main(String args[]) {
		//Sets initial values for variables
		double nextTerm = 1;
		double denominator = 1;
		double series = 0;
		
		//Calculations for Pi which will occur 8 times
		for(int i=0; i<8; i++)
		{
			series = (nextTerm / denominator) + series;
			denominator = denominator + 2;
			nextTerm = -1 * nextTerm;
		}
	
		//Multiplies the result of series by 4 as the final calculation for Pi
		double total = series * 4;
		System.out.println("Pi is approximately: " + total);
	}
}

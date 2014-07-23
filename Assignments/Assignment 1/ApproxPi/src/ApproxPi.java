public class ApproxPi {

	public static void main(String args[]) {
		
		//Calls method calculation
		Calculation ();
		
	}
	
	public static void Calculation() {
		
		//Sets initial values for variables
		double nextTerm = 1;
		double denominator = 1;
		double series = 0;
		
		//Outputs the result of Pi to the console
		System.out.println("Pi is approximately: " + total);
		
	}
	
	public static double Calculatoion(nextTerm, denominator, series) {
		
		int count = 1;
		
		while (count <= 8) {
			
			//Calculations for Pi which will occur 8 times
				series = (nextTerm / denominator) + series;
				denominator = denominator + 2;
				nextTerm = -1 * nextTerm;
				
				count ++;
		}
		
		
				
				/*series = (nextTerm / denominator) + series;
				denominator = denominator + 2;
				nextTerm = -1 * nextTerm;
				
				series = (nextTerm / denominator) + series;
				denominator = denominator + 2;
				nextTerm = -1 * nextTerm;
				
				series = (nextTerm / denominator) + series;
				denominator = denominator + 2;
				nextTerm = -1 * nextTerm;
				
				series = (nextTerm / denominator) + series;
				denominator = denominator + 2;
				nextTerm = -1 * nextTerm;
				
				series = (nextTerm / denominator) + series;
				denominator = denominator + 2;
				nextTerm = -1 * nextTerm;
				
				series = (nextTerm / denominator) + series;
				denominator = denominator + 2;
				nextTerm = -1 * nextTerm;
				
				series = (nextTerm / denominator) + series;
				denominator = denominator + 2;
				nextTerm = -1 * nextTerm;
				*/
				
				//Multiplies the result of series by 4 as the final calculation for Pi
				double total = series * 4;
				System.out.println("Pi is approximately: " + total);
				Return pi;
		
	}
	
}

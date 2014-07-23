public class ApproxPi {

	public static void main(String args[]) {
		
		//Calls method calc
		//double pi = Calc();
		
		//Sets initial values for variables
		int nextTerm = 1;
		int denominator = 1;
		int series = 0;
				
		//Outputs the result of Pi to the console
		System.out.println("Pi is approximately: ");
	
	}

	public static double Calc() {
		
		int count = 1;
		
		double nextTerm=1; double denominator=1; double series=0;
		
		while (count <= 8) {
			
			//Calculations for Pi which will occur 8 times
				series = (nextTerm / denominator) + series;
				denominator = denominator + 2;
				nextTerm = -1 * nextTerm;
				
				count ++;
				System.out.println(series);
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
				return(total);
		}
	}
	


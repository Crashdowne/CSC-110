
public class FtoC {

	//Look at order of output
	//FtoC ran and finished before the println's in main, due to where it was called
	public static void main(String args[]) {
		
		int Far=75;

		//Knows to return the value for Cels (From the calculation) to here, because it is called here
		double Cels=FtoC(Far);
		
		System.out.println(Cels);
		//Expect 75 here
		System.out.println("The value of Far in main :"+Far);
	}
	
	public static double FtoC(double Far) {
		
		//Can do in a single line: return (5/9)*(Far - 32);
		/*int Cels;
		Cels = (5/9)*(Far - 32);
		return(Cels);*/
		
		//Expect 75, variable was passed from main to here
		
		Far=Far;
		// Expect 75*100 now
		System.out.println("The vale of Far in FtoC: "+Far);
		return (5.0/9.0)*(Far - 32);
		
	}
	
}

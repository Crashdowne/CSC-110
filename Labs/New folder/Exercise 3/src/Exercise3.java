
public class Exercise3 {
	
	public static void main(String[] args) {
		
		System.out.println("Program begins ...");
		
		//Passes integer values to simple count and calls the method
		simpleCount(3, 15);
	}

	public static void simpleCount(int start, int finish) {
		
		for(int i = start; i <= finish; i++) {
			//increments i by 1 on top of the value of start, which was received from the method call
			
			System.out.println("The value of the loope counter is " + i);
			
		}
		
	}
	
}

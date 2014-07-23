
public class Lab2 {
	
	public static void main(String[] args) {
		
		//Example of a for loop
		//Sets initial value for variable, checks condition, if not met, executes the contents of the loop
		//Step 3: adds 1 to the variable value, then performs check, etc.
		//Stops at 10 < 10
		for(int value =0; value < 10; value++) {
			
			//Run for as many times as the condition in the loop is not met
			System.out.println("The value is " + value);
		}
		
		//Next thing that will run after the loop completes
		//Calls method someOther
		someOther();
		
	}
	
	public static void someOther() {
		
		System.out.println("Meothod someOther has been called");
		
	}

}

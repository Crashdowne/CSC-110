
public class Numbers {

	public static void main(String args[]){
		
		//create variables to store data
		
		int store1, store2, store3;
		
		store1=Remainder(24, 10);
		
		store2=Remainder(55, 12);
		
		int k=55;
		int t=12;
		
		store3=Remainder(k, t);
		
		System.out.println(store3);
		
		
	}
	

public static int Remainder(int x, int y){
	
			/* //int x;
			//int y;
			//int x, y;
			
			double doubleX, doubleY;
			
			int x=4;
			int y=5;
			
			int z = y % x;
			
			System.out.println(z);
			
			
			//Never use "" for variables
			System.out.println(y);
			
			//Looks for a string literal
			System.out.println("y");
			
			System.out.println("The value of y is " + y);
			
			System.out.println(x+y); */
	
	//Can return z to main method
	int z = x % y;
	
	//Cannot return a value in a void method, set to int to return the interger z
	return z;
	
}
	
}

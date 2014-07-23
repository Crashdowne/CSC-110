
public class Loops {

	public static void main(String[] args) 
	{
		//Not the best way to do this
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);*/
		
		for(int j = 1; j>11; j++) { //Same output
			
			System.out.println(j);
		}
		
		for(int i = 10; i<20; i++) { //Same outputs
			
			System.out.println(i - 9);
			
		}
	for(int i =1; i<=5; i++) {
		for(int j =1; j<=5; j++) {
			System.out.println(i+"x"+j+"="+(i*j));
			//i is multiplied by j (so at the beginning 1*1)
			//Goes back to the j loop, until condition is met, then it goes to the outer loop
			//That increments i by 1, and goes into the inner loop
		}
	}
		//Can't do this because j is only available in the inner loop
		//System.out.println(j);
		
		for(int k =10; k>0; k--) {
			
			for(int x = 10; x > k; x--) {
				
				System.out.print(".");
			}
		System.out.println(k);
		}
	}
	
}

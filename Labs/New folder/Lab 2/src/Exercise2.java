
public class Exercise2 {

	public static void main(String[] args) {
		
		//HI! loop
		for(int hi = 0; hi < 3; hi++) {
			
			System.out.println("Hi!");
		}
		//inserts space
		System.out.println();
		//1, 2, 3, Stop! loop
		for(int stop = 0; stop <5; stop++) {
			
			System.out.println("1, 2, 3, Stop!");
		}
		//inserts space
		System.out.println();
		//3, 2, 1, Go! loop
		for(int go = 0; go < 2; go++) {
			
			System.out.println("3, 2, 1, Go!");
		}
		
		System.out.println();
		//Counting loops!
			/*
			for(int first = 0; first < 5; first ++) {
				
				System.out.print(first+", ");
				
		}
			System.out.println();
			
			for(int first = 1; first < 6; first ++) {
				
				System.out.print(first+", ");
				
		}
			System.out.println();
			
			for(int first = 2; first < 7; first ++) {
	
				System.out.print(first+", ");
	
		}*/
			
			//Appending numbers loop
			for(int i = 1; i <= 5; i++) {
				//Dependent on the above loop
				for(int j = 1; j <i; j++) {
					System.out.print(j);
				}
				System.out.println();
				System.out.println();
			}
			/* 			i	j
			 * loop1	1	1
			 * 				2
			 * Loop2	2	1
			 * 				2
			 * 				3
			 * Loop2 ...
			 */
			
			//Increasing Series loop
		
			for(int i = 0; i < 3; i++) {
				
				int k=5+i;
				for(int j = i; j < k; j++) {
					System.out.print(j+", ");
					
				}
				System.out.println();
				
			}
	}
}


public class May26Two {

	//main method that calls a method called Numbers. 
	//Numbers has a parameter called x
	//Numbers prints all even numbers between 0 and x
	
	  public static void main(String[] args)
	  {
	  		Numbers(21);
	  }
	  
	 public static void Numbers(int x)
	 {
		 for(int i=0; i<x; i+=2)
		 {
			 System.out.println(i);
		 }
	}
}

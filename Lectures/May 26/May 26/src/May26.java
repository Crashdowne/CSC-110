
public class May26 {

	public static void main(String[] args)
	{
		//while loop example
		int i=1;
		while(i<=100)
		{
			System.out.println(i++);
			//i=i+3;
			//or i+=3
			//or i*3 (i++)
			
		}
		
		//do while loop example
		int j=0;
		do
		{
		System.out.println(j);
		j++;
		}
		while(j<100);

		//Dollar figure example
		Loops(5); //Method call
	} 
	
	//Receives 5
	public static void Loops(int iter)
	{
		for(int i=0; i<=iter; i++)
		{
			System.out.println(i);
		}
	}
}

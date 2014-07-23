/*
 * Bryan Kesteloo
 * V00718963
 * Outputs odd numbers from 0 to 20
 * 
 */

public class Primes {

	public static void main(String[] args) 
	{
		//Because we are multiplying by 2, we only need to loop 10 times
		for(int primes = 0; primes < 20/2; primes++) 
		{
			//Equation multiplies 2 by the prime numbers (currently from 1-10) and adds 1 to make them odd
			System.out.println(2*primes+1);
		}
	}
}

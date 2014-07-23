/*
 * Bryan Kesteloo
 * V00718963
 * Outputs numbers from 0.0 to 1.0 by incriments of 0.1
 * 
 */

public class Decimals {

	public static void main(String[] args)
	{
		//Multiplies i by .01 as i increases to give the increasing decimal points up to 1
		for(int i = 0; i <= 10; i++) {
			System.out.println(0.1*i);
		}
	}
}

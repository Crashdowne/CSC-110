import java.io.*;
import java.util.*;
public class TwoD {

	public static void main( String [] args) throws IOException	{
		File textFile = new File("grades.txt");
		Scanner input = new Scanner(textFile);

		int[][] grades01 = new int[8][10];
		int[][] grades02 =
			{
				{1,	5, 6, 8, 4, 3, 6, 8, 8, 2},
				{8, 3, 3, 5, 6, 7, 4, 8, 8, 8},
				{7, 6, 4, 5, 3, 3, 2, 6, 6, 4},
				{8, 8, 8, 8, 7, 8, 7, 8, 8, 8},
				{7, 6, 5, 6, 6, 7, 2, 3, 4, 8},
				{6, 3, 8, 5, 8, 7, 2, 7, 7, 7},
				{8,	5, 6, 8, 1, 5, 6, 8, 8, 8},
				{8, 8, 8, 8, 8, 8, 8, 8, 8, 8}
			};


		// note that grades.length is the number of rows
		// or the number of 1D arrays
		// grades[i].length is the length of the ith row.

		// Print arrays
		print2dArray(grades02);
		System.out.println();

		// Initialize from file, and then print out the contents
		// of the array
		grades01 = initArray(input, grades01);
		print2dArray(grades01);

	}// end main

	// Given an 2d array print it
	public static void print2dArray(int[][] a) {
		for(int i=0; i < a.length; i++)
		{
			for(int j=0; j < a[i].length; j++)
			{
				//replace the comment with the desired 
				//print statement.
				//will visit every element in a
				//[0][0] [0][1] [0][2] ... [0][9]
				//[1][0] [1][1] [1][2] ... [0][9]
				// .
				// .
				// .
				//[7][0] [7][1] [7][2] ... [7][9]
			}
			System.out.println();
		}

	}

	// Initialize array from file
	public static int[][] initArray(Scanner input, int[][]a) {
		
		//this should return a 2d-array representing the data
		//from the input file, not null.
		return a;
	}

	public static void print1DArray(double[] a) {
		
	}
}// end class

/*
 * Written by Anthony Estey for the Summer 2014 CSC110 Final revew session
 */

import java.util.*;
import java.io.*;

public class FinalReviewAug14 {
	public static void main(String[] args) throws IOException{
		/*question1();
		question2();
		question3();
		question4();
		question5();
		question7();*/
		
		question2();
		
		int num = 3/2;
		
		System.out.println(num);
		
		num++;
		
		System.out.println(num);
		
		num++;
		
		System.out.println(num);
	}
	
	/*
	 * Original code for question 1
	 */
	public static void question1Before() {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter Number 1:" );
		int num = userInput.nextInt();
		int modNum = num%10;
		System.out.println("Remainder of "+modNum+" for Number 1");
		
		System.out.print("Enter Number 2:" );
		int num2 = userInput.nextInt();
		int modNum2 = num2%10;
		System.out.println("Remainder of "+modNum2+" for Number 2");
		
		System.out.print("Enter Number 3:" );
		int num3 = userInput.nextInt();
		int modNum3 = num3%10;
		System.out.println("Remainder of "+modNum3+" for Number 3");
	}
	
	/*
	 * Helper method used to make code less redundant
	 */
	public static void getNumber(int n, Scanner s) {
		System.out.print("Enter Number "+n+":");	
		int num = s.nextInt();
		int modNum = num%10;
		System.out.println("Remainder of "+modNum+" for Number "+n);
	}
	
	/*
	 * Less redundant code for question 1
	 */
	public static void question1() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many numbers would you like to enter?");
		int howMany = userInput.nextInt();
		for (int i=1; i<=howMany; i++) {
			getNumber(i, userInput);
		}
	}

	/*
	 * Code to trade for question 2
	 */
	public static void question2() {
		System.out.println("\nQuestion 2 results");
		for (int i=1; i<9; i*=2) {
			int other = i/2;
			do {
				for (int j=0; j<=other; j++) {
					if (j*other > i) {
						System.out.print(other + " ");
					} else {
						other++;
					}		
				}			
			} while(other<i);
			System.out.println();
		}
	}
	
	/*
	 * Prints out a 2d array nicely spaced for 2-digit numbers
	 */
	public static void printArray(int[][] a) {
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.printf("%2d ", a[i][j]);
			}
			System.out.println();
		} 
	}
	
	/*
	 * Complete code for question 3, creates a 2d array of the right dimensions
	 * Then fills in the values according to the pattern, and prints out result
	 */
	public static void question3() {
		System.out.println("\nQuestion 3 results:");
		int[][] arr = new int[5][];
		arr[0] = new int[4];
		arr[1] = new int[3];
		arr[2] = new int[5];
		arr[3] = new int[2];
		arr[4] = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = i*j;		
			}
		} 

		//test for correctness
		printArray(arr);
	}
	
	/*
	 * Code to trade for question 4
	 */
	public static void question4() {
		System.out.println("\nQuestion 4 results:");
		Car c1 = new Car(538, "Honda Civic", 2007);
		Car c2 = new Car(997, "Ford Mustang", 2011);
		
		System.out.println(c1);
		c1.drive(201);
		System.out.println(c1);
		c2.drive(4);
		System.out.println(c2);
		
		c1.resetKMs();
		c1.drive(c2.getKMs() + 315);
		System.out.println(c1);
		
		c2.drive(996);
		System.out.println(c2);
	}
	
	/*
	 * Reads in data from an input file "arrayInput.txt"
	 * Puts the integers into the corresponding array
	 * Calls the question6 method to sum the two arrays
	 */
	public static void question5() throws IOException {
		System.out.println("\nQuestion 5 results:");
		Scanner userInput = new Scanner(new File("arrayInput.txt"));
		
		int arraySize = userInput.nextInt();
		int[] posArr = new int[arraySize];
		int[] negArr = new int[arraySize];
		
		int posI = 0;
		int negI = 0;
		
		while(userInput.hasNextInt()) {
			int num = userInput.nextInt();
			if (num >= 0) {
				posArr[posI] = num;
				posI++;			
			} else {
				negArr[negI] = num;
				negI++;
			}	
		}	
		System.out.println(Arrays.toString(posArr));
		System.out.println(Arrays.toString(negArr));
		
		int[] finalArray = question6(posArr, negArr);
		System.out.println(Arrays.toString(finalArray));
	}
	
	/*
	 * Adds together two integer arrays, treats all values
	 * in each array as a positive number
	 */
	public static int[] question6(int[] p, int[] n) {
		System.out.println("\nQuestion 6 results:");
		int[] arr = new int[p.length];
		for (int i=0; i<arr.length; i++) {
			arr[i] = Math.abs(p[i]) + Math.abs(n[i]);
		}
		return arr;		
	}
	
	/*
	 * Solution method for question 7
	 */
	public static void backwards(int n) {
		while (n>0) {
			System.out.print(n%10);
			n /= 10;
		}	
	}
	
	public static void question7() {
		System.out.println("\nQuestion 7 results:");
		backwards(14076);
	}
	
	/*
	 * Method used for Question 8
	 * Creates the arrays used for this question
	 * For each array, calls the mystery method, and then prints out the final contents of the array
	 */
	public static void question8() {
		System.out.println("\nQuestion 8 results:");
		int[] a1 = {2, 4};
		int[] a2 = {1, 3, 6};
		int[] a3 = {7, 2, 8, 4};
		int[] a4 = {5, 2, 7, 2, 4};
		int[] a5 = {2, 4, 6, 3, 7, 9};

		mystery(a1);
		mystery(a2);
		mystery(a3);
		mystery(a4);
		mystery(a5);
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(a4));
		System.out.println(Arrays.toString(a5));
		System.out.println("");
	}

	/*
	 * Ahhh, what does this method do - what a mystery!?
	 */
	public static void mystery(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < array[i + 1]) {
				array[i] = array[i + 1];
			}
		}
	}
}

class Car {
	private int kms;
	private String type;
	private int year;
	
	public Car(int kms, String type, int year) {
		this.kms = kms;
		this.type = type;
		this.year = year;
	}
	
	public void resetKMs() {
		this.kms=0;
	}
	
	public int getKMs() {
		return this.kms;
	}
	
	public void drive(int kms) {
		this.kms += kms;
		if (this.kms > 1000) {
			this.kms -= 1000;
		}
	}
	
	public String toString() {
		String stuff = this.year + " " + this.type + "\n";
		stuff = stuff + "Current kms: " + this.kms;	
		return stuff;
	}
}


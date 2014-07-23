/*
 * Bryan Kesteloo
 * V00718963
 * Course Grade Calculator
 * Calculates a final grade percentage and letter grade based on the input values
 * Takes in grade number values for labs, assignments, the quiz, midterm, final, student number and the final exam minimum threshold
 * Outputs the student ID, final grade percentage and letter grade
 */

import java.io.*;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AssignmentFour {
	// Creates a global boolean to be used when the student's final exam score is below the cutoff
	static boolean belowMinFinalThreshold = false;

	public static void main(String[] args)
	{		
		introArt();
		double minimumFinalExamGrade = minimumFinalExam();
		int studentIDNumber = studentID();
		double assignmentFinalScore = assignmentCalculation();
		double LabFinalScore = labCalculation();
		double quizFinalScore = quizCalculation();
		double midtermFinalScore = midtermCalculation();
		double finalExamFinalScore = finalExamCalculation(minimumFinalExamGrade);
		finalValuesOutput(assignmentFinalScore, LabFinalScore, quizFinalScore, midtermFinalScore, finalExamFinalScore, minimumFinalExamGrade, studentIDNumber);
	}
	
	public static double inputDouble(double lowerBound, double upperBound)
	{
		// Generic method to assess if the number entered falls within the required range
		boolean acceptableValue = false;
		double output = 0;
		
		while (acceptableValue != true)
		{			
			try
			{
				Scanner in = new Scanner(System.in);
				// Takes in the user input
				output = in.nextDouble();
				// Checks to see if the number falls within the bounds
				if (output >= lowerBound && output <= upperBound)
				{
					// Stops the indefinite while loop when a valid number has been entered
					acceptableValue = true;
				}
				else if (output < lowerBound)
				{
					// Prompts user that the number entered is below the lower bound
					System.out.println(output+" is too low, please enter a number between " + lowerBound + " and " + upperBound);
				}
				else if (output > upperBound)
				{
					// Prompts the user that the number entered is higher than the upper bound
					System.out.println(output+" is too high, please enter a number between " + lowerBound + "  and " + upperBound);
				}
			}
			catch(InputMismatchException e)
			{
				// Prompts the user when they have entered something other than a number
				// Stops the program from crashing when something other than a number is entered
				System.out.println("Please enter a number between " + lowerBound + " and " + upperBound + "!");
			}
		}
		// Returns the valid input as a double
		return output;
	}
	
	public static int inputInt(int lowerBound, int upperBound)
	{
		boolean acceptableValue = false;
		int output = 0;
		// Performs the same action as the inputDouble method, but returns an int rather than a double
		while (acceptableValue != true)
		{			
			try
			{
				Scanner in = new Scanner(System.in);
				output = in.nextInt();
				
				if (output >= lowerBound && output <= upperBound)
				{
					acceptableValue = true;
				}
				else if (output < lowerBound)
				{
					System.out.println(output+" is too low, please enter a number between " + lowerBound + " and " + upperBound);
				}
				else if (output > upperBound)
				{
					System.out.println(output+" is too high, please enter a number between " + lowerBound + "  and " + upperBound);
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("Please enter a number between " + lowerBound + " and " + upperBound + "!");
			}
		}
		return output;
	}
	
	public static double minimumFinalExam()
	{
		// Prompts user to enter the minimum score final exam score to pass the final
		System.out.println("Please set the minimum score to pass the final exam (between 0 and 100)\n");
		
		double minimumFinalGrade = inputDouble(0, 100);
		// Tells the parameter they entered
		System.out.println("\nThe minimum score to pass the final has been set to "+minimumFinalGrade+"\n");
		// Returns the double
		return minimumFinalGrade;
	}
	
	public static int studentID()
	{
		// Prompts user to enter the Student's ID number
		System.out.println("Enter Student ID Number\n");
		// Restricts the range of the ID to be between 0 and the maximum value for a 32bit integer
		int studentIDNumber = inputInt(0, Integer.MAX_VALUE);
		// Tells the user what they entered
		System.out.println("\nThe Student ID Number is: "+studentIDNumber+"\n");
		return studentIDNumber;
	}
	
	public static double assignmentCalculation()
	{
		double sum = 0;
		// Prompts user to enter a number for each of the 8 assignments
		System.out.println("Please enter a score out of 20 points for each of the 8 assignments\n");
		// Loop takes in the input from the user for each assignment, calculates the value of each assignment relative to its weight and adds them together to get a final number of points
		for(int i=0; i<=7; i++)
		{
			System.out.print("Assign #"+(i+1)+" ");
			double assignmentScore = inputDouble(0, 20);
			double weightedAssignmentScore = (assignmentScore/20)*3;
			sum += weightedAssignmentScore;
		}
		return sum;
	}
	
	public static double labCalculation()
	{
		double sum = 0;
		System.out.println("\nPlease enter a score out of 5 points for each of the 10 labs\n");
		// Loop takes in the input from the user for each assignment, calculates the value of each lab relative to its weight and adds them together to get a final number of points
		for(int i=0; i<=9; i++)
		{			
			System.out.print("Lab #"+(i+1)+" ");
			double labScore = inputDouble(0, 5);
			
			double weightedLabScore = (labScore/5)*.5;
			sum += weightedLabScore;
		}
		return sum;
	}
		
	public static double quizCalculation()
	{
		// Prompts user for input
		System.out.println("\nPlease enter a score out of 20 points for the Quiz\n");
		// Calculates the number of points for the quiz relative to its weight
		double quizScore = inputDouble(0, 20);
		double weightedQuizScore = (quizScore/20)*3;
		return weightedQuizScore;
	}
	
	public static double midtermCalculation()
	{
		// Prompts user
		System.out.println("\nPlease enter a score out of 100 points for the Midterm\n");
		// Calculates the number of points for the midterm relative to its weight
		double midtermScore = inputDouble(0, 100);
		double weightedMidtermScore = (midtermScore/100)*23;
		return weightedMidtermScore;
	}
	
	public static double finalExamCalculation(double minFinalExamScore)
	{
		// Prompts user
		System.out.println("\nPlease enter a score out of 100 points for the Final Exam\n");
		// Calculates the number of points for the final relative to its weight
		double finalExamScore = inputDouble(0, 100);
		double weightedFinalExamScore = (finalExamScore/100)*45;
		System.out.println(weightedFinalExamScore);
		// Checks to see if the student's final exam score is below the cutoff
		if(finalExamScore < minFinalExamScore)
		{
			belowMinFinalThreshold = true;
		}
		return weightedFinalExamScore;
	}
	
	public static String letterGradeCalculation(double finalGrade, double minFinalExamScore)
	{
		// Takes in the final grade point and the the threshold boolean
		String letterGrade = null;
		// Checks to see if the final grade point is between the set bounds or if the threshold boolean is true, which, in both cases will result in an F
		if ((finalGrade >=0 && finalGrade <= 49.4) || belowMinFinalThreshold == true)
		{
			letterGrade = "F";
		}
		else if (finalGrade >=49.5 && finalGrade <= 59.4)
		{
			letterGrade = "D";
		}
		else if (finalGrade >=59.5 && finalGrade <= 65.4)
		{
			letterGrade = "C";
		}
		else if (finalGrade >=65.5 && finalGrade <= 71.4)
		{
			letterGrade = "C+";
		}
		else if (finalGrade >=71.5 && finalGrade <= 77.4)
		{
			letterGrade = "B-";
		}
		else if (finalGrade >=77.5 && finalGrade <= 82.4)
		{
			letterGrade = "B";
		}
		else if (finalGrade >=82.5 && finalGrade <= 87.4)
		{
			letterGrade = "B+";
		}
		else if (finalGrade >=87.5 && finalGrade <= 92.4)
		{
			letterGrade = "A-";
		}
		else if (finalGrade >=92.5 && finalGrade <= 96.4)
		{
			letterGrade = "A";
		}
		else if (finalGrade >=9.5 && finalGrade <= 100.0)
		{
			letterGrade = "A+";
		}
		// The previous if / else if statements checks the value of the final grade point against their set bounds and output a letter grade
		return letterGrade;
	}
	
	public static void finalValuesOutput(double assignmentFinalScore, double LabFinalScore, double quizFinalScore, double midtermFinalScore, double finalExamFinalScore, double minimumFinalExamGrade, int studentIDNumber)
	{
		DecimalFormat numberDecimalPoints = new DecimalFormat("#.00");
		double classFinalGrade = assignmentFinalScore + LabFinalScore + quizFinalScore + midtermFinalScore + finalExamFinalScore;
		String letterGrade = letterGradeCalculation(classFinalGrade, minimumFinalExamGrade);
		System.out.println("Student ID: "+studentIDNumber);
		if(belowMinFinalThreshold == true)
		{
			System.out.println("\nFinal Exam Failed!\nLetter Grade: "+letterGrade);
		}
		else
		{
			System.out.println("\nPercentage: "+ (numberDecimalPoints.format(classFinalGrade))+"%\nLetter Grade: "+letterGrade);
		}
	}
	
	public static void introArt()
	{
		// Makes some nice art to show that the program has started
		System.out.println("********************************************");
		System.out.println("*                                          *");
		System.out.println("*          Course Grade Calculator         *");
		System.out.println("*                                          *");
		System.out.println("*                                          *");
		System.out.println("********************************************");
		System.out.println();
	}
}

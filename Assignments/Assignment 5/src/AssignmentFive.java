/*
 * Bryan Kesteloo
 * V00718963
 * July 07, 2014
 * Course Grade Calculator
 * Calculates a final grade percentage and letter grade based on the input values
 * Pulls grades and student IDs from a file and calculates each student's final grade
 * Outputs each student's ID, final grade percentage and letter grade, as well as a count of the number of letter grades earned across students
 */

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AssignmentFive {

	//global variables to track the number of letter grades earned by the students
	static int numberOfF = 0;
	static int numberOfD = 0;
	static int numberOfC = 0;
	static int numberOfCPlus = 0;
	static int numberOfBMinus = 0;
	static int numberOfB = 0;
	static int numberOfBPlus = 0;
	static int numberOfAMinus = 0;
	static int numberOfA = 0;
	static int numberOfAPlus = 0;
	
	public static void main(String[] args)
	{		
		art();
		
		//Get data
		getStudentData();
		
		//report
		dataOutput();
	}
	
	public static void getStudentData() 
	{
		//opens the scores file
		File studentData = new File("scores.dat");
		//will report if there is an issue opening the file
		try 
		{
			//sets the number of decimal points the grade percentages will be rounded to
			DecimalFormat numberDecimalPoints = new DecimalFormat("#.00");
			
			//creates a scanner to scan the file
			Scanner in = new Scanner(studentData);
			String line = null;
			
			// loops through the file line by line 
			while(in.hasNext())
			{
				//reads each line
				line = in.nextLine();
				
				//parse data
				//creates an array for all of the data in each line, skips whitespace so it does not get included in the array
				String[] data = line.split("\\ +");
				
				//identifies the Student ID as the first element in the data array
				String studentNumber = data[0];
				String trimmedStudentNumber = studentNumber.substring(studentNumber.length() - 4);
				double assignmentArray[] = new double[8];
				
				//creates an array of assignment scores so they can be sent to the assignment score calculation method
				assignmentArray[0] = Double.parseDouble(data[1]);
				assignmentArray[1] = Double.parseDouble(data[2]);
				assignmentArray[2] = Double.parseDouble(data[3]);
				assignmentArray[3] = Double.parseDouble(data[4]);
				assignmentArray[4] = Double.parseDouble(data[5]);
				assignmentArray[5] = Double.parseDouble(data[6]);
				assignmentArray[6] = Double.parseDouble(data[7]);
				assignmentArray[7] = Double.parseDouble(data[8]);
				double lab = Double.parseDouble(data[9]);
				double quiz = Double.parseDouble(data[10]);
				double midterm = Double.parseDouble(data[11]);
				double finalExam = Double.parseDouble(data[12]);

				//methods calls
				double assignmentScore = assignmentCalculation(assignmentArray);
				double labScore = labCalculation(lab);
				double quizScore = quizCalculation(quiz);
				double mindtermScore =midtermCalculation(midterm);
				double finalExamScore = finalExamCalculation(finalExam);
				double finalGrade = assignmentScore + labScore + quizScore + mindtermScore + finalExamScore;
				String letterGrade = letterGradeCalculation(finalGrade);
				System.out.println(trimmedStudentNumber+"    "+"Grade = "+(numberDecimalPoints.format(finalGrade))+"%"+"    "+"Letter Grade = "+letterGrade);
			}
			
			in.close();
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("Error with the file, is it in the correct location?");
		}
	}
	
	public static double assignmentCalculation(double[] assignmentArray)
	{
		double sum = 0;
		//loop takes in the array of assignment scores from the first student in the file and finds the weighted value for each score and adds them together
		for(int i=0; i<8; i++)
		{
			double assignmentScore = assignmentArray[i];
			double weightedAssignmentScore = (assignmentScore/20)*3;
			sum += weightedAssignmentScore;
		}
		return sum;
	}
	
	public static double labCalculation(double labScore)
	{
		//determines the lab score and its relative weight, which is returned to be added for the final percentage calculation
		double weightedLabScore = (labScore/5)*.5;
		return weightedLabScore;
	}
		
	public static double quizCalculation(double quizScore)
	{

		//determines the quiz score and its relative weight, which is returned to be added for the final percentage calculation
		double weightedQuizScore = (quizScore/20)*3;
		return weightedQuizScore;
	}
	
	public static double midtermCalculation(double midtermScore)
	{
		//determines the midterm score and its relative weight, which is returned to be added for the final percentage calculation
		double weightedMidtermScore = (midtermScore/100)*23;
		return weightedMidtermScore;
	}
	
	public static double finalExamCalculation(double finalExamScore)
	{
		//determines the final exam score and its relative weight, which is returned to be added for the final percentage calculation
		double weightedFinalExamScore = (finalExamScore/100)*45;
		return weightedFinalExamScore;
	}
	
	public static String letterGradeCalculation(double finalGrade)
	{
		String letterGrade = null;
		//checks to see if the final grade point is between the set bounds
		//also adds to the global counter for each letter grade
		if ((finalGrade >=0 && finalGrade <= 49.4))
		{
			letterGrade = "F";
			numberOfF++;
		}
		else if (finalGrade >=49.5 && finalGrade <= 59.4)
		{
			letterGrade = "D";
			numberOfD++;
		}
		else if (finalGrade >=59.5 && finalGrade <= 65.4)
		{
			letterGrade = "C";
			numberOfC++;
		}
		else if (finalGrade >=65.5 && finalGrade <= 71.4)
		{
			letterGrade = "C+";
			numberOfCPlus++;
		}
		else if (finalGrade >=71.5 && finalGrade <= 77.4)
		{
			letterGrade = "B-";
			numberOfBMinus++;
		}
		else if (finalGrade >=77.5 && finalGrade <= 82.4)
		{
			letterGrade = "B";
			numberOfB++;
		}
		else if (finalGrade >=82.5 && finalGrade <= 87.4)
		{
			letterGrade = "B+";
			numberOfBPlus++;
		}
		else if (finalGrade >=87.5 && finalGrade <= 92.4)
		{
			letterGrade = "A-";
			numberOfAMinus++;
		}
		else if (finalGrade >=92.5 && finalGrade <= 96.4)
		{
			letterGrade = "A";
			numberOfA++;
		}
		else if (finalGrade >=9.5 && finalGrade <= 100.0)
		{
			letterGrade = "A+";
			numberOfAPlus++;
		}
		//the previous if / else if statements checks the value of the final grade point against their set bounds and output a letter grade
		return letterGrade;
	}
	
	public static void dataOutput()
	{
		//prints out the number of times a specific letter grade was received by the students
		System.out.println("\n\nLetter Grades         # Received");
		System.out.println("     A+                     " + numberOfAPlus);
		System.out.println("     A                      " + numberOfA);
		System.out.println("     A-                     " + numberOfAMinus);
		System.out.println("     B+                     " + numberOfBPlus);
		System.out.println("     B                      " + numberOfB);
		System.out.println("     B-                     " + numberOfBMinus);
		System.out.println("     C                      " + numberOfCPlus);
		System.out.println("     C-                     " + numberOfC);
		System.out.println("     D                      " + numberOfD);
		System.out.println("     F                      " + numberOfF);
		

	}
	
	public static void art()
	{
		// Makes some nice art to show that the program has started
		System.out.println("********************************************");
		System.out.println("*                                          *");
		System.out.println("*          Course Grade Calculator         *");
		System.out.println("*                  v0.2                    *");
		System.out.println("*                                          *");
		System.out.println("********************************************");
		System.out.println();
	}
}

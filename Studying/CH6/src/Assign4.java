import java.util.*;


public class Assign4 {

	public static void main(String Args[])
	{
		double assignmentGrade = assignCalc();
		System.out.println(assignmentGrade);
		
		double labGrade = labCalc();
		System.out.println(labGrade);
		
		double quizGrade = quizCalc();
		System.out.println(quizGrade);
		
		double midtermGrade = midtermCalc();
		System.out.println(midtermGrade);
		
		double finalGrade = finalCalc();
		System.out.println(finalGrade);
		
		boolean gradeToPassFinal = gradeToPass(finalGrade);
		
		finalGradeCalc(assignmentGrade, labGrade, quizGrade, midtermGrade, finalGrade, gradeToPassFinal);
		
	}
	
	public static void scanner()
	{
		Scanner input = new Scanner(System.in);
		
		
		
	}
	
	public static double assignCalc()
	{
		Scanner input = new Scanner(System.in);
		
		double grade =0;
		
		for(int i=1; i<=8; i++)
		{
			System.out.println("Enter the score (out of 20) for assignment #"+i);
			grade += (input.nextDouble()/20)*3;
			System.out.println(grade);
		}
		return grade;
		
	}
	
	public static double labCalc()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the score (out of 5) for Labs");
		
		double grade = input.nextDouble();
		System.out.println(grade);
		return grade;
	}
	
	public static double quizCalc()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the score (out of 20) for the Quiz");
		double grade = (input.nextDouble()/20)*3;
		
		System.out.println(grade);
		
		return grade;
	}
	
	public static double midtermCalc()
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the score (out of 100) for the Quiz");
		double grade = input.nextDouble()/100*23;
		
		System.out.println(grade);	
		
		return grade;
	}
	
	public static double finalCalc()
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the score (out of 100) for the Final");
		double grade = input.nextDouble()/100*45;
		
		System.out.println(grade);	
		
		return grade;
	}
	
	public static boolean gradeToPass(double finalExamGrade)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the minimum score on the final to pass (out of 100)");
		double gradeToPass = input.nextDouble()/100*45;
		
		boolean passedFinal = false;
		
		if(finalExamGrade < gradeToPass)
		{
			passedFinal = false;
		}
		else
		{
			passedFinal = true;
		}
		return passedFinal;
	}
	
	public static void finalGradeCalc(double assignGrade, double labGrade, double quizGrade, double midtermGrade, double finalExamGrade, boolean passedFinal)
	{
		if (passedFinal == false)
		{
			System.out.println("Final Grade is: F");
		}
		
		else
		{
			double finalGrade = (assignGrade + labGrade + quizGrade + midtermGrade + finalExamGrade);
			
			if (finalGrade >= 96.5)
			{
				System.out.println("Final Grade is: A+");
			}
			
			else if (finalGrade >= 92.5 && finalGrade <= 96.4)
			{
				System.out.println("Final Grade is: A");
			}
			
			else if (finalGrade >= 87.5 && finalGrade <= 92.4)
			{
				System.out.println("Final Grade is: A-");
			}
			
			else if (finalGrade >= 82.5 && finalGrade <= 87.4)
			{
				System.out.println("Final Grade is: B+");
			}
			
			else if (finalGrade >= 77.5 && finalGrade <= 82.4)
			{
				System.out.println("Final Grade is: B");
			}
			
			else if (finalGrade >= 71.5 && finalGrade <= 77.4)
			{
				System.out.println("Final Grade is: B-");
			}
			
			else if (finalGrade >= 65.5 && finalGrade <= 71.4)
			{
				System.out.println("Final Grade is: C+");
			}
			
			else if (finalGrade >= 59.5 && finalGrade <= 65.4)
			{
				System.out.println("Final Grade is: C");
			}
			
			else if (finalGrade >= 49.5 && finalGrade <= 59.4)
			{
				System.out.println("Final Grade is: D");
			}
			
			else if (finalGrade <= 49.4)
			{
				System.out.println("Final Grade is: F");
			}
		}
	}
}

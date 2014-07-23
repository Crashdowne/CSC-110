import java.io.*;
import java.util.*;

public class CourseTester {

	public static void main(String[] args) throws IOException {
		
		classesFromFile();

		//We can create a new instance of our UvicCourse object just like we
		//have created instances of other classes this semester.

		/* 	Part 1: Trace/Understand this code: */

		//Which constructor gets called here?
		UvicCourse testCourse = new UvicCourse("CSC", 110, "Fundamentals of Programming: I");

		//Trace this method call
		String courseDept = testCourse.getDept();
		System.out.println("The department of the course I created is " +courseDept);

		//When we print out testCourse, the toString method is automatically called, is this output what you would expect?
		System.out.println("Information about the course I created: " + testCourse);



		/*	Part 2: Change the toString method in UvicCourse */

		//Change the toString method so it gives us more information about the course.
		//For our testCourse created above, output similar to the following might be better:
		//Course ID: CSC 110
		//Title: Fundamentals of Programming: I

		//This should now print out full details of testCourse

		//Uncomment the below code when you get to Part 2
		
		System.out.println("Course information:\n" + testCourse);
		



		/*	Part 3: This course doesn't have a title? Can we fix this with one of the methods?
					Hint: We don't have to call the other Constructor here. */

		//UVic Undergraduate course information can be found here: http://www.csc.uvic.ca/Program_Information/Undergraduate_Courses/

		//Uncomment the below code when you get to Part 3
		
		UvicCourse secondCourse = new UvicCourse("CSC", 225);
		//Call the setTitle method
		secondCourse.setTitle("Algorithms and Data Structures: I");
		System.out.println("Course information:\n" + secondCourse);
		



		/*	Part 4: Fill up the remaining three spots in the area with UVic courses, then search
					through the Array and print out all of the first year courses in the Array. */

		//Uncomment the code below when you get to Part 4
		
		UvicCourse thirdCourse = new UvicCourse("CSC", 115, "Fundamentals of Programming II");
		UvicCourse fourthCourse = new UvicCourse("CSC", 116 , "Fundamentals of Programming with Engineering Applications II");
		UvicCourse fifthCourse = new UvicCourse("CSC", 230 , "Computer Architecture and Assembly Language");
		
		UvicCourse[] courseArray = new UvicCourse[5];
		courseArray[0] = testCourse;
		courseArray[1] = secondCourse;
		courseArray[2] = thirdCourse;
		courseArray[3] = fourthCourse;
		courseArray[4] = fifthCourse;

		//Make more courses and put them in the array


		System.out.println("****Printing out information for first year courses in the array:*****");
		for (int i = 0; i<courseArray.length; i++) 
		{
			
			if(courseArray[i].getNum() > 0 && courseArray[i].getNum() < 200)
			{
				System.out.println(courseArray[i]);
			}
		}
		
		findMinMax(courseArray);


		/* 	Bonus:  Sort the Uvic courses in your array by course number,
					(or dept and course number if you're really up for a challenge).

					Remember the swap and findMinPosition methods we created in previous labs. Try and sort without
					looking back at these methods, but if you're stuck, take a peak! 
					
					
			Bonus2:	Read in the courses from the data file courses.txt, found
					on the labs page, and sort that array.
					
					This file is layed out so the first line has the number of 
					courses in the file, and the following lines are in the format:
					DEPT	NUM		TITLE
					
					
		*/



	}
	
	public static void findMinMax(UvicCourse[] courseArray)
	{
		boolean notOrdered=true;
		int oldCourseNum=1000;
		
		UvicCourse[] firstYearCourses = new UvicCourse[courseArray.length];
		
		for(int i=0; i<courseArray.length; i++)
		{
			if(courseArray[i].getNum() > 0 && courseArray[i].getNum() < 200)
			{
				firstYearCourses[i] = courseArray[i];
				i++;
			}
		}
	}
	
	public static void classesFromFile() throws IOException
	{
		Scanner s = new Scanner(new File("courseInfo.txt"));
		int numberOfCourses = s.nextInt();
		UvicCourse[] courseArray1 = new UvicCourse[numberOfCourses];
		for(int i=0; i<courseArray1.length; i++)
		{
			String theDept = s.next();
			int theNum = s.nextInt();
			String theTitle =s.next();
			UvicCourse course = new UvicCourse(theDept, theNum,theTitle);
			courseArray1[i]=course;
		}
	}
}

public class Point {

	//private here causes an error
	//tester can't change these values if private
	private int x;
	private int y;
	
	//Setting to static makes it a class variable, only gets created one time
	public static int countOfPoints=0;
	
	//default constructor
	//takes in no parameters
	Point()
	{
		//default point
		//this = properties of this object we are working with
		this.x=0;
		this.y=0;
		countOfPoints++;
	}
	
	//takes in 2 parameters
	//sets x and y to those parameters
	public Point(int xcoord, int ycoord)
	{
		this.x= xcoord;
		this.y= ycoord;
		countOfPoints++;
	}
	
	public void Move(int xcord, int ycord)
	{
		x+=xcord;
		y+=ycord;
	}
	
	//method that calculates distance from the origin
	//sqrt(x^2 + y^2)
	public double DFrom0()
	{
		return(x+y);
		
	}
	

	public double Dfrom0Two() {

		return Math.sqrt(x*x+y*y);
	
	}

	public String toString() 
	{
		return "("+ this.x + "," +this.y + ")";
	}

	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public void setX(int xcoord)
	{
		this.x = xcoord;
	}
	
	public void setY(int ycoord)
	{
		this.y = ycoord;
	}

}

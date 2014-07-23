
public class Tester {

	public static void main(String[] args)
	{
		//creates a new object called p1, that has properties and functionality
		//values of x,y are 0,0 -> the defaults in the Point class
		Point p1 = new Point();
		Point p3 = new Point();
		Point p4 = new Point();
		
		//sets x value for the p1 object
		//can't do because private
		//p1.x = 9;
		
		Point p2 = new Point(5,0);
		
		p2.Move(20, 20);
		
		System.out.println(p1.getX());
		System.out.println(p2.getX());
		
		p1.setX(5);
		p2.setY(100);
		
		System.out.println("After Setter: "+p1.getX()+","+p2.getY());
		
		double result =p2.DFrom0();
		System.out.println(p2);
		
		//Want it to be a class variable, not attached to a specific object
		System.out.println(Point.countOfPoints);
		
		//Want to count how many point have been created: int countOfPoints;

	}
}


public class Rectangle {

	private int area=0;
	private int width;
	private int length;
	private int height;
	private int perimeter;
	private String drawSide;
	
	
	public Rectangle(int length, int height)
	{
		this.width=length;
		this.length=height;
		
	}
	
	public void setLength(int length)
	{
		this.length=length;
	}
	
	public void setHeight(int height)
	{
		this.height=height;
	}
		
	public int area()
	{
		return this.length*this.height;
	}
	
	public int getLength()
	{
		return this.getLength();
	}
	
	public int getHeight()
	{
		return this.getHeight();
	}
	
	public int getPerimeter()
	{
		return (this.length*2)+(height*2);
	}
	
	public double getDiagional()
	{
		return Math.sqrt(Math.pow(this.length, 2)*(Math.pow(this.height, 2)));
	}
	
	public String toString()
	{
		return this.length+"X"+this.width;
	}
}

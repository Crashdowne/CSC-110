
public class Rectangle {

	private int length;
	private int width;
	
	public Rectangle(int l, int w)
	{
		this.length=1;
		this.width=1;
	}
	
	public int getLength()
	{
		return this.length;
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	public void setLength(int l)
	{
		this.length=l;
	}
	
	public void setWidth(int w)
	{
		this.width=w;
	}
	
	public int perimeter()
	{
		return this.length*this.length + this.width*this.width;
	}
	
	public String toString()
	{
		return "This rectangle has a length of: " + this.length + " This rectangle has a width of: " + this.width;
	}
	
	//parameter of Rectangle creates a new rectangle 
	public boolean equals(Rectangle other)
	{
		//compares lengths and widths
		if(this.length == other.getLength()&&this.width==other.width)
			return true;
		
		return false;
	}
	
	
}

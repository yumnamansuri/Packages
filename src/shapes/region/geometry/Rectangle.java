package shapes.region.geometry;

public class Rectangle {

	private int length,breadth;

	public Rectangle(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	
	

	public int getArea()
	{
		return length*breadth;
	}
	public int getPerimeter()
	{
		return (length*breadth)*2;
	}
	

}

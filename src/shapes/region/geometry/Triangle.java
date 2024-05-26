package shapes.region.geometry;

public class Triangle {

	private double breadth,height;

	public Triangle(double breadth,double height) {
		
		this.breadth = breadth;
		this.height = height;
		
	}
	
	
	public double getArea()
	{
			return (0.5) * breadth * height;
	}
	public double getPerimeter()
	{
		return breadth+height;
	}
	

}

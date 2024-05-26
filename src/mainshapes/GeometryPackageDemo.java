package mainshapes;
import shapes.region.geometry.Circle;
import shapes.region.geometry.Rectangle;
import shapes.region.geometry.Triangle;

public class GeometryPackageDemo {

	
	public static void main(String[] args) {
		Circle c = new Circle(5);
		System.out.println("Area of Circle => " +c.getArea());
		System.out.println("Perimeter of Circle => " +c.getPerimeter());
		
		Rectangle rect = new Rectangle(7,8);
		System.out.println("Area of Rectangle => " +rect.getArea());
		System.out.println("Perimeter of Circle => " +rect.getPerimeter());
		
		Triangle tri = new Triangle(3,10);
		System.out.println("Area of Triangle => " +tri.getArea());
		System.out.println("Perimeter of Triangle => " +tri.getPerimeter());
	}

}

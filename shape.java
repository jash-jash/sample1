
public class shape {
	abstract class shape{
		abstract double calculateArea();
		abstract double calculatePerimeter();
		
	}
	class Circle extends shape{
		double radius;
		public Circle (double radius) {
			this.radius = radius;
		}
		double calculateArea() {
			return Math.PI*radius*radius; 
		}
		double calculatePerimeter()
		{
			return 2*Math.PI*radius;
		}
	}
	class Triangle extends shape {
		double side1,side2,side3;
		public Triangle(double side1,double side2,double side3) {
			this.side1=side1;
			this.side2=side2;
			this.side3=side3;
		}
		double calculateArea() {
			double s=(side1+side2+side3)/2;
			return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		}
		double calculatePerimeter() {
			return side1+side2+side3;
		}
	}
	public class ShapeTest{
		public static void main(string[] args) {
			
			
			
			
		}
	}

}

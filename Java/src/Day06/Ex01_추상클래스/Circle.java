package Day06.Ex01_추상클래스;

public class Circle extends Shape{
	
	
	double radius; 
	
	public Circle() {
		this(0);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	double round() {
		return 2 * Math.PI * radius;
	}
	//getter, setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	//toString
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	
}

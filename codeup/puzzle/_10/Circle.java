package _10;

public class Circle {

	double radius;
	double area;
	

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "원형의 넓이 : " + getArea();
	}

	
	
}

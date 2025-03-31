package _10;

public class Triangle {

	double width;
	double height;
	double area;
	public Triangle() {
	}
	
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
		this.area = area;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return width * height / 2;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "삼각형의 넓이 : " + getArea();
	}
	
}

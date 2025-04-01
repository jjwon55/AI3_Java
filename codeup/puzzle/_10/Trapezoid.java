package _10;

public class Trapezoid {

	double top;
	double bottom;
	double height;
	double area;
	public Trapezoid() {
	}
	public Trapezoid(double top, double bottom, double height) {
		this.top = top;
		this.bottom = bottom;
		this.height = height;
		this.area = area;
	}
	public double getTop() {
		return top;
	}
	public void setTop(double top) {
		this.top = top;
	}
	public double getBottom() {
		return bottom;
	}
	public void setBottom(double bottom) {
		this.bottom = bottom;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return ((top + bottom) * height) / 2;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "사다리꼴의 넓이 : " + getArea();
	}
	
	
	
}

package Day05.Ex03_메소드;

public class Car {

	//모델명 속도
	
	String model;
	int speed;
	public Car() {
		this("모델명없음", 0);
	}
	public Car(String model) {
		this.model = model;
	}
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
}

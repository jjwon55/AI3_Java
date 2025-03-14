package Day05.Ex03_메소드;

public class Cartest {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.model = "제네시스";
		car.speed = 130;
		
		car.setSpeed(200);
		
		System.out.println("model : " + car.model);
		System.out.println("speed : " + car.getSpeed());
	
	}
	
}

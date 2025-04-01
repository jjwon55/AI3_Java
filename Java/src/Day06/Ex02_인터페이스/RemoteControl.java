package Day06.Ex02_인터페이스;

public interface RemoteControl {

	// 상수
	// 최저 속력, 최고 속력 상수를 선언하시오
	// 인터페이스 변수  선언시, (public static final)이 자동으로 선언된다
	int Max_speed = 300;
	int Min_speed = 0;
	
	// 추상 메소드
	// (public abstract) 가 자동으로 선언된다.
	void turnOn();
	void turnOff();
	void setspeed(int speed);
	
	// 디폴트 메소드
	// : 구현한 객체가 오버라이딩하지 않아도 기본으로 사용할 수 있는 메소드
	default void parking(boolean check) {
		if (check) {
			System.out.println("주차되었습니다.");
			setspeed(Min_speed);
		} else {
			System.out.println("주행모드를 실행합니다.");
			setspeed(10);
			
		}
	}
	//static 메소드
	//구현 객체가 없어도 인터페이스만으롷고 호춯이 가능
	static void changeBattery() {
		System.out.println("배터리를 교체합니다.");
	}
	
	
}


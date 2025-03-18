package Day07.Ex02_다중상속;

public interface RemoteControl {

	int MAX_VOLME = 300;
	int MIN_VOLME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	void setChennel(int chennel);
	
	default void serMute(boolean mute) {
		if (mute) {
			System.out.println("음소거 설정되었습니다.");
			setVolume(MIN_VOLME);
		}
		else {
			System.out.println("음소거 해제되었습니다.");
			setVolume(10);
		}
	}
	static void changeBattery() {
		System.out.println("배터리 교체");
	}
	
	
	
	
}

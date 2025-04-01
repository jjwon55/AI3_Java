package Day07.Ex02_다중상속;

import java.text.MessageFormat;

// 다중구현
// public class 클래스명 implements 인터페이스a, b
public class SmartTelevison implements SmartRemoteControl, Searchable {
	
	int voulme;			//볼륨
	int channel;		//채널
	String keyword;		//검색어
	int x, y;			//터치패드 좌표
	
	
	
	@Override
	public void turnOn() {
		System.out.println("전원 on");
	}
	@Override
	public void turnOff() {
		System.out.println("전원 off");
		
	}
	@Override
	public void setVolume(int volume) {
		this.voulme = volume;
		System.out.println("volume : " + volume);
	}
	@Override
	public void setChennel(int chennel) {
		this.channel = chennel;
		System.out.println("chennel : " + chennel);
	}
	@Override
	public String receiveVoice(String voice) {
		System.out.println("음성 입력 : " + voice);
		return "voice : " + voice;
	}
	@Override
	public int channelSearch(String keyword) {
		int channel = 0;
		switch (keyword) {
		case "SBS"	:channel = 5; break;
		case "KBS"	:channel = 7; break;
		case "MBC"	:channel = 11; break;
		case "Mnet"	:channel = 27; break;
		case "ENA"	:channel = 30; break;

		}
		return channel;
	}
	@Override
	public String[] contentSearch(String keyword) {
		String[] movieContents = {"포레스트 검프", "신세계", "러덜리스", "마녀", "말할수없는 비밀"};
		String[] idolContents = {"아이브", "에스파", "블랙핑크", "BTS", "뉴진스"};
		String[] recommentContents = {"노바꾸", "경영자들", "핑계고", "굿데이", "알클"};
		String[] choiceContents;
		switch (keyword) {
		case "영화":
			choiceContents = movieContents;
			break;
		case "아이돌":
			choiceContents = idolContents;
			break;
		default:
			choiceContents = recommentContents;
			break;
		}
		
		return choiceContents;
	}
	@Override
	public void touch(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("(x,y) : " + MessageFormat.format("{}, {}", x , y));
	}
		
}

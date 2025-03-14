package Day05.Ex04_상속;

public class Pikachu {
	
	//클래스 객체를 정의하는 설계도
	//멤버 변수 메소드
	//생성자
	//객체가 생성될 때 실행되는 ㅡ메소드
	//객체의 병수를 초기화하는 역할
	//
	public Pikachu() {
		//energy = 100;
		//type = "전기";
		this(100, "전기");
	}
	
	public Pikachu(int energy) {
		this ( energy, "전기");
	}
	
	
	
	public Pikachu(int energy, String type) {
		this.energy = energy;
		this.type = type;
	}

	public int energy;
	public String type;
	
	
	public String aAttack() {
		return "십만볼트";
	}
	
	public String bAttack() {
		return "전광석화";
	}

	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + "]";
	}
	
}

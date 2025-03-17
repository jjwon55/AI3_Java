package Day05.Ex06_접근지정자.B;

import Day05.Ex06_접근지정자.A.Person;

public class Student extends Person{ 

	public Student() {
		super();
	}
	
	public Student(String name, int age, int height, int weight) {
		super(name, age, height, weight);
	}
	
	public void defaultSetting() {
		name = "이름없음";
		age = 20;
		//height = 170;
		//weight = 60;
		
		setHeight(170);
		setWeight(60);
				
	}
}

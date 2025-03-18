package Day07.Ex03_ClassCasting;

public class Person {

	String name;
	int age;
	
	
	public Person() {
		this("이름없음", 1);
	}


	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String work() {
		return "일을합니다.";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

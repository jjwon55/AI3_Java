package Day07.Ex02_다중상속;

class Person {
	String name;
	int age = 10;
	
	void work() {
		System.out.println("일을 합니다.");
	}
}

class Student extends Person {
	String major;
	int age = 20;
	
	void work() {
		System.out.println("공부 합니다.");
	}
}
public class Test {

	

	public static void main(String[] args) {
		
		Person person = new Student();
		// 에러 : System.out.println( person.major );
		person.work();        // ??????
		System.out.println( person.age );
	}

}

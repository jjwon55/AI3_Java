package Day07.Ex03_ClassCasting;

public class UpCasting {

	public static void main(String[] args) {
		//업캐스팅 (자동 타입 변환)
		//(부모클래스) = (자식클래스)
		//자식 객체를 부모 클래스타입으로 변환하는 것
		Person person = new Student("김조은", 20, 1, "문예창작과");
		
		//person 	: name, age
		//student 	: name, age, major, grade
		System.out.println("name : " + person.name);
		System.out.println("age : " + person.age);
		//person 객체에서는 자식 클래스의 변수인 grade, major 에는 접근할 수 없다.
		
		//클래스를 업캐스팅 하면
		//변수는 부모 클래스의 변수만 접근 가능하고
		//메소드는 자식 클래스의 메소드가 우선하여 실행된다.
		System.out.println( person );
		System.out.println(person.work() );
		
		//이유 변수는 정적 바인딩 메소드느 ㄴ동적 바인딩
		// 바인딩
		//프로그램에서 사용되는 요소에 실제 값을 
		
	}
	
}

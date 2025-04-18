package Day07.Ex01_익명객체;

public class AnonymousPerson {

	//익명 자식 객체 생성
	// 부모 클래스 객체명 = new 부모클래스() {}
	
	Person person1 = new Person()	{
		// 이 영역은 마치 자식 클래스영역과 같다.

		@Override
		void work() {
			System.out.println(name + "(" + age +")");
			System.out.println("요리를 합니다.");
			System.out.println();
		
		}
		
	};
	Person person2 = new Person()	{
		// 이 영역은 마치 자식 클래스영역과 같다.

		@Override
		void work() {
			System.out.println(name + "(" + age +")");
			System.out.println("요리를 합니다.");
			System.out.println();
		}
	};
	
	void method() {
		person1.name = "김조은";
		person1.age = 20;
		person1.work();
		
		person1.name = "백종원";
		person1.age = 40;
		person1.work();
	
	
	}
}

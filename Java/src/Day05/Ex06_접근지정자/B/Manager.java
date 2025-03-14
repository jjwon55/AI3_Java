package Day05.Ex06_접근지정자.B;

public class Manager {

	public static void main(String[] args) {
		Student student = new Student()	;
		student.defaultSetting();
		System.out.println("name : " + student.name);
		System.out.println("age : " + student.getAge);
		System.out.println("height : " + student.getHeight);
		System.out.println("weight : " + student.getWeight);
		System.out.println();
	}
}

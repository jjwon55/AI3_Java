package Day06.Ex03_중첩클래스;

public class NestedClass2 {

	public static void main(String[] args) {
		
		X x = new X();
		
		X.Y y = x.new Y();
		y.value = 10;
		System.out.println("Y 객체의 변수 : " + y.value);
		y.method1();
		y.method2();
		
		
		
		X.Z z = new X.Z();
		z.value1 = 20;
		System.out.println("X의 Z 객체 변수: " + z.value1);
	
		z.value2 = 30;
		System.out.println("X의 Z 객체 변수: " + z.value2);
		z.method1();
		X.Z.method2();
		
		x.method();
	}
}

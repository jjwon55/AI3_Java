package Day05.Ex08_Static;

public class StaticMember {

	static int a;
	static int b;
	
	int c;
	
	static final double PI = 3.141592;
	
	public static int sum(int x, int y) {
		int sum = a+b+x+y;
		//sum += c;
		return sum;
	}
	
	public static void main(String[] args) {
		int sum = sum(10,20);
		StaticMember.sum(100, 200);
		a = 100;
		
		StaticMember s1 = new StaticMember();
		StaticMember s2 = new StaticMember();
		
		
		int a1 = s1.a;
		int c1 = s1.c = 10;
		int a2 = s1.a;
		int c2 = s1.c = 20;
		
		//PI = 100;
		
		System.out.println("a1 : " + a1);		//100
		System.out.println("c1 : " + c1);		//10
		System.out.println("a2 : " + a2);		//100
		System.out.println("c2 : " + c2);		//20
	}
	
}

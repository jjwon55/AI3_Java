package Day06.Ex04_중첩인터페이스;

public class Main {

	public static void main(String[] args) {
		I i = new I();
		
		K k = new K();
		i.setInterface(k);
		i.method();
		System.out.println();
		
		
		I.J j = new K();
		j.methodA();
		j.methodB();
	
	
	}
	
}

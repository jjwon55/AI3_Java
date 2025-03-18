package Day07.Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		//Singleton singleton = new singleton();
		
		Singleton s01 = Singleton.getInstance();
		Singleton s02 = Singleton.getInstance();
		
		
		
		System.out.print("s01 과 s02 가 같은지 여부 : ");
		System.out.println(s01 == s02);
	}
}

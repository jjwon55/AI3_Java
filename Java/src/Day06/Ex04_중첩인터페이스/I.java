package Day06.Ex04_중첩인터페이스;

//아우터 클래스
public class I {

	J j;
	
	public void setInterface(J j) {
		this.j = j;
	}
	
	
	
	
	//중첩인터페이스의 정의
	//
	
	static interface J {
		void methodA();
		void methodB();
	}
	void method() {
		j.methodA();
		j.methodB();
	}
}

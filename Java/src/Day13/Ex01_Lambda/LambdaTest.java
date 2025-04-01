package Day13.Ex01_Lambda;



class Television {
	void volumnUp() {System.out.println("UP");}
	void volumnDown() {System.out.println("DOWN");}
}
interface RemoteControl {
	void volumUp();
	void volumDown();
}
//익명 함수를 위한 함수형 인터페이스 정의
@FunctionalInterface
interface Calculator {
	int calc(int a, int b);
}
public class LambdaTest {

	public static void main(String[] args) {
		//익명 자식 객체
		Television tv = new Television() {

			@Override
			void volumnUp() {
				System.out.println("UP - 자식");
			}

			@Override
			void volumnDown() {
				System.out.println("DOWN - 자식");
			}
			
		};
		
		//익명 구현 객체
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void volumUp() {
				System.out.println("UP - 구현");
			}
			
			@Override
			public void volumDown() {
				System.out.println("DOWN - 구현");
				
			}
		};
		rc.volumUp();
		rc.volumDown();
		
		//익명 구현 객체2
		Calculator cal = new Calculator() {
			
			@Override
			public int calc(int a, int b) {
				return a + b;
			}
		};
		int result1 = cal.calc(10, 20);
		System.out.println("result1 : " + result1);
		
		//익명 함수(람다식)
		Calculator calLambda = (a, b) -> {return a + b;};
		int result2 = calLambda.calc(30, 40);
		System.out.println("result2 : " + result2);
	}
}

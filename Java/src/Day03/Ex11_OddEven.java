package Day03;

public class Ex11_OddEven {

	public static void main(String[] args) {
		int a = 1;
		int sum1 = 0;
		int sum2 = 0;
		
		
		while ( a <= 20) {
			if( a % 2 == 1 )
				sum1 = sum1 + a;
			if( a % 2 == 0 )
				sum2 = sum2 + a;
			a++;
		}
			
			System.out.println("홀수의 합계 : " + sum1);
			System.out.println("짝수의 합계 : " + sum2);
			
	}
}

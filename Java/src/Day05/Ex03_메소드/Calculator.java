package Day05.Ex03_메소드;

/**
 * 1. 덧셈		: 정수 2개를 덧셈
 * 2. 뺄셈		: 정수 인자1 - 정수인자2 연산하는 뺄샘
 * 3. 곱셉		: 실수 2개를 곱샘
 * 4. 나눗셈		: 실수인자 1 / 인자2 연산을 하는 나눗셈
 * 5. 나머지		: 정수 인자 1 % 인자2 연사을 하는 나눗셈
 * 6. 합계		: 배열로 매개변수를 전달받아, 모든 요소의 합계를 구함
 * 7. 평균		: 베열로 매개변수를 전달받아, 모든 요소의 평균을 구함
 * 
 * 메소드명
 * plus minus multiple divide remain sum avg
 */
public class Calculator {
	//덧셈
	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	//뺄셈
	public int minus(int a, int b) {
		int result = a - b;
		return result;
	}
	//곱하기
	public double multiple(double x, double y) {
		double result = x * y;
		return result;
	}
	// 나누기
	public double divide(double x, double y) {
		double result =  x / y;
		return result;
	}
	// 나머지
	public int remain(int a, int b) {
		int result = a % b;
		return result;
	}
	//합계
	public int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	//평균
	public double avg(int[] arr) {
		int sum = sum(arr);
		double avg = (double) sum / arr.length;
		return avg;
		
	}
	
}

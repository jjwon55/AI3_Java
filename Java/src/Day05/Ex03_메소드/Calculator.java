package Day05.Ex03_메소드;

/**
 * 1. 덧셈		: 정수 2개를 덧셈
 * 2. 뺄셈		: 정수 인자1 - 정수인자2 연산하는 뺄샘
 * 3. 곱셉		: 실수 2개를 곱샘
 * 4. 나눗셈
 * 5. 나머지
 * 6. 합계
 * 7. 평균
 */
public class Calculator {

	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public int minus(int a, int b) {
		int result = a - b;
		return result;
	}
	public double multiple(double x, double y) {
		double result = x * y;
		return result;
	}
	public double divide(double x, double y) {
		double result =  x / y;
		return result;
	}
	public int remain(int a, int b) {
		int result = a % b;
		return result;
	}
	
	public int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	public double avg(int[] arr) {
		int sum = sum(arr);
		double avg = (double) sum / arr.length;
		return avg;
		
	}
	
}

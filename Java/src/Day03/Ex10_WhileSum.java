package Day03;

public class Ex10_WhileSum {

	public static void main(String[] args) {
		int a = 1;
		int SUM = 0;
		while ( a <= 1000) {
			SUM += a++;
		//sum = sum + a;
		//sum = sum + a++;
		}
		System.out.println(SUM);
	}
}

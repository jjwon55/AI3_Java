package Day02;

public class Ex05_Long {
	public static void main(String[] args) {
		// int (4bytes : 32bits): 2^32개 : 약 42억개
		// int 수 표햔 범위	:-21억xxx~21억xxx
		
		//long (8bytes : 64bites) : 2^64
		long ln1 = 1000;
		long ln2 = 2100000000;
		long ln3 = 2200000000L;
		//L 을 붙이지 않으면 기본정수는  int 타입으로 인식되어 21억을 표현할 수 없다
		
		
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);
	}
}

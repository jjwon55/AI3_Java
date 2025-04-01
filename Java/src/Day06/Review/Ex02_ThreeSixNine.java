package Day06.Review;

public class Ex02_ThreeSixNine {
	//정수를 1~100까지 수를 반복하여 출력하면서
	//해당 수가 3또는 6 9 가 될때는
	//자리수 마다 369가 되는 개수 만큼 정수 대한
	//*을 출력하는 프로그램을 작성하시오
	//13 * 66 **
	
	
	// 순서도
	// 1. 정수를 1~100 까지 출력
	// 2. 해당 수의 369가 몇 개인지 판단
	//	2-1. 십의자리수가 369인지 여부 판단 (A)
	//  2-1. 일의자리수가 369인지 여부 판단 (B)
	// 3. 369 개수에 따라 출력
	//  A and B --> **
	//  A or B --> *
	//  그 외 --> 정수
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int ten = i / 10;
			int one = i % 10;
			
//			boolean ten369 = (ten != 0 && ten % 3 == 0);
//			boolean one369 = (one != 0 && one % 3 == 0);
			boolean ten369 = ten == 3 || ten == 6 || ten == 9;
			boolean one369 = one == 3 || one == 6 || one == 9;
			
			if (ten369 && one369)  
				System.out.println("**");
			else if (ten369 || one369)
				System.out.println("*");
			else
				System.out.println(i);
			
		}
	}
	
	
	
}

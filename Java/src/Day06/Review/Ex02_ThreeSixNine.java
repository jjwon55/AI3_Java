package Day06.Review;

public class Ex02_ThreeSixNine {
	//정수를 1~100까지 수를 반복하여 출력하면서
	//해당 수가 3또는 6 9 가 될때는
	//자리수 마다 369가 되는 개수 만큼 정수 대한
	//*을 출력하는 프로그램을 작성하시오
	//13 * 66 **
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int ten = 1 / 10;
			int one = i % 10;
			
			boolean ten369 = (ten != 0 && ten % 3 == 0);
			boolean one369 = (one != 0 && one % 3 == 0);
			if (ten369 && one369)  
				System.out.println("**");
			else if (ten369 || one369)
				System.out.println("*");
			else
				System.out.println(i);
			
		}
	}
	
	
	
}

package Day06.Review;

import java.util.Scanner;

/**
 * 우리학원에서 고건우님께서 거액의 예산을 주고
 * 전자앤지를 구매하라고 지시하였다.
 * 이 떄 전자랜지 구매비는 다음과 같이 현듬으로 지급합다.
 * 구매비		: 657862
 * 50000	:13
 * 10000	:0
 * 5000		:1
 * 1000		:2	
 * 500		:1
 * 100		:2
 * 50		:1
 * 10		:1
 * 5		:0
 * 1		:2
 * 위와같이 입력하면, 
 * 큰 화폐단위부터 계산하여, 화폐단위별로 화폐매수를 출력하는 프로그램을 작성하시오.
 */

public class Ex03_화폐매수 {

	public static void main(String[] args) {
		/*
	    순서도
	 	1. 필요한 변수 선언
	 		- (입력금액), (화폐매수), (화폐단위)
	 	2. 구매비 입력
	 	3. 화폐매수 계산
	 		3-1. 화폐매수 계산
	 			(화폐매수) = (입력금액) / (화폐단위)
	 		3-2. 잔액 계산
	 			657862 - (50000 * 13) = 7862
	 			i) (잔액) = (입력금액) - (화폐단위 * 화폐매수)
	 			657862 % 50000 = 7862
	 			ii)(잔액) = (입력금액) % (화폐단위)
	 		3-3. 화폐 단위 변환
	 			번갈아 가면서, /5, /2 연산을 반복
	 			(화폐단위) = (화폐단위) / 5
	 			(화폐단위) = (화폐단위) / 2
	 	4. 3번 과정을 반복
	 		* 조건 : 화폐단위가 1원이 될 때까지
	*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매비 : ");
		int input = sc.nextInt();	//입력금액
		int money = 50000;		//화폐단위
		int count = 0;			//화폐매수
		boolean sw = true;
		while (money >= 1) {
			
			count = input / money;
			System.out.println(money + "\t\t: " + count + "개");
			//input = input - (money * count); 
			input = input % money;
			
			if (sw) 
				// (화폐단위) = (화폐단위) / 5
				money = money / 5;
			 else
				// (화폐단위) = (화폐단위) / 2
				money = money / 2;
			sw = !sw;	
		}
		
		
		
		sc.close();
	}
}

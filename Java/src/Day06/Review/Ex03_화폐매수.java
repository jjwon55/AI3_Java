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
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매비 : ");
		int input = sc.nextInt();
		int money = 50000;		//단위
		int count = 0;			//매수
		boolean sw = true;
		while (money >= 1) {
			
			count = input / money;
			System.out.println(money + "\t\t: " + count + "개");
			//input = input - (money * count); 
			input = input % money;
			
			if (sw) 
				money = money / 5;
			 else
				money = money / 2;
			sw = !sw;	
		}
		
		
		
		sc.close();
	}
}

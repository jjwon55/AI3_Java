package Day06.Review;

import java.util.Scanner;

public class Ex01_Multiple {

	//프로그햄 시작시 제일 먼저 실행되는 메소드
	public static void main(String[] args) {
		//3의 배수 여부를 출력하는 메소드
		//3의 배수O 	: 3의 배수입니다
		//      X	: 3의 배가 아닙니다
		
		// 1. 정수 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int a = sc.nextInt();
		// 2. 3의 배수인지 판단
		if ( a % 3 == 0 ) {
			System.out.println(" 3의 배수입니다. ");
		} else {
				System.out.println("3의 배수가 아닙니다.");
			
			sc.close();
		}
		
		
		
	}
}

package Day03;

import java.util.Scanner;

public class Ex08_SwitchYield {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String result = switch (num % 5) {
		// 반환값만 지정하는 경우, yield 생략하고 -> 사용가능
			case 0, 1 -> "*"; //yield 생략
			default -> {
				System.out.println("별 2개");
				// 블록의 실행문이 여러 줄이 경우 yield 필수
				// yield 반환값;
			yield "**";
			}
		};
		System.out.println(result);
		
		sc.close();
				
	}

}

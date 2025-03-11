package Day02;

import java.util.Scanner;

//ctrl + shift + o  한번에 import
public class Ex09_Circle {

		public static void main(String[] args) {
			//final 상수 선언
			// 선언 후에 값을 변경하면 에러가 발생한다.
			// 반드시 값을 초기화 해야 한다.
			final double PI = 3.141592;
			Scanner sc =  new Scanner(System.in);
			
			System.out.print("반지름 : ");
			double radius = sc.nextDouble();
			double area = PI * radius * radius;
			System.out.println("원의 넓이 : " + area);
			sc.close();
			
		}
}

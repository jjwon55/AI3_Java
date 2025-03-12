package Day03;

import java.util.Scanner;

public class Ex04_Nested {

	public static void main(String[] args) {
		//응시자격 대학 4년
		//점수 60점 이상
		
		Scanner sc = new Scanner(System.in);
		//System.out.print("학년 : ");
		//int year = sc.nextInt();
		//System.out.print("점수 : ");
		//int score = sc.nextInt();
		
		// 조건문을 중첩하지 않고 조건을 작성할 수 있다면,
		// 중첩되지 않은 형태로 작성하는 것을 권장한다.
		
		
		
		
		// 응시자격이 있는 경우에만 점수 입력받기
		System.out.print("학년 : ");
		int 학년 = sc.nextInt();
		if(학년 != 4) {
			System.out.println("응시자격이 없습니다.");
			return;
		}
		
		System.out.print("점수 : ");  
		int 점수 = sc.nextInt();
		if (점수 >= 60) System.out.println("합격");
		else System.out.println("불합격");
		
	sc.close();
	
	}
}

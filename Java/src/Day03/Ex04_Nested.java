package Day03;

import java.util.Scanner;

public class Ex04_Nested {

	public static void main(String[] args) {
		//응시자격 대학 4년
		//점수 60점 이상
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학년 : ");
		int year = sc.nextInt();
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		
		
		
		if ( year == 4 && score >= 60 ) {
			System.out.println("합격");
		}  else if ( year == 4 ) {
			System.out.println("불합격");
		} else {
			System.out.println("응시자격이 없습니다.");
		}
		
		
		if (year != 4) {
			System.out.println("응시자격이 없습니다.");
		} else if ( score >= 60 ) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		//
	
		
	sc.close();
	
	}
}

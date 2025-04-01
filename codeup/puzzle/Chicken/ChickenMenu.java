package Chicken;

import java.util.Scanner;

public class ChickenMenu {

	public static void main(String[] args) {
		int menuNo = 0;
		String name = "";
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("********치킨 메뉴판********");
			System.out.println("1. 황금올리브 반반한 치킨");
			System.out.println("2. 뿌잉크 치킨");
			System.out.println("3. 처갓집에서 호식이가 만든 치킨");
			System.out.println("0. 종료");
			System.out.print("*********번호 : ");
			menuNo = sc.nextInt();
			if (menuNo == 0) {break;}
			
			switch (menuNo) {
			case 1: name = "황금올리브 반반한 치킨"; break;
			case 2: name = "뿌잉크 치킨"; break;
			case 3: name = "처갓집에서 호식이가 만든 치킨"; break;

			default:
				break;
			}
			
			if (menuNo >= 0 && menuNo <= 3) {
				count++;
				System.out.println( name + "(이/가) 주문되었습니다.");
			} else {
				System.out.println("(0~3)번 사이의 번호를 입력해주세요");
			}
				System.out.println();
		} while (menuNo != 0);
		
		System.out.println("총 " + count + " 개의 상품이 주문되었습니다.");
	}
}

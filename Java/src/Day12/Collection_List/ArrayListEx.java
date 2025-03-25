package Day12.Collection_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		//Array 
		ArrayList<String> shoppingCart = new ArrayList<String>();
		
		//add() : 요소 추가
		shoppingCart.add("아웃백 외식상품권 100만원");
		shoppingCart.add("신세계백화점 상품권 50만원");
		shoppingCart.add("빽햄 500개");
		//반복출력
		System.out.println(":::::장바구니 목록:::::");
		for (String item : shoppingCart) {
			System.out.print(item);
		}
		//add(index)
		shoppingCart.add(1, "삼성 갤럭시 북");
		shoppingCart.add(2, "아이패드 미니");
		System.out.println("::::: 위치에 요소 추가 :::::");
		System.out.println(shoppingCart);
		//요소 제거
		boolean deleted = shoppingCart.remove("아이패드 미니");
		System.out.println("::::: 요소 제거 :::::");
		System.out.println("제거 여부 : " + deleted);
		//요소접근
		String item = shoppingCart.get(2);
		System.out.println("세 번째 아이템 : " + item);
				
		//요소 접근
		boolean hasGalaxyBook = shoppingCart.contains("삼성 갤럭시 북");
		if (hasGalaxyBook) {
		 System.out.println("갤럭시 북이 있습니다.");	
		} else System.out.println("갤럭시 북이 없습니다.");
		
		//모든 요소 제거
		shoppingCart.clear();
		System.out.println("::::모든 요소 제거::::");
		System.out.println(shoppingCart);
		
		System.out.println("가지고 싶은 물건 5가지 입력하기");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			String prouduct = sc.nextLine();
			shoppingCart.add(prouduct);
		}
		//반복1 - for
		System.out.println("반복1 - for");
		for (int i = 0; i < shoppingCart.size(); i++) {
			System.out.print(shoppingCart.get(i) + " ");
		}
		System.out.println();
		System.out.println("------------------------------");
		//반복2 - foreach
		System.out.println("반복2 - foreach");
		for (String product : shoppingCart) {
			System.out.print(product + " ");
		}
		System.out.println();
		System.out.println("------------------------------");
		//반복3 - Iterator (for)
		System.out.println("반복3 - Iterator (for)");
		for (Iterator iterator = shoppingCart.iterator(); iterator.hasNext();) {
		    String one = (String) iterator.next();
		    System.out.print(one + " ");
		}
		System.out.println();
		System.out.println("------------------------------");

		// 반복4 - Iterator (while)
		// * while - ctrl + space 2번 옵션
		System.out.println("반복4 - Iterator (while))");
		Iterator<String> it = shoppingCart.iterator();
		while (it.hasNext()) {
		    String one = (String) sc.next();
		    System.out.print(one + " ");
		}
		
		System.out.println();
		System.out.println("------------------------------");
		
		sc.close();
	}
	
}

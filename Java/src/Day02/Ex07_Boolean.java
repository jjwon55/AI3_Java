package Day02;

import java.util.Scanner;

public class Ex07_Boolean {
	
	public static void main(String[] args) {
	
		
	boolean cheak1 = false;
	boolean cheak2 = true;
	
	Scanner sc = new Scanner(System.in); 
	boolean on = sc.nextBoolean();		//논리값(true,false)를 입력받는 메소드
	
	System.out.println("on : " + on);
	
	if( on ) {
		System.out.println("전원 ON");
		
	}
	else {
		 System.out.println("전원 OFF");
	}
	sc.close();
		
	}
}

package _1295;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] charArray = str.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			char h = charArray[i];
			if (Character.isUpperCase(h)) {
				charArray[i] = Character.toLowerCase(h);
				
			} else {
				charArray[i] = Character.toUpperCase(h);
			}
		}
		for (char c : charArray) {
			System.out.print(c);
			
		}
	}
}

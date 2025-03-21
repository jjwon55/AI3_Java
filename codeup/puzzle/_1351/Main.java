package _1351;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int a = sc.nextInt();
		System.out.print("");
		int b = sc.nextInt();
		
		for (int i = a; i <= b; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j );
			}
		}
		sc.close();
	}
}

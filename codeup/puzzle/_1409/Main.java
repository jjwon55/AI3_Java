package _1409;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			 a[i] = sc.nextInt();
		}
		System.out.print("");
		int b = sc.nextInt();
		int result = b - 1;
		System.out.print(a[result]);
	}
}

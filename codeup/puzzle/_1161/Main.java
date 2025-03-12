package _1161;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a % 2 == 1) {
			System.out.print("홀수+");
		} else {
			System.out.print("짝수+");
		}
		if (b % 2 == 0) {
			System.out.print("짝수=");
		} else {
			System.out.print("홀수=");
		}
		if ((a + b) % 2 == 1) {
		System.out.print("홀수");
		} else {
		System.out.print("짝수");
	}
	}
}

package _1156;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if ( num % 2 == 1) {
		 System.out.println("odd");
		} else {System.out.println("even");
		}
		sc.close();
	}
}
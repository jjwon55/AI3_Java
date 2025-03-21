package _1126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int a = sc.nextInt();
		System.out.print("");
		int b = sc.nextInt();
		System.out.println(Integer.toString(a) + " + " + Integer.toString(b) +  " = " + (a + b));
		System.out.println(Integer.toString(a) + " - " + Integer.toString(b) +  " = " + (a - b));
		System.out.println(Integer.toString(a) + " * " + Integer.toString(b) +  " = " + (a * b));
		System.out.println(Integer.toString(a) + " / " + Integer.toString(b) +  " = " + (a / b));
		System.out.println(Integer.toString(a) + " % " + Integer.toString(b) +  " = " + (a % b));
	}
}

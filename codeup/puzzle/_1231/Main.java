package _1231;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int a = sc.nextInt();
		String x = sc.next();
		int b = sc.nextInt();
		double z = (double) a / b;
		
		switch (x) {
		case "+": System.out.print( a + b);
		break;
		case "/": 
			if (a == 0 || b == 0) { break;
			} else System.out.printf("%.2f", z );
		break;
		case "-": System.out.print( a - b);
		break;
		case "*": System.out.print( a * b);
		break;
		default:
			break;
		}
		sc.close();
	}
}

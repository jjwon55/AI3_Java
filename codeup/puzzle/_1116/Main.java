package _1116;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int a = sc.nextInt();
		System.out.print("");
		int b = sc.nextInt();
		System.out.println(a + b);           
        System.out.println(a - b);           
        System.out.println(a * b);          
        System.out.println(a / b);          
        System.out.println(a % b);           
        System.out.printf("%.2f\n", (double) a / b); 

        sc.close();
	}
}

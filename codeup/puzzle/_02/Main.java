package _02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int n = sc.nextInt();
		int a = 1;
		int odd = 0;
		int even = 0;
		
		StringBuilder os = new StringBuilder();
		
	if (1 <= n && n <= 100) {
		for (int i = 1; i <= n; i++) {
			if(i % 2 == 1) {
			odd += i;	
			os.append(i + "+");}}
			int length = os.length();
			os.replace(length-1, length, "");
			System.out.print(os + "=" + odd);
			
			System.out.println();
		StringBuilder es = new StringBuilder();
		for (int j = 1; j <= n; j++) {
			if(j % 2 == 0) {
			even += j;	
			es.append(j + "+");}}
			int esl = es.length();
			es.replace(esl-1, esl, "");
			System.out.print(es + "=" + even);
			System.out.println();
			
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					System.out.print(i + " ");
				}
			}
			
			sc.close();
		}
	}
}

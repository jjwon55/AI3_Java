package _08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int a = sc.nextInt();
		int arr[][] = new int[a][a];
		int b = 1;
		
		for (int i = 0; i < a; i++) {
			if (i % 2 == 0) {
			for (int j = 0; j < a; j++) {
				arr[i][j] = b;
				b++;}
			} else {
				for (int j = a-1; j >= 0; j--) {
					arr[i][j] = b;
					b++;		
				}
			}
		} 
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}

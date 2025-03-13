package _1402;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" ");
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = a - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
	
}

package _1508;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int a = sc.nextInt();
		int arr[][] = new int[a][];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = sc.nextInt(); 
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				arr[i][j] = arr[i][j - 1] - arr[j - 1][i];
			}
		}
				
		for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) 
					System.out.print(arr[i][j] + " ");
				System.out.println();
		}
		
		sc.close();
		//arr[0] = new int[1]
		//arr[1] = new int[2]
	}
}

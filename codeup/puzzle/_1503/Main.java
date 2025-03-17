package _1503;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int a = sc.nextInt();
		int arr[][] = new int [a][a];
		 
		int x = 1;
		boolean sw = true;
		for (int i = 0; i < arr.length; i++) {
			if (sw)
				for (int j = 0; j < arr.length; j++) 
					arr[i][j] = x++;
				
			if (!sw)
			for (int j = a -1; j >= 0; j--) 
				arr[i][j] = x++;
				
			sw = !sw;	
			
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
		sc.close();
	}
	
}


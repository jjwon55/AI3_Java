package _1226;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lotto[] = new int [7];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = sc.nextInt();
		}
		
		int arr[] = new int [6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int count  = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (lotto [j] == arr[i]) {
					count++;
				}
			}
		}
		
		int bounus = 0;
		for (int i = 0; i < arr.length; i++) {
			if (lotto [6] == arr[i]) {
			bounus++;
			}
		}
		if (count == 0) { System.out.print("0");}
		else if (count == 1) { System.out.print("0");}
		else if (count == 2) { System.out.print("0");}
		else if (count == 3) { System.out.print("5");} 
		else if (count == 4) { System.out.print("4");} 
		else if (count == 5 && bounus == 0) { System.out.print("3");} 
		else if (count == 5 && bounus == 1) { System.out.print("2");} 
		else if (count == 6) { System.out.print("1");}
		
		
	}
}

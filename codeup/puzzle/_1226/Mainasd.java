package _1226;

import java.util.Scanner;

public class Mainasd {

	
	public static void main(String[] args) {
		int lotto[] = new int[7];
		
		for (int i = 0; i < 7; i++) {
			int random = (int)(Math.random() * 45 + 1);
			lotto[i] = random;
				for (int j = 0; j < i; j++) {
					if( lotto[j] == random ) {
						i--;
					}
				}
			}
			
			for (int i = 0; i < lotto.length - 2; i++) {
				for (int j = i+1; j < lotto.length; j++) {
					if( lotto[i] > lotto[j] ) {
						int temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}
				}
			}
			
			for (int i : lotto) {
				System.out.print(i + " ");
			}
			System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int arr[] = new int[6];
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
				bounus++;}
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
package _07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int array[] = new int[5];
		 for (int i = 0; i < array.length; i++) {
			 array[i] = sc.nextInt();
		}
		//선택정렬 오름차순
		 for (int i = 0; i < array.length - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[j] < array[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            if (minIndex != i) {
	                int temp = array[i];
	                array[i] = array[minIndex];
	                array[minIndex] = temp;
	            }
	        }
		 for (int i : array) {
			System.out.print(i + " ");
		 }
		 System.out.println();
		 //내림차순
		 for (int i = 0; i < array.length - 1; i++) {
			 int maxIndex = i;
			 for (int j = i + 1; j < array.length; j++) {
				 if (array[j] > array[maxIndex]) {
					 maxIndex = j;
				 }
			 }
			 
			 if (maxIndex != i) {
				 int temp = array[i];
				 array[i] = array[maxIndex];
				 array[maxIndex] = temp;
			 }
		 }
		 for (int i : array) {
			 System.out.print(i + " ");
		 }
		sc.close();		
	}
}


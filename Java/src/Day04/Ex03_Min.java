package Day04;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하시오 : ");
		int a = sc.nextInt();
		int arr[] = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if( min > arr[i] ) {
				min = arr[i];
		}
	}
		System.out.println("최솟값 : " + min);
		sc.close();
}
}
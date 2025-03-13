package Day04;

import java.util.Scanner;

public class Ex02_Max {

	public static void main(String[] args) {
		// 첫번째 줄에 입력할 개수 n을 입력받고 
		// 두번째 줄에 n개의 정수를 공백을 두고입력받으시오
		//n 개의 정수 중 최댓값을 구하시오
		//입력
		//90 60 70 100 55
		//출력
		//100
		/**순서도
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하시오 : ");
		int a = sc.nextInt();
		int arr[] = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//int의 최솟값
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if( max < arr[i] ) {
				max = arr[i];
		}
	}
		System.out.println("최댓값 : " + max);
		sc.close();
}
}
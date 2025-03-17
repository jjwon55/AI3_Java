package Day06.Review;

import java.util.Iterator;
import java.util.Scanner;

public class Ex05_Matrix {

	public static void main(String[] args) {
		// 양의 정수 m 과 n을 입력받아 저장하고
		// m핼 n열 2차원 배열을 생성한다.
		// 각 요소의 값을 입력박고, 그대로 출력하시오
		//m 2
		//n 3
		//123
		//456
		//출력예시
		//123
		//456
		
		Scanner sc = new Scanner(System.in);
		System.out.print("M : ");
		int M = sc.nextInt();
				System.out.print("N : ");
		int N = sc.nextInt();
		
		int arr[][] = new int[M][N];
				
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
		}
			System.out.println();
	}
		System.out.println("-----------------------------");
		for (int[] row : arr) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}

package Day08.Ex01_TryCatch;

import java.util.Scanner;

public class IndexOutOfBound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 요소의 개수 : ");
		int N = sc.nextInt();
		int[] arr = new int [N];  //n개의 배열 요소를 갖는 배열 생성
		
		System.out.print("접근할 index : ");
		int index = sc.nextInt();
		System.out.print("입력할 값 : ");
		int input = sc.nextInt();
		
		//ArrayIndexOutOfBoundsException
		//배열의 index 범위를 초과하여 접근하는 경우
		try {
			arr[index] = input;
			System.out.println("arr[" + index + "] : " + arr[index]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 index의 범위를 초과하여 접근하였습니다.");
			System.err.println("(0~" + (N-1) + ") 사이의 정수를 범위에서 입력해주세요.");
		}
		
		sc.close();
		
		
		
		
	}	
	
}

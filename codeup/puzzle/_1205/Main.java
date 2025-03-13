package _1205;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
			int a = sc.nextInt();
			int b = sc.nextInt();
		double arr[];	
		arr = new double[10];
		
		arr[0] = a + b; arr[1] = b + a;
		arr[2] = a - b; arr[3] = b - a;
		arr[4] = a * b; arr[5] = b * a;
		arr[6] = a / b; arr[7] = b / a;
		arr[8] = Math.pow(a, b);  // a의 b제곱
        arr[9] = Math.pow(b, a);  // b의 a제곱
		
		double max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if( max < arr[i] ) {
				max = arr[i];
					
			
			
	}
		
}
		System.out.printf("%.6f", max);
		sc.close();
}
}
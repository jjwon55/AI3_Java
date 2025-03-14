package _1355;

	import java.util.Scanner;
	
	public class Main {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print(" ");
			int n = sc.nextInt();
			
			for (int i = n; i >= 1; i--) {
				
				for (int k = 0; k > i; k++) {
					System.out.print(" ");
				}
				
				for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			sc.close();
		}		
	}

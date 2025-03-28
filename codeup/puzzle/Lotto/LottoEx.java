package Lotto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LottoEx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임? : ");
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			System.out.print("[" + i + " 게임" + "] : ");
			Set<Integer> b = new HashSet<Integer>();
			while (b.size() < 6) {
				int rand = (int) (Math.random() * 45 + 1);
				b.add(rand);
			}
			b.stream()
			.sorted()
			.forEach(lotto -> System.out.print(lotto + " "));
			System.out.println();
			
		}
		sc.close();
	}
	
	
	
	
	
}
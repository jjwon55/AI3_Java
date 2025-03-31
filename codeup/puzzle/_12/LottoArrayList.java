package _12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LottoArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임? ");
		int n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			System.out.print("[" + i + " 게임] : ");
			ArrayList<Integer> lotto = new ArrayList<Integer>();
			for (int j = 0; j < 6; j++) {
				int rand = (int)(Math.random() * 45 + 1);
				if (lotto.contains(rand)) 
					j--;
					else lotto.add(rand);
			}
			Collections.sort(lotto);
			for (Integer integer : lotto) {
				System.out.print(integer + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}

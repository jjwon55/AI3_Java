package _1226;

public class Main {

	
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
			
			for (int i = 0; i < lotto.length; i++) {
				System.out.print( lotto[i] + " ");
			}
			System.out.println("");
		
			
			
	}
}
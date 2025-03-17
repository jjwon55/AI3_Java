package Day06.Review;

public class Ex04_Lotto {

	//Math.random() : 0.xxxxx ~ 0.9xxxxx
	
	public static void main(String[] args) {
		double random = Math.random();
		System.out.println(random);
		//(int) (Math.random() * 10)
		//(int) (Math.random() * 10) + 1
		System.out.println("1~10 : " + ((int) (Math.random() * 10) + 1));
		int dice = (int) (Math.random() * 6) + 1;
		
		System.out.println("주사위 : " + dice);
		
		System.out.println("1~20 : " + ((int) (Math.random() * 20) + 1));
		System.out.println("-20~20 : " + ((int) (Math.random() * 41) - 20));
		
		int lotto[] = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = i - 1; j >= 0 ; j--) {
				if (lotto[i] == lotto[j]) {
					lotto[i] = (int) (Math.random() * 45) + 1;
				}
			}
		}
		for (int i : lotto) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
}

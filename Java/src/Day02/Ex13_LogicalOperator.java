package Day02;

public class Ex13_LogicalOperator {

	public static void main(String[] args) {

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println();
		
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println(); 
		
		
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		
		int value1 = 3;
		System.out.println(false && ++value1 > 10);
		System.out.println("value : " + value1);
		
		int value2 = 3;
		System.out.println(false || ++value2 > 10);
		System.out.println("value2 : " + value2);
		
		int value3 = 3;
		System.out.println(true || ++value3 > 10);
		System.out.println("value4 : " + value3);
		
		int value4 = 3;
		System.out.println(true || ++value4 > 10);
		System.out.println("value4 : " + value4);
		
		int i = 10;
		int j = 2;
		System.out.println(i & j);
		System.out.println(i | j);
		
		
	}

}

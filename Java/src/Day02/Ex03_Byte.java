package Day02;

public class Ex03_Byte {
	public static void main(String[] args) {
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = (byte) (128);		//강제형변환
		// (에러)
		// -에러 메시지: type missmatch
		// - 자료형(타입이)이 불일치, 데이터 범위 벗어남(overflow)
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
	}
}

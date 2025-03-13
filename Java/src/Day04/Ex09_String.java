package Day04;

public class Ex09_String {

	public static void main(String[] args) {
		// String은 참조 자료형
		// 문자열과 한 글자씩 그 자체를 비교할 대는 equals 사용
		
		//문자열 사용 방법
		// 문자열과 리터럴"" 로 지정
		// 문자열 객채 생겅
		
		
			String a = "Hello"; 
			String b = "Java"; 
			String c = "Hello"; 
			
			String d = new String("Hello"); 
			String e = new String("Java"); 
			String f = new String("Java"); 
			
			System.out.println("a == c : " + (a == c));
			System.out.println("a == d : " + (a == d));
			System.out.println("문자열 비교 : " + a.equals(d));
			
			System.out.println("e == f : " + (e == f));
			System.out.println("문자열 비교 : " + e.equals(f));
			
	}
}

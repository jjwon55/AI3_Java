package Day05.Ex02_생성자;

public class Main {

	public static void main(String[] args) {
		
		//student2 객체 생성
		Student student2 = new Student("이준영" , 28, "20190001", "체육교육과");
		//student2.name = "이준영";
		//student2.age = 28;
		//student2.major = "체육교육과";
		//student2.stNo = "20190001";
		
		System.out.println("-------학생3-------");
		System.out.println("학생3 - 이름 : " + student2.name);
		System.out.println("학생3 - 나이 : " + student2.age);
		System.out.println("학생3 - 전공 : " + student2.major);
		System.out.println("학생3 - 학번 : " + student2.stNo);
		student2.study("축구");
		System.out.println("학생3 - 중간고사 점수 : " + student2.getAverage(100, 90));
		System.out.println();
		
		Student student3 = new Student("윤홍민" , 25);
		
		System.out.println("-------학생3-------");
		System.out.println("학생3 - 이름 : " + student3.name);
		System.out.println("학생3 - 나이 : " + student3.age);
		System.out.println("학생3 - 전공 : " + student3.major);
		System.out.println("학생3 - 학번 : " + student3.stNo);
		student3.study("축구");
		System.out.println("학생3 - 중간고사 점수 : " + student3.getAverage(100, 90));
		System.out.println();
	
		int scores3[] = {100,80,70,65,95};
		System.out.println("학생3 - 최종점수 : " + student3 );
	
	
	
	}
}

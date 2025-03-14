package Day05.Ex02_생성자;

import java.util.Iterator;

//학생
// 변수 이름 나이 학번 전공
//메소드 공부하기 성저 평균구하기
public class Student {

	
		 String name;
		 int age;
		 String stNo;
		 String major;
		 
		 //생성자
		 // alt shift s -> o
		 //Todo 기본생성자
		 public Student() {
			 name = "이름없음";
			 age = 0;
			 stNo = "00000000";
			 major = "전공없음";
			 
		 }
		 
		 public Student(String name, int age) {
			this.name = name;
			this.age = age;
			stNo = "00000000";
			major = "전공없음";
		}

		// Todo: 매개변수가 있는 생성자
		 public Student(String name, int age, String stNo, String major) {
			 this.name = name;
			 this.age = age;
			 this.stNo = stNo;
			 this.major = major;
		 }
		 
		//메소드
		//접근 지정자 반환타입 메소드명(매개변수){}
		//공부하기
		//void : 반환타입 없음 reture 생략가능
		//void 로 지정해도 return 을 메소드를 종료시키는 용도로 사용 가능
		 
		 
		 
		public void study(String subject) {
			System.out.println(subject + "(을/를) 공부합니다.");
		}


		public double getAverage(int score1, int score2) {
			double average = 0.0;
			average = (double) (score1 + score2) /2;
			return average;
		}
		public double getAverage(int score1, int score2, int score3) {
			double average = 0.0;
			average = (double) (score1 + score2 + score3) /3;
			return average;
		}
		public double getAverage(int[] scores) {
			double average = 0.0;
			int sum = 0;
			for ( int score : scores) {
				sum += score;
				
			}
			average = (double) sum / scores.length;
			return average;
		}
		
		 
}

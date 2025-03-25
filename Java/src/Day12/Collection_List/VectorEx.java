package Day12.Collection_List;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		
		Vector<String> studentList = new Vector<String>();
		
		//add() : 요소추가
		studentList.add("고건우");
		studentList.add("장예지");
		studentList.add("구본걸");
		studentList.add("배은주");
		studentList.add("김조은");
		
		System.out.println("::::: 학생목록 :::::");
		System.out.println(studentList);
		System.out.println("---------------------");
		//remove() : 요소제거
		studentList.remove("배은주"); //객체 요소(인스턴스)로 제거
		studentList.remove(1); //index로 제거
		//get() : 요소 접근
		String firstStudent = studentList.get(0);
		String secondStudent = studentList.get(1);
		System.out.println("첫 번째 학생 : " + firstStudent);
		System.out.println("두 번째 학생 : " + secondStudent);
		//size() : 요소 개수
		int size = studentList.size();
		System.out.println("남은 학생수 : " + size);
		//clear() : 모든 요소 제거
		studentList.clear();
		System.out.println("::::::모든 요소 제거::::::");
		System.out.println(studentList);
		System.out.println("-----------------------");
		//addAll() : 요소 전체 추가
		Vector<String> 야근반 = new Vector<String>();
		야근반.add("서성재");
		야근반.add("전주원");
		야근반.add("이윤태");
		studentList.addAll(야근반);
		
		System.out.println("::::::: 요소 전체 추가::::::");
		for (int i = 0; i < studentList.size(); i++) {
			String student = studentList.get(i);
			System.out.print(student);
			if (i < studentList.size()) 
				System.out.println(" ");
			}
		System.out.println();
		for (String student : 야근반) {
			System.out.println(student + " ");
		}
		
		Vector<String> 오전반 = new Vector<String>(야근반);
		for (String student : 오전반) {
			System.out.println(student + " ");
		}
		System.out.println();
		
		
	}
	
}

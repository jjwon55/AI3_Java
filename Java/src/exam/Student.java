package exam;

public class Student {

	int no;
	String name;
	int score;
	String className;
	
	
	public Student(int no, String name, int score, String className) {
		this.no = no;
		this.name = name;
		this.score = score;
		this.className = className;
	}

	
	
	
	public int getScore() {
		return score;
	}




	public void setScore(int score) {
		this.score = score;
	}




	@Override
	public String toString() {
		return no + " " + name + " " + score + " " + className ;
	}
	
	
}

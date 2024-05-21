package homework.homework14.middle;

//1. int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고
//List<Student> studentList에
//(1, 홍길동, 100), (2, 임꺽정, 75), (3, 장길산, 86), (4, 정도전, 97), (5, 이순신, 95)를 저장하고
//Stream으로 변환하여 점수가 95점 이상인 학생만 들어있는 Stream을 만드세요.

//2. 1번에서 만든 Stream에 grade가 A+로 저장된 새로운 Stream을 만들어서 출력하세요.
public class Student {
	private int sno;
	private String sName;
	private int score;
	private String grade;
	
	public Student(int sno, String sName, int score) {
		this.sno = sno;
		this.sName = sName;
		this.score = score;
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getGrade(int score) {
		if(score >= 95)
			return "A+";
		else if(score >= 90)
			return "A";
		else if(score >= 80)
			return "B";
		else if(score >= 70)
			return "C";
		else
			return "D";
	}
	
	
	public void printStdInfo() {
		System.out.println("학번: " + this.sno);
		System.out.println("이름: " + this.sName);
		System.out.println("점수: " + this.score);
		System.out.println("성적: " + getGrade(this.score));
	}
	
}

package homework.homework5.advance;

public class MathStudent extends CommonStat implements Student {
	
	public MathStudent(int sno, String name) {
		super(sno, name);
	}

	@Override
	public void saveInfo(int index, String subject, int score) {
		if(this.subject.length < index || this.finalExamScore.length < index)
			return;
		
		this.subject[index] = subject;
		this.finalExamScore[index] = score;
	}

	@Override
	public void printInfo() {
		System.out.println("학번: " + this.sno);
		System.out.println("이름: " + this.name);
		
		for(int i = 0;i < subject.length; i++) {
			System.out.println("과목: " + subject[i]);
		}
		
		for(int i = 0;i < finalExamScore.length; i++) {
			System.out.println("기말고사 성적: " + finalExamScore[i]);
		}
		
	}

	@Override
	public double getAvg() {
		double sum = 0;
		
		for(double i : finalExamScore) {
			sum += i;
		}
		
		return sum / finalExamScore.length;
	}

}

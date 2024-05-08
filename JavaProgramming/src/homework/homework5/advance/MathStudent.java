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
		
		for(int i = 0; i < subject.length; i++) {
			System.out.println("과목: " + subject[i]);
		}
		
		for(int i = 0; i < finalExamScore.length; i++) {
			System.out.println("기말고사 성적: " + finalExamScore[i]);
		}
		
	}

	@Override
	public double getAvg() {
		double sum = 0;
		
		for(double i : finalExamScore) {
			sum += i;
		}
		
		return sum / finalExamScore.length; // avg = (double)Math.round(((double)sum / this.finalExam.length * 100) / 100;
											// Math.round -> 반올림하는 메서드지만 long 값으로 나오기 때문에 소숫점 자리를 남기려면 100 곱했다 나누는 과정 필요
	}

}

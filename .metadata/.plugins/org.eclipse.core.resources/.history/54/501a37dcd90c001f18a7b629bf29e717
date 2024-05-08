package homework.homework6.advance;

public class PrintStudentRank {
	// 학과별 배열을 만들어주는 메소드
	public void makMajorArr(Student[] stArr) {
		// 학과별로 새로운 배열 생성
		
		int mathIndex = 0;
		int engIndex = 0;
		int comIndex = 0;
		
		for(int i = 0; i < stArr.length; i++) {
			if(stArr[i].getMajor().equals("수학")) {
				mathIndex++;
			} else if(stArr[i].getMajor().equals("영어")) {
				engIndex++; 
			} else if(stArr[i].getMajor().equals("컴공")) {
				comIndex++;
			} 
		}
		
		MathStudent[] mathStudentArr = new MathStudent[mathIndex];
		EngStudent[] engStudentArr = new EngStudent[engIndex];
		ComStudent[] comStudentArr = new ComStudent[comIndex];
		
		
		for(int i = 0; i < stArr.length; i++) {
			if(stArr[i].getMajor().equals("수학")) {
				mathStudentArr[mathIndex++] = (MathStudent)stArr[i];
			} else if(stArr[i].getMajor().equals("영어")) {
				engStudentArr[engIndex++] = (EngStudent)stArr[i]; 
			} else if(stArr[i].getMajor().equals("컴공")) {
				comStudentArr[comIndex++] = (ComStudent)stArr[i];
			} 
		}
		
		// 성적순으로 출력
		printRankArray(mathStudentArr, engStudentArr, comStudentArr);
	}
	
	// 학과별 배열을 성적순대로 정렬하고 출력하는 메소드
	public void majorRank(Student[] stArr, String major) {
		int rank = 0;
		Student[] avgRank = new Student[stArr.length];
		
		for(int i = 0; i < stArr.length; i++) {
			for(int j = stArr.length - 1; j > i; j++) {
				if(stArr[i].getAvg() < stArr[j].getAvg()) {
					rank++;
				}
			}
			
			avgRank[rank] = stArr[i];
		}
		
		for(int k = 0; k < stArr.length; k++) {
			avgRank[k].printInfo();
		}
	}
	
	// 학과별 배열을 모두 받아서 majorRank로 전달하는 메소드
	public void printRankArray(MathStudent[] mathStudentArr, EngStudent[] engStudentArr,
			ComStudent[] comStudentArr) {
		majorRank(mathStudentArr, "수학");
		majorRank(engStudentArr, "영어");
		majorRank(comStudentArr, "컴공");
	}
	
}

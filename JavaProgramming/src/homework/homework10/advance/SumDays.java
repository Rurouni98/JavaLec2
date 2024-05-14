package homework.homework10.advance;
//1. 12달을 상수로 만들어서 enum을 선언하고 첫 번째 값은 평년일 때
//그 달의 일수 두 번째 값은 윤년일 때 그 달의 일수로 설정하고
//사용자가 년도를 입력하면 해당 년도의 1, 2, 3, 4, 5월의 일수의 총합을 출력하는 메소드를 구현하세요.
//sumDays(int year)
public enum SumDays {
	JAN(31, 31),
	FEB(28, 29), 
	MAR(31, 31), 
	APR(30, 30), 
	MAY(31, 31), 
	JUN(30, 30),
	JUL(31, 31), 
	AUG(31, 31), 
	SEP(30, 30), 
	OCT(31, 31), 
	NOV(30, 30), 
	DEC(31, 31);
	
	private int cmYear;
	private int leapYear;
	
	SumDays(int commonYear, int leapYear) {
		this.cmYear = commonYear;
		this.leapYear = leapYear;
	}
	
	public int getCmYear() {
		return cmYear;
	}


	public int getLeapYear() {
		return leapYear;
	}


	public void sumDays(int year) {
		if(year > 0 && year % 400 == 0) 
			System.out.println("총" + JAN.getCmYear() + FEB.getCmYear() + MAR.getCmYear() + APR.getCmYear() + MAY.getCmYear() + "일입니다.");
		 else if(year % 4 == 0 && year % 100 != 0) 
			System.out.println("총" + JAN.getCmYear() + FEB.getCmYear() + MAR.getCmYear() + APR.getCmYear() + MAY.getCmYear() + "일입니다.");
		 else 
			System.out.println("총" + JAN.getLeapYear() + FEB.getLeapYear() + MAR.getLeapYear() + APR.getLeapYear() + MAY.getLeapYear() + "일입니다.");
	}
	
}

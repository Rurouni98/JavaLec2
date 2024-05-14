package homework.homework4.advance;

public class Temporary extends Employee {
	int hireYear;
	
	public Temporary(int eno, String name, int pay, int type, int hireYear) {
		super(eno, name, pay, type);
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		double MonthPay = (double)pay / 12;
		return MonthPay;
	}

	@Override
	public void showEmployeeInfo() {
		// TODO Auto-generated method stub
		System.out.println("해당 회사원의 정보를 표시합니다.");
		showType(type);
		System.out.println("사번: " + eno);
		System.out.println("이름: " + name);
		System.out.println("급여: " + pay);
		System.out.println("월급: " + getMonthPay());
	}
}

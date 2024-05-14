package homework.homework4.advance;

public abstract class Employee {
	int eno;
	String name;
	int pay;
	int type; // 1: 정규직, 2: 계약직, 3: 임시직
	
	public Employee(int eno, String name, int pay, int type) {
		this.eno = eno;
		this.name = name;
		this.pay = pay;
		this.type = type;
	}
	
	public abstract double getMonthPay();
	
	public void showType(int type) {
		if(type == 1) {
			System.out.println("근무형태: 정규직");
		} else if(type == 2) {
			System.out.println("근무형태: 계약직");
		} else if(type == 3) {
			System.out.println("근무형태: 임시직");
		} else {
			System.out.println("근무형태를 알 수 없습니다.");
		}
	}
	
	public void showEmployeeInfo() {
		// TODO Auto-generated method stub
		System.out.println("해당 회사원의 정보를 표시합니다.");
		showType(type);
		System.out.println("사번: " + eno);
		System.out.println("이름: " + name);
		System.out.println("급여: " + pay);
	}
	
}

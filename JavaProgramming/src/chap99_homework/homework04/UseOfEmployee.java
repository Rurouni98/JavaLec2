package chap99_homework.homework04;

import java.util.Scanner;

public class UseOfEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] empArr = new Employee[100];
		
		Scanner sc = new Scanner(System.in);
		
		int eno;
		String name;
		int pay;
		int bonus;
		int hireYear;
		int workDay;
		
		int menuNum;
		int empIndex = 0;
		
		do {
			System.out.print("*** 메뉴 선택 ***\n1. 정규직 저장\n2. 임시직 저장\n3. 계약직 저장\n4. 전체 사원 정보 출력"
					+ "\n5. 월급 계산 출력\n6. 프로그램 종료\n" );
	
			menuNum = sc.nextInt();
	
			switch(menuNum) {
			case 1: case 2: case 3:
				empArr[empIndex++] = generateEmployee(sc, menuNum);
				break;
			
			case 4:
				showAllEmpInfo(empArr);
				break;
			
			case 5:
				System.out.println("검색할 사원의 사번을 입력하세요.");
				int searchNum = sc.nextInt();
			
				searchEmpInfo(empArr, searchNum, empIndex);
				break;
		
			case 6:
				System.out.println("프로그램 종료");
				sc.close();
				System.exit(0);
			
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			System.out.println("----------------------------");
			
		} while(true);
		
		
		/*
		 * *** 메뉴 선택 ***
		 * 1. 정규직 저장
		 * 2. 임시직 저장
		 * 3. 계약직 저장
		 * 4. 전체 사원 정보 출력
		 * 5. 월급 계산 출력
		 * 6. 프로그램 종료
		 *
		 * 1번 선택 시
		 * 사번을 입력하세요.
		 * 1
		 * 이름을 입력하세요.
		 * 홍길동
		 * 급여를 입력하세요.
		 * 3000
		 * 보너스를 입력하세요.
		 * 300
		 * 입력한 내용을 empArr에 저장
		 * 
		 * 2번 선택 시
		 * 사번을 입력하세요.
		 * 2
		 * 이름을 입력하세요.
		 * 임꺽정
		 * 급여를 입력하세요.
		 * 3000
		 * 근무년수를 입력하세요.
		 * 7
		 * 입력한 내용을 empArr에 저장
		 * 
		 * 3번 선택 시
		 * 사번을 입력하세요.
		 * 2
		 * 이름을 입력하세요.
		 * 임꺽정
		 * 급여를 입력하세요.
		 * 20
		 * 근무일수를 입력하세요.
		 * 20
		 * 입력한 내용을 empArr에 저장
		 * 
		 * 4번 선택 시
		 * empArr에 저장되어 있는 모든 사원의 정보출력
		 * showEmployeeInfo() 메소드 사용
		 * 
		 * 5번 선택 시
		 * 검색할 사원의 사번을 입력하세요.
		 * 1
		 * 입력한 사번에 해당하는 사원의 정보 출력(showEmployeeInfo() 메소드 사용)
		 * 
		 * 6번 선택 시
		 * 프로그램 종료
		 * 
		 * 다른 번호가 입력되면
		 * 잘못 입력하셨습니다. 출력하고 다시 입력할 수 있도록 메뉴 표출
		 * */
	}
	
	public static Employee generateEmployee(Scanner sc, int menuNum) {
		System.out.println("사번을 입력하세요.");
		int eno = sc.nextInt();
		System.out.println("이름을 입력하세요.");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("급여를 입력하세요.");
		int pay = sc.nextInt();
		
		if(menuNum == 1) {
			System.out.println("보너스를 입력하세요.");
			int bonus = sc.nextInt();
			
			return new RegularEmployee(eno, name, pay, menuNum, bonus);
		} else if(menuNum == 2) {
			System.out.println("근무년수를 입력하세요.");
			int hireYear = sc.nextInt();
			
			return new TempEmployee(eno, name, pay, menuNum, hireYear);
		} else {
			System.out.println("근무일수를 입력하세요.");
			int workDay = sc.nextInt();
			
			return new ContractEmployee(eno, name, pay, menuNum, workDay);
		}
		
	}
	
	public static void showAllEmpInfo(Employee[] empArr) {
		for(Employee i : empArr) {
			i.showEmployeeInfo();
		}
	}
	
	public static void searchEmpInfo(Employee[] empArr, int searchNum, int empIndex) {
		if(empIndex == 0) {
			System.out.println("입력된 사원의 정보가 없습니다.");
		}
		
		for(int i = 0; i < empIndex; i++) {
			if(empArr[i].getEno() == searchNum) {
				empArr[i].showEmployeeInfo();
			} else {
				System.out.println("입력하신 사번의 사원이 존재하지 않습니다.");
			}
		}
	}

}

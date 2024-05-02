package chap02_variables;

public class _02_ScopeOfVariables {
	// 1. 클래스 변수 선언
	// 클래스 중괄호 안에서 어디서든지 접근가능
	static int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 메소드 지역변수 선언
		int mainNum = 10;
		int sum = 0;
		
		// 3. 조건문의 지역변수
		if(sum == 0) {
			int ifNum = 20;
			sum = mainNum + ifNum;
		}
		
		System.out.println(sum);
		
		// 조건문 중괄호 블록에서 선언된 변수는 밖에서 사용불가능
		//System.out.println(ifNum);
		
		num = 30;
		System.out.println(num);
		
		
		// getSum() 메소드 호출
		getSum();
		
		//getSum 메소드의 지역변수에는 접근할 수 없다.
//		System.out.println(localVal1);
//		System.out.println(localVal2);
//		System.out.println(localResult);
		
		
		
		
		
	}
	
	public static void getSum() {
		// 5. 메소드의 지역변수 선언
		int localVal1 = 50;
		int localVal2 = 60;
		int localResult = localVal1 + localVal2;
		
		num = 100;
		
		System.out.println(localResult + num);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

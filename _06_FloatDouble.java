package chap02_variables;

public class _06_FloatDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. float 타입의 변수 선언 및 초기화
		float fNum1 = 3.14f;
		float fNum2 = 3.14F;
		
		// 2. double 타입의 변수 선언 및 초기화
		double dNum1 = 98.123456;
		double dNum2 = 11.975;
		
		// 3. 실수형 연산은 double로 진행되기 때문에 
		// float 변수끼리 연산을 해도 double로 결과값이 나온다.
		double result = fNum1 + fNum2;
		System.out.println(result);
	}

}

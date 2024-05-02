package chap02_variables;

public class _04_CharType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. char 타입의 변수 선언 및 초기화
		char ch1 = 'A';
		
		// 유니코드 값을 알고 있으면 유니코드값으로 저장가능
		char ch2 = 65;
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		// 2. 유니코드 값을 모르는 문자의 유니코드 값 추출 방법
		char ch3 = '자';
		System.out.println((int)ch3);
		
		int unicode = '자';
		System.out.println(unicode);
		
		// 문자 하나는 작은따옴표로 표시를 하지만
		// 문자열(String이라는 참조형 타입)은 큰 따옴표로 묶어서 표시한다.
		String str = "Java";
		
		// 3. 유니코드에는 완전 빈칸이 없어서 완전 빈칸을 char변수에 담으면 에러발생
//		char ch3 = '';
		// char 타입으로 빈칸을 사용하려면 스페이스 값을 저장해야 한다.
		char ch4 = ' ';
		// 문자열(String)에서는 완전 빈칸을 값을 저장할 수 있다.
		String str1 = "";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

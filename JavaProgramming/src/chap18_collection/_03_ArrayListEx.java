package chap18_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 사용자가 입력한 문자열을 StringBuilder 객체에 저장하고 
		// 길이를 10씩 잘라서 List<StringBuilder>에 저장하고 출력하세요.
		// 1번 문제와 연계해서 풀었지만 강사님은 따로따로 하셨기 때문에 별도 파일에 분리
		// 여기선 List<String>을 대신 사용함
		StringBuilder sb = new StringBuilder();
		
		for(String i : returnStr()) {
			sb.append(i);
		}
		
		List<String> strList = new ArrayList<>();
		
		for(int i = 0; i < sb.length(); i += 10) {
			if(i + 10 < sb.length())
				strList.add(sb.substring(i, i + 10));
			else
				strList.add(sb.substring(i, sb.length()));
		}
		
		System.out.println(strList);
		
	}

	// 1. 사용자가 입력한 5개의 문자열을 List<String>에 저장해서 리턴하는 메소드를 구현하세요.
	public static List<String> returnStr() {
		Scanner sc = new Scanner(System.in);
		List<String> strList = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("문자를 입력해주세요.");
			strList.add(sc.nextLine());
		}
		
		return strList;
	}
}

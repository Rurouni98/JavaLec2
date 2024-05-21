package homework.homework14.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.
public class _02_FiveLengthStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> strList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("문자열을 입력하세요.");
			strList.add(sc.nextLine());
		}
		
		strList.stream()
			   .filter(str -> str.length() >= 5)
			   .forEach(str -> System.out.println(str));
		
		sc.close();
	}

}

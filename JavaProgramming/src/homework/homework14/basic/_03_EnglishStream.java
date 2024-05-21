package homework.homework14.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_EnglishStream {
//	3. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고
//	스트림을 이용해서 문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> strList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("문자열을 입력하세요.");
			strList.add(sc.nextLine());
		}
			
		strList.stream()
			   .map(str -> str.toCharArray())
			   .forEach(ch -> {
				   				for(int i = 0; i < ch.length; i++) {
				   					if(ch[i] >= 'a' && ch[i] <= 'z') {
				   						System.out.println(ch);
				   						break;
				   					}
				   					else if(ch[i] >= 'A' && ch[i] <= 'Z') {
				   						System.out.println(ch);
				   						break;
				   					}
				   					else {
				   						System.out.print("");
				   						continue;
				   					}
			   					}
			   				}
					   );
		sc.close();
	}
}

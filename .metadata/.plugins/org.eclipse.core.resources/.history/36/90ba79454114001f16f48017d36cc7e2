package homework.homework14.middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

//3. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고
//스트림을 이용해서 영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.
public class ConvertChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Character> charList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("영문자를 입력하세요.");
			String userStr = sc.nextLine();
			
			if(userStr.length() > 1) {
				System.out.println("다시 입력해주세요.");
				i--;
				continue;
			}
			
			if(!Pattern.matches("^[a-zA-Z]*$", userStr)) {
				System.out.println("다시 입력해주세요.");
				i--;
				continue;
			}
			
			charList.add(userStr.charAt(0));
		}
		
		charList.stream()
				.forEach(ch -> {
							if(ch >= 'a' && ch <= 'z')
								System.out.println(Character.toUpperCase(ch));
							if(ch >= 'A' && ch <= 'Z')
								System.out.println(Character.toLowerCase(ch));
								});
		
	}

}

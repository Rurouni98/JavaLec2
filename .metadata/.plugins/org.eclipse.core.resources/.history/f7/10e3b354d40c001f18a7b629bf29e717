package homework.homework6.basic;

import java.util.Scanner;

public class RemoveAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳을 입력해주세요.");
		String userStr = sc.nextLine().toLowerCase();
		char[] checkStr = {'a', 'e', 'i', 'o', 'u'};
		
		String newStr = "";
		boolean dup;
		
		for(int i = 0; i < userStr.length(); i++) {
			dup = false;
			
			for(int j = 0; j < checkStr.length; j++) {
				if(userStr.charAt(i) == checkStr[j]) {
					dup = true;
					break;
				}
			}
			
			if(dup == false) {
				newStr += userStr.charAt(i);
			}
		}
		
		System.out.println(newStr);
		
	}
}

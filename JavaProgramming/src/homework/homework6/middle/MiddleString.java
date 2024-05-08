package homework.homework6.middle;

import java.util.Scanner;

public class MiddleString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력해주십시오.");
		String userStr = sc.nextLine();
		
		String newStr = "";
		int userLength = userStr.length();
		
		if(userLength % 2 == 0) {
			newStr += userStr.charAt(userLength / 2 - 1);
			newStr += userStr.charAt(userLength / 2);
			System.out.println(newStr);
		} else {
			newStr += userStr.charAt((userLength - 1) / 2);
			System.out.println(newStr);
		}
		
		
	}

}

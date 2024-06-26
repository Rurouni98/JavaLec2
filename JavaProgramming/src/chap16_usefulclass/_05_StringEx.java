package chap16_usefulclass;

import java.util.Scanner;

public class _05_StringEx {

	public static void main(String[] args) {
		// 사용자가 문자열 두 개 입력하여 str1, str2에 저장
		// str1이 str2를 포함하면 str1에 있는 str2를 빈칸으로 변경해서 출력
		// str1이 str2를 포함하지 않으면 str1에서 str2를 찾을 수 없습니다. 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열1에서 빼고 싶은 문자열2를 입력해주세요.");
		System.out.print("문자열1: ");
		String str1 = sc.nextLine();
		System.out.print("문자열2: ");
		String str2 = sc.nextLine();
		
		if(str1.contains(str2)) {
			System.out.println("결과: " + str1.replace(str2, ""));
		} else {
			System.out.println("문자열1에서 문자열2를 찾을 수 없습니다.");
		}
		
		sc.close();
	}

}

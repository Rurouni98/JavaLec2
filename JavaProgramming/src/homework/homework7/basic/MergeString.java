package homework.homework7.basic;

import java.util.Scanner;

public class MergeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < 3; i++) {
			System.out.println("합칠 문자를 입력해주세요.");
			sb.append(sc.nextLine());
		}
		
		System.out.println("결과: " + sb);
		
		sc.close();
	}

}

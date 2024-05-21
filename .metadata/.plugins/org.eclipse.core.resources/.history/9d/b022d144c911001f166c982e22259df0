package homework.homework7.advance;

import java.util.Scanner;

public class DupRemove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력해주세요.");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		
		for(int i = 0; i < sb.length(); i++) {
			if(i > 0 && sb.charAt(i) == sb.charAt(i - 1)) {
				sb = sb.delete(i, i + 1);
				i--;
			}
		}
		
		System.out.println(sb);
		
	}

}

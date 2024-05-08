package homework.homework7.middle;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		StringBuffer rev = sb.reverse();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int userNum = sc.nextInt();
		
		if(userNum < rev.length()) {
			System.out.println(rev.charAt(userNum));
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
		sc.close();
	}

}

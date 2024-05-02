package homework;

import java.util.Scanner;

public class _01_Advance1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2번 문제 - 일의 자리, 십의 자리 숫자가 0일 경우에는 제대로 출력되지 않아서 틀린 코드
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~99 사이의 정수를 입력해주세요.");
		int num = sc.nextInt();
		
		if(num < 1 || num > 99) {
			System.out.println("1~99 사이의 정수만 입력해주세요.");
		}
		
		int a = (int)(num / 10);
		int b = num - (10 * a);
		
		if((a % 3) == 0 && (b % 3) == 0) {
			System.out.println("박수짝짝");
		} else if((a % 3) == 0 || (b % 3) == 0) {
			System.out.println("박수짝");
		}
		
		sc.close();
	}

}

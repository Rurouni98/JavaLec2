package homework;

import java.util.Scanner;

public class _01_Advance1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번 문제
		Scanner sc = new Scanner(System.in);
	
		System.out.println("금액을 입력해주세요.");
		int money = sc.nextInt();
		int[] moneyArr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] coinArr = new int[8];
		
		for(int i = 0; i < coinArr.length; i++) {
			coinArr[i] = (int)(money / moneyArr[i]);
			money %= moneyArr[i];
		}
		
		System.out.print("<오만원 " + coinArr[0] + "매, ");
		System.out.print("만원 " + coinArr[1] + "매, ");
		System.out.print("오천원 " + coinArr[2] + "매, ");
		System.out.print("천원 " + coinArr[3] + "매, ");
		System.out.print("500원 " + coinArr[4] + "개, ");
		System.out.print("100원 " + coinArr[5] + "개, ");
		System.out.print("50원 " + coinArr[6] + "개, ");
		System.out.print("10원 " + coinArr[7] + "개> 입니다.");
	}
}



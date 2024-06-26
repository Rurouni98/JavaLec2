package chap16_usefulclass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// 사용자가 5개의 정수를 입력하고 배열에 저장
		// 배열에 저장된 정수 5개 중 최대값과 최소값을 구하세요.
		// Math.max와 Math.mix 메소드를 이용하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int[] numArr = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("정수를 입력해주세요.");
			numArr[i] = sc.nextInt();
		}
		
		int maxNum = numArr[0];
		int minNum = numArr[0];
		
		
		for(int i = 0; i < numArr.length; i++) {
			maxNum = Math.max(maxNum, numArr[i]);
			minNum = Math.min(minNum, numArr[i]);
		}
		
		System.out.println("최대값: " + maxNum);
		System.out.println("최소값: " + minNum);
		
		
		sc.close();
	}

}

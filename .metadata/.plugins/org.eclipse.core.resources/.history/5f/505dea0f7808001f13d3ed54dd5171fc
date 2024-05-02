package homework;

import java.util.Random;

public class _01_Middle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번 문제
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				System.out.print(i + ", ");
			}
		}
		
		System.out.println();
		System.out.println("----------------------");
		
		// 3번 문제
		int num = 1;
		while(num <= 10) {
			if(num % 2 == 0) {
				System.out.println(num);
			}
			num++;
		}
		
		System.out.println("----------------------");
		
		// 4번 문제
		int sum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 0 && i % 7 == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		
		System.out.println();
		System.out.println("총합: " + sum);
		
		System.out.println("----------------------");
		
		// 5번 문제
		Random rand = new Random();
		int[] intArr = new int[20];
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = rand.nextInt(101);
		}
		
		System.out.print("홀수번째: ");
		for(int i = 1; i < intArr.length; i += 2) {
			System.out.print(intArr[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("짝수번째: ");
		for(int j = (intArr.length - 1); j >= 0; j -= 2) {
			System.out.print(intArr[j] + " ");
		}
		
		System.out.println();
		System.out.println("----------------------");
		
		// 6번 문제
		// 6-1번
		System.out.println("6-1)");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j > i) {
					System.out.println();
					break;
				}
				System.out.print("*");
			}
		}
		
		System.out.println();
		
		// 6-2번
		System.out.println("6-2)");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i + j < 4) {
					System.out.print(" ");
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 6-3번
		System.out.println("6-3)");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i + j > 4) {
					System.out.print(" ");
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 6-4번
		System.out.println("6-4)");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i <= j) {
					System.out.print("*");
					continue;
				} else {
					System.out.print(" ");					
				}
			}
			System.out.println();
		}
	}

}

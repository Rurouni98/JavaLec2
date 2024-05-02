package homework;

import java.util.Random;
import java.util.Scanner;

public class _01_Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번 문제
		int num = 10;
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(num--);
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(--num);
		
		System.out.println("------------------");
		
		// 2번 문제
		int a = 10; int b = 20;
		System.out.println(a < b);
		System.out.println(a > b);
		
		System.out.println("------------------");
		
		// 3번 문제
		int revNum = 10;
		while(revNum >= 1) {
			System.out.println(revNum);
			revNum--;
		}
		
		System.out.println("------------------");
		
		// 4번 문제
		revNum = 10;
		do {
			System.out.println(revNum);
			revNum--;
		} while(revNum >= 1);
		
		System.out.println("------------------");
		
		// 5번 문제
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		System.out.println("------------------");
		
		// 6번 문제
		num = 1;
		int sum = 0;
		
		while(num <= 100) {
			sum += num;
			num++;
		}
		
		System.out.println(sum);
		
		System.out.println("------------------");
		
		// 7번 문제
		num = 1;
		sum = 0;
		
		do {
			sum += num;
			num++;
		} while(num <= 100);
		
		System.out.println(sum);
		
		System.out.println("------------------");
		
		// 8번 문제
		sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		System.out.println("------------------");
		
		// 9번 문제
		int[] intArr = new int[10];
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = (i + 1) * 3;
		}
		
		for(int j = intArr.length - 1; j >= 0; j--) {
			System.out.println(intArr[j]);
		}
		
		System.out.println("------------------");
		
		// 10번 문제
		Scanner sc = new Scanner(System.in);
		
		int[] intArr2 = new int[10];
		sum = 0;
		System.out.println("10개의 값을 입력해주세요.");
		
		for(int i = 0; i < intArr2.length; i++) {
			System.out.print((i + 1) + "번째 입력값: ");
			intArr2[i] = sc.nextInt();
			sum += intArr2[i];
		}
		
		System.out.println("입력된 값: ");
		for(int j = 0; j < intArr2.length; j++) {
			System.out.print(intArr2[j] + " ");
		}
		
		System.out.println();
		System.out.println("입력된 값의 총합: " + sum);
		

		System.out.println("------------------");
		
		// 11번 문제
		Random rand = new Random();
		
		int[] intArr3 = new int[10];
		
		for(int i = 0; i < intArr3.length; i++) {
			intArr3[i] = rand.nextInt(10) + 1;
		}
		
		for(int j = 0; j < intArr3.length; j++) {
			if(intArr3[j] % 2 != 0) {
				System.out.println(intArr3[j]);
			}
		}
		
		System.out.println("------------------");
		
		// 12번 문제
		Scanner stdIn = new Scanner(System.in);
		
		int[] intArr4 = new int[10];
		System.out.println("정수 10개를 입력해주세요.");
		
		for(int i = 0; i < intArr4.length; i++) {
			System.out.print((i + 1) + "번째 입력값: ");
			intArr4[i] = stdIn.nextInt();
		}
		
		System.out.println("입력된 값 중 2 또는 3의 배수: ");
		for(int j = 0; j < intArr4.length; j++) {
			if(intArr4[j] % 2 == 0 || intArr4[j] % 3 == 0) {
				System.out.println(intArr4[j]);
			}
		}
		

		System.out.println("------------------");
	}
	
}

package homework.homework12.txt1;

import java.util.Scanner;

public class ConvertType {

	public static void main(String[] args) {
//		1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요. 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1을 입력해주세요.");
		String userStr1 = sc.nextLine();
		
		System.out.println("정수2를 입력해주세요.");
		String userStr2 = sc.nextLine();
		
		int userNum1 = Integer.parseInt(userStr1);
		int userNum2 = Integer.parseInt(userStr2);
		
		System.out.printf("두 정수의 합: %d%n", userNum1 + userNum2);
		
//		2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)
		System.out.println("정수1을 입력해주세요.");
		int numA = sc.nextInt();
		sc.nextLine();
		
		System.out.println("정수2를 입력해주세요.(0제외)");
		int numB = sc.nextInt();
		
		if(numB == 0) {
			System.out.println("0은 입력할 수 없습니다.");
			System.exit(0);
		}
		
		System.out.printf("a / b = %f%n", numA / (double)numB);
		
//		3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
		System.out.println("실수를 입력해주세요.");
		
		double userNum = sc.nextDouble();
		
		System.out.println("입력한 실수의 정수형: " + (int)userNum);
		
//		4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
		System.out.println();
		
		
//		5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.

//		6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
	}

}

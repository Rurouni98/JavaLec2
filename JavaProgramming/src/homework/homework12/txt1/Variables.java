package homework.homework12.txt1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Variables {
	public static void main(String[] args) {
//		1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("나이를 입력해주세요.");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별을 입력해주세요.");
		String gender = sc.nextLine();
		
		System.out.printf("이름: %s%n나이: %d%n성별: %s%n", name, age, gender);
		
//		2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
		int result = cal(sc, 
				(num1, num2, operator) -> {
					if(operator == '+')
						return num1 + num2;
					else if(operator == '-')
						return num1 - num2;
					else if(operator == '*')
						return num1 * num2;
					else if(operator == '/' && num2 != 0)
						return num1 / num2;
					else {
						System.out.println("연산자를 제대로 입력해주세요.");
						return 0;
					}	
				});
		
		System.out.printf("연산결과: %d%n", result);

//		3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
//		    단, 원주율 3.14는 상수로 선언하세요.
		int radius = 20;
		final double pi = 3.14;
		
		double area = 2 * pi * radius * radius;
		double round = 4 * pi * radius;
		
		System.out.printf("넓이: %f%n둘레: %f%n", area, round);
		
//		4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
		int[] intArr = new int[5];
		int sum = 0;
		
		for(int i : intArr) {
			System.out.println("정수를 입력해주세요.");
			i = sc.nextInt();
			sum += i;
		}
		
		System.out.printf("합계: %d, 평균: %f", sum, sum /(double)intArr.length);
		

//		5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			intList.add(sc.nextInt());
		}
		
		List<Integer> sortedList = intList.stream()
										  .sorted()
										  .collect(Collectors.toList());
		
		int max = sortedList.get(0);
		int mid = sortedList.get(1);
		int min = sortedList.get(2);
		
		System.out.printf("최소값: %d, 중간값: %d, 최대값:%d", min, mid, max);
		
//		6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
//				  2 * 2 = 4
//				  .....
//				  2 * 9 = 18 
		System.out.println("보고 싶은 구구단 단수를 입력해주세요.");
		int userNum = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(userNum * i);
		}
		
		
//		7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
		System.out.println("정수를 입력해주세요.");
		userNum = sc.nextInt();
		result = 1;
		
		for(int i = 1; i <= userNum; i++) {
			result *= i;
		}
		
		System.out.println(result);
		
		
//		8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
//		사용자가 입력할 수 있는 값은 2 ~ 30로 제한
		List<Integer> intList2 = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("2 ~ 30 사이의 정수를 입력해주세요.");
			userNum = sc.nextInt();
			
			if(userNum < 2 || userNum > 30) {
				System.out.println("2 ~ 30 사이의 정수를 입력해주세요.");
				i--;
				continue;
			}
			
			for(int j = 2; j < userNum; j++) {
				if(userNum % j == 0)
					intList2.add(userNum);
			}
		}
		
		System.out.println("입력한 정수 중 소수의 개수: " + intList2.size() + "개");
		
	}
	
	public static int cal(Scanner sc, VariablesLambda Calculator) {
		System.out.println("정수를 입력하세요.");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("정수를 입력하세요.");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("연산자를 입력하세요.(+, -, *, / 중 하나)");
		String userStr = sc.nextLine();
		char operator = userStr.charAt(0);
		
		return Calculator.cal(num1, num2, operator);
	}
}

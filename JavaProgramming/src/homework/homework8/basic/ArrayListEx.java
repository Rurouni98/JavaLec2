package homework.homework8.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {
//	3. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 출력하세요.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("정수를 입력해주세요.");
			intList.add(sc.nextInt());
		}
		
		System.out.println(intList);
		
	}

}
